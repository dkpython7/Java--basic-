/*
Write a program to generate the reverse of a given number N. Print the corresponding 
reverse number. Note : If a number has trailing zeros, then its reverse will not 
include them. For e.g., reverse of 10400 will be 401 instead of 00401.
 */
import java.util.Scanner;
public class ReverseOFaNo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x= s.nextInt();
        int revNo=0;
        int i= x;
        while (i>0) {
            int lastDigit= i%10;
            i= i/10;
            revNo= revNo*10+lastDigit;
        }
        System.out.println("Reverse of "+x+" is "+revNo);
    }
}
