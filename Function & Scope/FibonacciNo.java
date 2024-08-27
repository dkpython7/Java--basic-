import java.util.Scanner;
public class FibonacciNo {
    public static int Fibonacci(int fibo) {
        if (fibo == 0) {
            return 0;
        }
        else if (fibo == 1) {
            return 1;
        }
        else{
            return Fibonacci(fibo-1)+ Fibonacci(fibo-2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci of " + i + " is " + Fibonacci(i));
        }
    }
}
