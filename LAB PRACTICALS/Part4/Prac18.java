import java.util.*;
class Member{
    protected
    String name,add;
    int age;
    float sal;
    long num;
    public
    Member(String name, int age, long num, String add, float sal){
        this.name=name;
        this.age=age;
        this.num=num;
        this.add=add;
        this.sal=sal;
    }
    void printSalary(){
        System.out.println("Salary of the employee = " + sal);
    }
}
class Employee extends Member{
    private String specialization;
    Employee(String name, int age, long num, String add, float sal, String specialization){
        super(name,age,num,add,sal);
        this.specialization=specialization;
    }
    void printDetails(){
        System.out.println("Name of Employee:" + name);
        System.out.println("Age of Employee:" + age);
        System.out.println("Phone Number of Employee:" + num);
        System.out.println("Address of Employee:" + add);
        System.out.println("Salary of Employee:" + sal);
        System.out.println("Specialization of Employee:" + specialization);
    }
}
class Manager extends Member{
    private String department;
    Manager(String name, int age, long num, String add, float sal, String department){
        super(name,age,num,add,sal);
        this.department=department;
    }
    void printDetails(){
        System.out.println("Name of Manager:" + name);
        System.out.println("Age of Manager:" + age);
        System.out.println("Phone Number of Manager:" + num);
        System.out.println("Address of Manager:" + add);
        System.out.println("Salary of Manager:" + sal);
        System.out.println("Specialization of Manager:" + department);
    }
}
class Prac18{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String name,location,specialization,department;
        int age,number,salary;
        System.out.println("Enter employee details:-");
        System.out.println("Enter employee name:-");
        name=sc.nextLine();
        System.out.println("Enter employee age:-");
        age=sc.nextInt();
        System.out.println("Enter employee number:-");
        number=sc.nextInt();
        System.out.println("Enter employee location:-");
        location=sc.nextLine();
        System.out.println("Enter employee salary:-");
        salary=sc.nextInt();
        System.out.println("Enter employee specialization:-");
        specialization=sc.nextLine();

        Employee e = new Employee(name,age,number,location,salary,specialization);


        System.out.println("Enter manager details:-");
        System.out.println("Enter manager name:-");
        name=sc.nextLine();
        System.out.println("Enter manager age:-");
        age=sc.nextInt();
        System.out.println("Enter manager number:-");
        number=sc.nextInt();
        System.out.println("Enter manager location:-");
        location=sc.nextLine();
        System.out.println("Enter manager salary:-");
        salary=sc.nextInt();
        System.out.println("Enter manager department:-");
        department=sc.nextLine();

        Manager m = new Manager(name,age,number,location,salary,department);
        
        e.printDetails();
        System.out.println("-------------------------------");
        m.printDetails();
    }
}