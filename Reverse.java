import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Number obj = new Number();
        obj.reverseNumber(n);
    }
}

class Number
{
    public void reverseNumber(int n)
    {
        int rev = 0;

        while(n != 0)
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);
    }
}