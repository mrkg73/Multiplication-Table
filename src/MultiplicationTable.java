import java.util.Scanner;

public class MultiplicationTable
{
    public static void main (String[] args)
    {
        Scanner src = new Scanner(System.in);
        System.out.println("Please enter you number:");
        int num = src.nextInt();

        for (int i=1; i<11 ;i++)
        {
            System.out.println(num +" X" + i +"="+num*i);

        }



    }
}
