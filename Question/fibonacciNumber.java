// package Question;
import java.util.Scanner;
public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s.nextInt();
        int fibo = 0;
        int a= 1;
        int b;
        for (int i=1; i<=n;i++){
            System.out.println(fibo);
            b= fibo+a;
            fibo=a;
            a=b;
            
        }
        System.out.println("fibonacci is "+fibo);
    }
}