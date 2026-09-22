import java.util.*;
public class Prime
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  a= scanner.nextInt();
        Number obj=new Number();
        obj.isPrime(a);
    }
}
class Number
{
    public void isPrime(int x)
    {
        int count=0;
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(x+" is a prime number");
        }
        else
        {
            System.out.println(x+" is not a prime number");
        }
    }
}

        