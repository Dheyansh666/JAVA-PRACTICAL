import java.io.*;
import java.util.*;
public class Prac29 {
    public static void main(String[] args) {
        String inp="",line="",word;
        boolean found=false;
        try {
            File f = new File("P29.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            Scanner sc = new Scanner(f);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a word to find");
            inp = s.next();
            word=inp.toLowerCase();
            while(sc.hasNext()){
                line=sc.nextLine();
                if(line.toLowerCase().contains(word)){
                    found =true;
                }
                
            }
            if(found){
                System.out.println("Word found");
            }
            else{
                System.out.println("Word not found");
            }
        } catch (Exception e) {
            
        }
    }
}
