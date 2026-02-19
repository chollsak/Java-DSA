package Algorithm.Recursion;

public class Factorial {
    public static void main(String[] args){
        int fac = factorial(10);
        System.out.println(fac);
    }

    public static int factorial(int number){
        if(number < 1) return 1; //base case
        return number * factorial(number - 1); //recursive case
    }
}
