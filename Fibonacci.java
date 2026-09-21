import java.util.*;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series: ");
        int a= sc.nextInt();
        Number obj = new Number();
        obj.printSeries(a);
    }
}
class Number
{
    public void printSeries(int n)
    {
        int a=0,b=1,c;
        for(int i=1;i<=n;i++)
        {System.out.print(a);
            c=a+b;
            a=b;
            b=c;
        }
        
    
    }
}