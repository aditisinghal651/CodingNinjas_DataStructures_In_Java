package recursion;

public class Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int smallOutput = fact(n-1);
        int output = n * smallOutput;
        return output;

    }

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int smallOutput = sum(n - 1);
        int output = n + smallOutput;
        return output;
    }

    public static void main(String args[]){
        System.out.println(fact(5));
        System.out.println(sum(10));
    }
}
