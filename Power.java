import java.util.*;
public class Power
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a= sc.nextInt();
        System.out.print("Enter power: ");
        int b= sc.nextInt();
        Number obj = new Number();
        System.out.println(a + " raised to the power " + b + " is: " + obj.find(a, b));
    }
}

class Number
{
    public int find(int x, int y)
    {
        int pow= 1;
        for(int i = 1; i <= y; i++)
        {
            pow=pow*x;
        }
        return pow;
    }
}
