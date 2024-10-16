import java.util.*;
class myThread extends Thread{
    public void run(){
            System.out.println("Hello World");
    }}
public class Prac32_1{
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();
        
    }
}
