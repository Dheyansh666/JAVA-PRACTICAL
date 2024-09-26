import java.util.*;
class Prac3
{
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    int hrs,min,sec;
    System.out.println("Enter the total distance traveled in meters");
    float distance=sc.nextFloat();
    System.out.println("Enter the time in hrs:");
    hrs=sc.nextInt();
    System.out.println("Enter the time in min:");
    min =sc.nextInt();
    System.out.println("Enter the time in sec:");
    sec=sc.nextInt();
    float time= hrs*3600 + min*60 + sec;
    System.out.println("Speed in m/sec= "+ (distance)/time + "m/sec");
    time= hrs + min/60 + sec/3600;
    System.out.println("Speed in km/hrs= "+ (distance/1000)/time + "km/hrs");
    distance=distance/1609;
    System.out.println("Speed in M/hrs= "+ (distance)/time + "M/hrs");
    }
    
}