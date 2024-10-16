package Part6;
import java.io.File;
import java.util.Scanner;
public class Prac27{
    public static void main(String[] args) {
        int a=0,a1=0,a2=0;
        try{
            File f = new File("Part6/Untitled.txt");
            File f1 = new File("Part6/Untitled1.txt");
            File f2 = new File("Part6/Untitled2.txt");
            if(f.exists() && f1.exists() && f2.exists()){
                
            }
            else{
                f.createNewFile();
                f1.createNewFile();
                f2.createNewFile();
            }
            Scanner sc = new Scanner(f);
            Scanner sc1 = new Scanner(f1);
            Scanner sc2 = new Scanner(f2);
            while(sc.hasNextLine()){
                sc.nextLine();
                a++;
            }
            sc.close();
            while(sc1.hasNextLine()){
                sc1.nextLine();
                a1++;
            }
            sc.close();
            while(sc2.hasNextLine()){
                sc2.nextLine();
                a2++;
            }
            sc.close();
            sc1.close();
            sc2.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("The file has "+ a + " number of lines.");
        System.out.println("The file1 has "+ a1 + " number of lines.");
        System.out.println("The file2 has "+ a2 + " number of lines.");
    }
}