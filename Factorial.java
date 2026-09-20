import java.util.*;
public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        Number obj=new Number();
        System.out.println("Factorial is " + obj.fact(n));
    }
}
class Number 
{
    public int fact(int n)
    {
       int f=1;
       for(int i=1;i<=n;i++)
       {
        f=f*i;
       }
       return f;    
    }
}