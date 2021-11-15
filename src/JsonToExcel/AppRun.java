package JsonToExcel;


public class AppRun {
    public static void main(String args[]) {
        Logic log = new Logic();
        log.readTheJsonFile();
        log.generateExcelFile();
    }
}