package classesandObjects;

public class ComplexNum {
    private int real;
    private int imaginary;

    public ComplexNum(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    //print the complex num
    public void print(){
        System.out.println(real + " + i"+ imaginary);
    }

    //Add two complex num
    public void add(ComplexNum c2){
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    //Multiply two complex num
    public void multiply(ComplexNum c2){
        int real = this.real;
        int imaginary = this.imaginary;
        this.real = (real * c2.real) - (imaginary * c2.imaginary);
        this.imaginary = (real * c2.imaginary) + (imaginary * c2.real);
    }
}
