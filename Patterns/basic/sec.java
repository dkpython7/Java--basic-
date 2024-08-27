
import java.util.Scanner;
public class sec {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.err.print("Enter a number:  ");
    int n = s.nextInt();
    int i = 1;
    while (i <= n) {
        int j= 1;
        int p = 0;
        while (j<=n) {
            System.out.print(p+i);
            j++;
            p++;
        }
        System.out.println();
        i++;
   } 
}
}