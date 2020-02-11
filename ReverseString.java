import java.util.Scanner;
public class ReverseString
{
    String x="strings";
    char[]y=x.toCharArray();
    int i,j;
    void reverse()
    {
        for(int i=y.length-1;i>=0;i--)
        {
            System.out.println(y[i]);

        }
    }
    public static void main(String[]args)
    {
        ReverseString obj=new ReverseString();
        obj.reverse();
    }
}

