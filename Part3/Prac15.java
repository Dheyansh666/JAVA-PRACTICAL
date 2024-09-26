import java.util.*;
class Area
{
    float l,b;
    Area()
    {
        l=0;
        b=0;
    }
    Area(float l, float b)
    {
        this.l=l;
        this.b=b;
    }
    float returnArea()
    {
        return l*b;
    }
}
class Prac15{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float ans;
        System.out.println("Enter value of lenght of rectangle:");
        float p =sc.nextFloat();
        System.out.println("Enter value of width of rectangle:");
        float q=sc.nextFloat();
        Area a =new Area(p,q);
        ans=a.returnArea();
        System.out.println("Area of rectangle is =" + ans);

    }
}
