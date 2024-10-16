import java.util.*;
class MyThread implements Runnable{
    public void run(){
        System.out.println("Hello World");
    }
}
public class Prac32_2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}
