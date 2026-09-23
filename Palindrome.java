import java.util.*;
public class Palindrome
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  a= scanner.nextInt();
        Number obj=new Number();
        obj.isPalindrome(a);
    }
}
class Number
{
    public void isPalindrome(int n)
    {
        int sum= 0;
        int temp= n;
        while (n!= 0)
        {
            int r= n % 10;
            sum=sum* 10 + r;
            n /= 10;
        }
        if (temp==sum)
        {
            System.out.println(temp + " is a palindrome.");
        }
        else
        {
            System.out.println(temp + " is not a palindrome.");
        }
    
    }
}
