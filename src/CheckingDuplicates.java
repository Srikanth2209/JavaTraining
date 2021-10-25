
import java.util.*;

class CheckingDuplicates
{
    public static void countDuplicateCharacters(String str)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char c : charArray)
        {
            if (map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
            else
            {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times in the given String");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = myObj.nextLine();
        countDuplicateCharacters(str);
    }
}