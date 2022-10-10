package classesandObjects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){

        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {

        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i <= smaller; i++){
            if(numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    public void print(){
        System.out.println(numerator +"/" + denominator);
    }

    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }
    //getters and setters of numerator && denominator

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getNumerator(){
        return numerator;
    }

    public void setDenominator(int denominator){
        if(denominator == 0){
            //throw error
            return;
        }
        this.denominator = denominator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void add(Fraction f2) {
        //first fraction is the fraction on which the argument is called
        //second function is passed as argument
        this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2){
        int newNum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNum, newDeno);
        return f3;
    }

    public static Fraction sub(Fraction f1, Fraction f2){
        int newNum = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f4 = new Fraction(newNum, newDeno);
        return f4;
    }

    public static Fraction multiply(Fraction f1, Fraction f2){
        int newNum = f1.numerator * f2.numerator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f5 = new Fraction(newNum, newDeno);
        return f5;
    }
}
