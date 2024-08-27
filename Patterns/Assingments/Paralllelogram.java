// package Assingments;
import java.util.Scanner;
public class Paralllelogram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int n = s.nextInt();
        int i = 1;
        while (i<=n) {
            int space=1;
            while(space<i){
                System.out.print(" ");
                space++;
            }
            int j= 1;
            while (j<=n) {
                System.out.print('*');
                j++;
            }
            
            System.out.println();
            i++;
        }
    }
}
