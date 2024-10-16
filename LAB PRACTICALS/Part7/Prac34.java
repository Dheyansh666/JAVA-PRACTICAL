import java.util.*;
class thread1 extends Thread{
    public void run(){
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
        int  x = rand.nextInt(100);
        try {
            thread1.sleep(1000);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        } 
        if(x%2==0){
            new thread2(x).start();
        }
        else{
            new thread3(x).start();
        }
        }
        
    }
}
class thread2 extends Thread{
int num;
        public thread2(int n) {
            num=n;
        }
    
    public void run(){
        num=num*num;
        System.err.println("The square is " + num);
    }
    }
class thread3 extends Thread{
int num;
    public thread3(int n) {
        num=n;
    }
    
    public void run(){
        num=num*num*num;
        System.out.println("The cube is "+ num);
    }
}
public class Prac34{
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
    }
}