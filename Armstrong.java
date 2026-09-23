import java.util.*;
public class Armstrong
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  a= scanner.nextInt();
        Number obj=new Number();
        obj.isArmstrong(a);
    }
}
class Number
{
    public void isArmstrong(int n)
    {
        int sum = 0,temp=n;
        while (n!= 0) 
        {
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        {
        
            if (sum==temp)
            {
                System.out.println(temp + " is an Armstrong number");
            }
            else
            {
                System.out.println(temp + " is not an Armstrong number");
            }
        }
    }
}
