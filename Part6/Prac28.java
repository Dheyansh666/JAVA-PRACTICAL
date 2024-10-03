package Part6;
import java.io.File;
import java.util.Scanner;

public class Prac28 {
    public static void main(String[] args) {
        int a=0;
        try{
            File f = new File("Part6/Untitled.txt");
            if(f.exists()){
                
            }
            else{
                f.createNewFile();
            }
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){

                a++;
            }
            
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("The file has "+ a + " number of lines.");
}
}