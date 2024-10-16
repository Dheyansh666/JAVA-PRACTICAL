package Part6;
import java.util.*;
import java.io.*;

public class Prac30 {
    public static void main(String [] args){
        try{
            FileReader fin = new FileReader("P30_1.txt");
            FileWriter fout = new FileWriter("P30_2.txt");
            String a="";
            Scanner sc = new Scanner(fin);
            while(sc.hasNextLine()){
                a=sc.nextLine();
                fout.write(a);
            }
            fin.close();
            fout.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }    
}
