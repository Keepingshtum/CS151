import java.io.*;
import java.util.StringTokenizer;

public class RafaelJimenez
{
    public static void main (String[] args)
    {
        StringBuffer str = new StringBuffer("This is a palindrome - step on no pets");
        System.out.println("The original string is: " + str);

        str.reverse();
        System.out.println("The string reversed is: " + str);
    }
}
