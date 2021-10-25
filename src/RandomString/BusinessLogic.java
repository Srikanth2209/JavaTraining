package RandomString;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BusinessLogic implements Declar
{
    @Override
    public String getString(int n)
    {

        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(n);
        for(int i = 0;i < n;i++)
        {
            //for(int j = 0;j < i;j++)
            //{
            int index = (int) (string.length() * Math.random());
            sb.append(string.charAt(index));
            //}
        }
        return sb.toString();
    }
    @Override
    public void Result()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number of lines you want to print");
        int n = 100;
        int NumOfLines=sc.nextInt();
        if (NumOfLines > 0 && NumOfLines<231)
        {
            FileWriter MyWriter;
            try {
                MyWriter = new FileWriter("C:\\Users\\HP\\Desktop\\ATMECS\\RD.txt");
                for (int i = 1; i <= NumOfLines; i++) {
                    System.out.println(getString(n));
                    MyWriter.write(" " + getString(n) + "\n");
                }
                MyWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("NumOfLines should be lessthan 231");
            Result();
        }
    }
}