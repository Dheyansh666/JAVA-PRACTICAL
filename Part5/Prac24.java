import java.util.*;
class Prac24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter number1:");
        x=sc.nextInt();
        System.out.println("Enter number2:");
        y=sc.nextInt();
        try {
            z=x/y;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}