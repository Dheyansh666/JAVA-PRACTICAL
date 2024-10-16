import java.util.*;
class Prac7
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        String s="",a="";
        System.out.println("Enter an input string:");
        s=sc.nextLine();
        a=s.substring(0,3);
        System.out.println("Enter number of times to copy");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(a);
        }
    }
}