package classesandObjects;

import java.util.Scanner;

public class ComplexNumUse {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();

        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();

        ComplexNum c1 = new ComplexNum(real1, imaginary1);
        ComplexNum c2 = new ComplexNum(real2, imaginary2);

        int choice = sc.nextInt();

        if(choice == 1){
            //Add
            c1.add(c2);
            c1.print();
        }else if(choice == 2){
            //Multiply
            c1.multiply(c2);
            c1.print();
        }else{
            return;
        }
    }

}
