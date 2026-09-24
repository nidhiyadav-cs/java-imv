import java.util.*;
public class Strong
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  a= scanner.nextInt();
        Number obj=new Number();
        obj.isStrong(a);
    }
}
class Number
{
    public void isStrong(int n)
    {
        int sum = 0;
        int temp = n;
        while (n != 0)
        {
            int r = n % 10;
            int fact = 1;
            for (int i = 1; i <= r; i++)
            {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if (temp == sum)
        {
            System.out.println(temp + " is a strong number.");
        }
        else
        {
            System.out.println(temp + " is not a strong number.");
        }
    }
}
