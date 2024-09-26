

class Shape{
    void print(){
        System.out.println("This is shape");
    }
    
     
}
class Rectangle extends Shape{
    void printr(){
        System.out.println("This is rectangular shape");
    }
    
}
class Square extends Rectangle{
    void printsq(){
        System.out.println("Square is a rectangle");
    }
    
}
class circle extends Shape{
    
    void printc(){
        System.out.println("This is circular shape");
    }
    
}
public class Prac20 {
    public static void main(String[] args) {
        Square s = new Square();
        s.printsq();
        s.printr();
        s.print();
    }
}
