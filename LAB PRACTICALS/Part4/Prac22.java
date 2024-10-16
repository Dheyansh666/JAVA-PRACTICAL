import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    int sum=0;
    public int divisor_sum(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    
}
public class Prac22
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,ans;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        MyCalculator obj = new MyCalculator();
        ans=obj.divisor_sum(n);
        System.out.println("The sum of divisor of "+ n + " is "+ ans);
    }
}