import java.util.Scanner;
public class HalfDiamondPatten {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int n = s.nextInt();
        int i= 1;
        // First half
        System.out.println('*');
        while (i<=n) {
            System.out.print('*');
            int up= 1;
            while (up<=i) {
                System.out.print(up);
                up++;
           }
           int j= up-2;
           while (j>=1) {
            System.out.print(j);
            j--;
           }
            
           System.err.println("*");
            i++;
        }
        // Second half
        i=1;
        while (i<=n-1) {
            System.out.print('*');
            int down= 1;
            while (down<= n-i) {
                System.out.print(down);
                down++; 
            }
            int j= down - 2;
            while (j>=1) {
                System.out.print(j);
                j--; 
            }
            System.out.println("*");
            i++;
        } System.out.print('*');
    }
}
