
// package Patterns;
import java.util.Scanner;
public class tringular {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= s.nextInt();
        int i= 1;  
        while (i<=n) {
            // int p = i;
            int j= i;
            while (j>=1) {
                System.out.print(j+"\t");
                // p++;
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
