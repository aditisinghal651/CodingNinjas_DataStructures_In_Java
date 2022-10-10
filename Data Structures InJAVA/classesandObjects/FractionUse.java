package classesandObjects;

public class FractionUse {

    public static void main(String args[]){
        Fraction f1 = new Fraction(2, 3);
        f1.print();
        //f1.increment();
        //f1.print();
        Fraction f2 = new Fraction(1, 4);
        f2.print();
        //f1.add(f2);
        //f1.print();

        Fraction f3 = Fraction.add(f1,f2);
        f3.print();
        Fraction f4 = Fraction.sub(f1,f2);
        f4.print();
        Fraction f5 = Fraction.multiply(f1,f2);
        f5.print();
    }
}
