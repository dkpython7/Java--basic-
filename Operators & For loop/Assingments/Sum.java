/*Write a program that asks the user for a number N and a choice C.
 And then give them the possibility to choose between computing 
the sum and computing the product of all integers in the range 1 to N (both inclusive)*/

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int n= s.nextInt();
        System.out.print("Enter a choice C (1 for sum, 2 for product):");
        int c = s.nextInt();
        if(c==1){
            int sum= 0, i=1;
            while(i<=n){
                sum =sum+i;
            }
            System.out.println("Sum of numbers from 1 to "+n+" is: "+sum);
        }
        else if(c==2) {
            int product= 1, i=1;
            while(i<=n) {
                product *= i;
            }
            System.out.println("Product of numbers from 1 to "+n+" is: "+product);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
    
}