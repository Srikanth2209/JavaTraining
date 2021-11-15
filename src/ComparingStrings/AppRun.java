
package ComparingStrings;

        import org.json.JSONException;

        import java.io.IOException;

public class AppRun
{
    public static void main(String[] args) throws JSONException, IOException {
        InterfaceClass IC = new Logic();
        IC.FileReader();
        IC.JsonFile();
    }
}
