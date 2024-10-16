import java.util.*;
class Prac26{
    public static void eligible(int age){
        if(age<18){
            throw new ArithmeticException("You are not eligible");
        }
            else{
                System.out.println("You are eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        try {
            eligible(age);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}