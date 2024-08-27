import java.util.Scanner;

public class numbers {
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
            int p = i;
            while (num <= i) {
                System.out.print(p);
                num++;
                p++;
            }
            
            int dec = i-1;
            int q= 2*i-2;
            while (dec >= 1) {
                System.out.print(q);
                q--;
                dec--;
            }
            System.out.println();
            i++;
            

        }
    }
}
