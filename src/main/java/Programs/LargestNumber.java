package Programs;

public class LargestNumber
{
    public static void main(String[] args)
    {
       int list[] = {11,22,45,92,21,54,79,11};
       int Largest = 0;
       int SecondLargest = 0;
       for(int i=0;i< list.length;i++)
       {
           if(list[i]>Largest)
           {
               //SecondLargest = Largest;
               Largest = list[i];
           }
           else if(list[i]>SecondLargest)
           {
               SecondLargest = list[i];
           }
       }
       System.out.println(Largest);
       System.out.println(SecondLargest);

    }

}
