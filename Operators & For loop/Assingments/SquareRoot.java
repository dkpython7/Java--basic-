/*Given a number N, find its square root. You need to find and print only
 the integral part of square root of N.For eg. if number given is 18, answer is 4. */

 import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s.nextInt();
        int sqRt=0;
        while (sqRt*sqRt<=n) {
            sqRt+=1;
        }
        sqRt -=1;
        System.out.println("Squre root of "+n+" is "+ sqRt);
    }
}
