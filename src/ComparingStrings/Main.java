
package ComparingStrings;


        import org.json.JSONException;

        import java.io.IOException;
        import java.util.Scanner;

class Main
{
    public void Start() throws IOException, JSONException {
        Scanner sc = new Scanner(System.in);
        Logic logicClass = new Logic();
        System.out.println("Please Enter key 1 :");
        System.out.println("To Compare two files content");
        int number = sc.nextInt();
        switch (number)
        {
            case 1:
                logicClass.FileReaderMethod();
                break;
            default:
                System.out.println("invalid key  :");
                Start();
        }


    }

}