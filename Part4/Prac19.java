import java.util.*;
class Rectangle{
    float length, breadth,area;
    public
    Rectangle(float l, float b){
        length=l;
        breadth=b;
    }
    void Area(float l, float b)
    {
        area=(l*b);
        System.out.println("Area of rectangle =" + area);
    }
    void Perimeter(float l , float b)
    {
        area=2*(l+b);
        System.out.println("Area of rectangle =" + area);
    }
}
class Square extends Rectangle{
    Square(float s){
        super(s,s);
    }
    void Area(float s)
    {
        area=s*s;
        System.out.println("Area of rectangle =" + area);
    }
    void Perimeter(float s)
    {
        area=4*s;
        System.out.println("Area of rectangle =" + area);
    }
}
public class Prac19{
    public static void main(String args[]){
        float a,b;
        int choice;
        Scanner sc = new Scanner(System.in);
        Rectangle[] r = new Rectangle[3];
        Square[] s = new Square[3];
        System.out.println("Enter 1 for rectangle and 2 for square");
        choice=sc.nextInt();
        if(choice==1){
        for(int i=0;i<3;i++)
        {
            
                System.out.println("Enter length and breadth of rectangle");
                a=sc.nextFloat();
                b=sc.nextFloat();
                r[i]=new Rectangle(a,b);
                r[i].Area(a,b);
                r[i].Perimeter(a, b);
        }
        }
        else{
            for(int i=0;i<3;i++)
            {
            System.out.println("Enter side of square");
            a=sc.nextFloat();
            s[i]=new Square(a);
            s[i].Area(a);
            s[i].Perimeter(a);
            }
                
        }

    }
}
