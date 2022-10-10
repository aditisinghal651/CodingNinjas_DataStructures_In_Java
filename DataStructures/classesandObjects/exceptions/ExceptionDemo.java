package classesandObjects.exceptions;

public class ExceptionDemo {

    public static int fact(int n) throws NegativeNumberException {
        if(n < 0){
            throw new NegativeNumberException();
        }
        int ans = 1;
        for(int i = 2; i <= n; i++){
            ans = ans * i;
        }
        return ans;
    }

    public static int divide(int a, int b) throws DivideByZeroException {
        if(b == 0){
            throw new DivideByZeroException();
            //throw new ArithmeticException();
        }
        System.out.println(a/b);
        return a / b;
    }

    //pass exception
//    public static void main(String args[]) throws DivideByZeroException {
//        divide(100, 0);
//    }

    //handle exception in main
    public static void main(String args[]){
        try {
            divide(100, 0);
            System.out.println(fact(2));
            System.out.println("Within Try");
        } catch (DivideByZeroException e) {
            System.out.println("Divide by Zero Exception raised.");
            //e.printStackTrace();
        } catch (NegativeNumberException e) {
            System.out.println("Negative Number Exception raised.");
            //e.printStackTrace();
        } catch (Exception e){
            System.out.println("Generic Exception.");
        }finally {
            System.out.println("Finally Block execution.");
        }
        System.out.println("Main");
    }

}
