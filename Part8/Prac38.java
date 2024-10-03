package Part8;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac38 {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>(10);
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter \n1) Push \n2) Pop \n3)Display \n4) Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (alist.size() < 10) {
                        System.out.println("Enter value to add:");
                        int val = sc.nextInt();
                        alist.add(val);
                    } else {
                        System.out.println("Overflow");
                    }
                    break;

                case 2:
                    if (!alist.isEmpty()) {
                        int removedValue = alist.remove(alist.size() - 1);
                        System.out.println("Popped value: " + removedValue);
                    } else {
                        System.out.println("Underflow");
                    }
                    break;
                case 3:
                    System.out.println(alist);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;


                default:
                    System.out.println("Wrong Input");
            }

        }
    }
}
