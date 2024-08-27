/*Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary 
number can exceed the integer range. So you may want to take the answer as
 long for CPP and Java.
 */
import java.util.Scanner;

public class decimalToBinary {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int n= s.nextInt();
        int bNo=0;
        int power= 1;
        int i=n;
        while(i>0){
            int re= i%2;
            bNo += re*power;
            power *=10;
            i=i/2;
        }
        System.out.println("Binary number of "+ n +" is "+bNo);
    }
}
