import java.util.*;
public class Prac12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amt,value;
        System.out.println("Enter the value in pounds");
        amt=sc.nextFloat();
        value=amt*100;
        System.out.println(amt +" pounds = "+ value + " Ruppes");
    }
}