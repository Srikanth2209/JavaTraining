package ReadingData;


import jxl.Sheet;
        import jxl.Workbook;
        import jxl.read.biff.BiffException;
        import org.json.JSONObject;
        import java.io.*;


public class ReadingDataFromXLS
{
    public static void main(String[] args) throws IOException, BiffException {
        File f = new File("C:\\Users\\HP\\Desktop\\FileReaders\\student1.xls");
        FileInputStream fis = new FileInputStream(f);
        Workbook w = Workbook.getWorkbook(fis);
        Sheet s = w.getSheet("Sheet1");

        FileWriter MyWriter = new FileWriter("C:\\Users\\HP\\Desktop\\FileReaders\\studentData2.json");
        for (int j = 1; j < s.getRows(); j++) {
            JSONObject obj = new JSONObject();
            obj.put(s.getCell(0, 0).getContents(), s.getCell(0, j).getContents());
            obj.put(s.getCell(1, 0).getContents(), s.getCell(1, j).getContents());
            obj.put(s.getCell(2, 0).getContents(), s.getCell(2, j).getContents());
            MyWriter.write(obj.toString());
            MyWriter.write("\n");
            MyWriter.flush();
        }
    }
}

