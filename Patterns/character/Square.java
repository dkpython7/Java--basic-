//package character;

import java.util.Scanner;

public class Square {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int i = 01;
        // while (i <= n) {
        //     int j = 1;
        //     char ch= 'A';
        //     while (j <= n) {
        //         System.out.print((char)(ch+i-1));
        //         ch++;
        //         j++;

        //     }
        //     System.out.println();
        //     i++;
        // } 
        // while (i <= n) {
        //     int j = 1;
        //     char ch= 'A';
        //     while (j <= i) {
        //         System.out.print((char)(ch+i-1));
        //         ch++;
        //         j++;

        //     }
        //     System.out.println();
        //     i++;
        // }

        while (i <= n) {
            int j = 1;
            char ch= (char)('A'+n-i);
            while (j <= i) {
                System.out.print((char)(ch +j-1));
                j++;

            }
            System.out.println();
            i++;
        }
    }
}
