/* Write a program to print first x terms of the series 3N + 2 
which are not multiples of 4.*/
import java.util.Scanner;
public class TermsOfAp {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x= s.nextInt();
        int i=1;
        while (i<=x) {
            int n=(3*i+2); 
            if(n%4!=0){
                System.out.print(n+" ");
            }
            i++;
        }
    }
}
