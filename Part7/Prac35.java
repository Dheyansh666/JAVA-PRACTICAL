class thread extends Thread{
    public void run(){
        try {
             for(int i=1;i<=10;i++){
                System.out.println(i);
                thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}
public class Prac35{
    public static void main(String args[]){
        thread t = new thread();
        t.start();
    }
}