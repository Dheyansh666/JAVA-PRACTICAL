import java.util.*;
class Complex
{
    float real,imaginary;
    
    Complex()
    {
        real=0;
        imaginary=0;
    }
    Complex(float r, float i)
    {
        this.real=r;
        this.imaginary=i;
    }
    Complex add(Complex x1, Complex x2)
    {
        Complex x=new Complex();
        x.real= real=x1.real + x2.real;
        x.imaginary=x1.imaginary + x2.imaginary;
        return x;
    }
    Complex sub(Complex x1, Complex x2)
    {
        Complex x=new Complex();
        x.real=x1.real - x2.real;
        x.imaginary=x1.imaginary - x2.imaginary;
        return x;
    }
    Complex mul(Complex x1, Complex x2)
    {
        Complex x=new Complex();
        x.real = (x1.real*x2.real)-(x1.real*x2.imaginary);
        x.imaginary = (x.real*x2.imaginary)-(x1.imaginary*x2.real);
        return x;
    }
}
public class Prac16
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int choice=0;
        float p=0,q=0,r=0,s=0;
        System.out.println("Enter real value of x1:");
        p=sc.nextFloat();
        System.out.println("Enter imaginary value of x1:");
        q=sc.nextFloat();
        Complex a = new Complex(p,q);
        System.out.println("Enter real value of x2:");
        r=sc.nextFloat();
        System.out.println("Enter imaginary value of x2:");
        s=sc.nextFloat();
        Complex b = new Complex(r,s);
        Complex c = new Complex();
        System.out.println("Enter \n 1).Addition \n 2).Subtraction \n 3).Multiplication");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                Complex ans=c.add(a,b);
                System.out.println("Result= " + ans.real +  "+" + ans.imaginary + "i");
                break;
            case 2:
                ans=c.sub(a,b);
                System.out.println("Result= " + ans.real  + "+" + ans.imaginary + "i");
                break;
            case 3:
                ans=c.mul(a,b);
                System.out.println("Result= " + ans.real  + "+" + ans.imaginary + "i");
                break;
        }
    }
}