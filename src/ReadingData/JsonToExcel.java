package ReadingData;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.WritableWorkbookImpl;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class JsonToExcel
{
    public static void main(String[] args) throws IOException, ParseException, WriteException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\FileReaders\\jsotoxl.xls");
        WritableWorkbook writableWorkbook= Workbook.createWorkbook(fileOutputStream);
        WritableSheet writableSheet = writableWorkbook.createSheet("content",0);
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("C:\\Users\\HP\\Desktop\\FileReaders\\studentData2.json"));
        JSONObject jsonObject = (JSONObject) obj;
        String Mar = (String) jsonObject.get("Name");
        String Ag = (String) jsonObject.get("Age");
        String Tm = (String) jsonObject.get("Total_Marks");

        Label l1 = new Label(0,1,Mar);
        Label l2 = new Label(1,1,Ag);
        Label l3 = new Label(2,1,Tm);
        writableSheet.addCell(l1);
        writableSheet.addCell(l2);
        writableSheet.addCell(l3);
        writableWorkbook.write();
        writableWorkbook.close();

    }
}
