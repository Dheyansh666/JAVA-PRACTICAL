class parent{
    public
    void printp(){
        System.out.println("This is parent class");
    } 
}
class child extends parent{
    public
    void printc(){
        System.out.println("This is child class");
    } 
}
class Prac17{
    public static void main(String args[]){
        child c = new child();
        c.printp();
        c.printc();

    }
}