import java.util.Scanner;
public class stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            
            int space=1;
            while (space<=n-i) {
                System.out.print(' ');
                space++;
            }
            int num = 1;
            while (num <= i) {
                System.out.print('*');
                num++;
            }
            
            int dec = i-1;
            while (dec >= 1) {
                System.out.print('*');
                dec--;
            }
            System.out.println();
            i++;
            

        }
    }
}