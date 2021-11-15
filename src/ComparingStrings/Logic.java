
package ComparingStrings;

        import org.json.JSONException;
        import org.json.JSONObject;

        import java.io.*;
        import java.util.Scanner;

public class Logic implements InterfaceClass {

    int wordCount = 0;
    @Override
    public void FileReader() throws IOException, JSONException {

        File file1 = new File("C:\\Users\\HP\\Desktop\\FileReaders\\file1.txt");

        File file2 = new File("C:\\Users\\HP\\Desktop\\FileReaders\\file2.txt");
        FileReader r1 = new FileReader(file1);
        FileReader r2 = new FileReader(file2);
        BufferedReader reader1 = new BufferedReader(r1);
        BufferedReader reader2 = new BufferedReader(r2);
        String str1 = reader1.readLine();
        String str2 = reader2.readLine();
        char[] arr = str1.toCharArray();
        boolean areEqual = false;
        int LineCount = 1;
        while (str1 != null && str2 != null)
        {
            if (str1.equalsIgnoreCase(str2))
            {
                areEqual = true;
                LineCount++;
                for (char c : arr) {
                    if (c == ' ') {
                        wordCount++;
                    }
                }

            } else {
                areEqual = false;
                break;
            }
            str1 = reader1.readLine();
            str2 = reader2.readLine();
            wordCount++;
        }

        if (areEqual)
        {
            System.out.println("Both Files Content is same:");
            JsonFile();

        } else {
            System.out.println("Both Files content is not same at Line Number "+LineCount);
        }

    }
    @Override
    public void JsonFile() throws IOException, JSONException {
        JSONObject obj = new JSONObject();
        FileWriter MyWriter = new FileWriter("C:\\Users\\HP\\Desktop\\FileReaders\\out.json");
        MyWriter.write(String.valueOf(obj.put("Words"," No.Of words  "+wordCount)));
        System.out.println("Words"+" No.Of words "+wordCount+"  ");
        //System.out.println("Please refer json file for number of words in the file");
        MyWriter.flush();
        MyWriter.close();
    }
}