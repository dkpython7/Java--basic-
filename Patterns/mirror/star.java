import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int i = 1;
        // while (i <= n) {
            
        //     int space=1;
        //     while (space<=n-i) {
        //         System.out.print(' ');
        //         space++;
        //     }
        //     int j = 1;
        //     while (j <= i) {
        //         System.out.print("*");
        //         j++;
                
        //     }
        //     System.out.println();
        //     i++;
        // }

        while (i <= n) {
            int j = 1;
            while (j <=n-i+1) {
                System.out.print("*");
                j++;         
            }
            System.out.println();
            i++;
            }
    
        }
    }

