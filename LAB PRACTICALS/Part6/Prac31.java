package Part6;
import java.util.*;
import java.io.*;

public class Prac31 {
    public static void main(String[] args) {
        try{
            String s="";        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw= new BufferedWriter(new FileWriter("P31.txt"));
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a string :-");
            while(!(s=br.readLine()).equalsIgnoreCase("exit")){

                bw.write(s);
                bw.newLine();
            }

            br.close();
            bw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
