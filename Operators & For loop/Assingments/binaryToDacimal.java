/*Given a binary number as an integer N, convert it into decimal and print. */
import java.util.Scanner;

public class binaryToDacimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int n= s.nextInt();
        int dNo=0;
        int power= 1;
        while(n>0){
            int lastDigit= n%10;
            dNo += lastDigit*power;
            power *=2;
            n=n/10;
        }
        System.out.println("Decimal number of "+n+" is "+dNo);
    }
}
