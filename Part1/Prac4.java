import java.util.*;
class Prac4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int month,days;
        System.out.println("Enter the number of month");
        month = sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            days=31;
        }
        else if(month==4||month==6||month==9||month==11)
        {
            days = 30;
        }
        else{days = 28;}

        float expense[]=new float[31];
        float total=0;
        System.out.println("Enter the expense of day");
        for(int i=0;i<days;i++)
        {
            System.out.println("Day-"+(i+1)+":-");
            expense[i]=sc.nextFloat();
        }
        for(int i=0;i<days;i++)
        {
            total= total + expense[i];
        }
        System.out.println("Total expense of the month =$"+total);
    }
}