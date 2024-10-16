import java.util.*;
class Prac5
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int code[]=new int [10],a=1;
        float tax[]=new float[10],price[]=new float[10],p;
        String product[]=new String[10];
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the name of product");
            product[i] = sc.nextLine();
            
            switch(product[i])
            {
                case "motor":
                    code[i]=1;
                    tax[i]=8;
                    
                    break;
                case "fan":
                    code[i]=2;
                    tax[i]=12;
                    break;
                case "tubelight":
                    code[i]=3;
                    tax[i]=5;
                    break;
                case "wire":
                    code[i]=4;
                    tax[i]=7.5f;
                    break;
                case "other":
                    code[i]=5;
                    tax[i]=3;
                    break;
            }
            p=500;
            price[i] = p + (p * tax[i])/100;
            float total=0;
            total+=price[i];
        }
            
        for(int i=0;i<5;i++)
        {
        System.out.println("Product:"+ product[i]);
        System.out.println("Code:"+ code[i]);
        System.out.println("Price:"+price[i]);
        }  
    }
}