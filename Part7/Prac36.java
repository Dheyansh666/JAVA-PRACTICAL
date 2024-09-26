class thread extends Thread{
    thread(String tname){
        super(tname);
    }
    public void run(){
        System.out.println("Name of the thread is " + Thread.currentThread().getName());
        System.out.println("Priority of the thread is " + Thread.currentThread().getPriority());
       
    }
}
public class Prac36{
    public static void main(String[] args) {
        thread FIRST = new thread("FIRST");
        FIRST.setPriority(3);
        thread SECOND = new thread("SECOND");
        SECOND.setPriority(5);
        thread THIRD = new thread("THIRD");
        THIRD.setPriority(7);
        FIRST.start();
        SECOND.start();
        THIRD.start();
    }
}