import java.util.Scanner;
public class SumPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = s.nextInt();
        int i= 1;
        int sum = 0;
        while (i <= n){
            sum = sum + i;
            int j=1;
            while (j<=i) {
                System.out.print(j);
                if (j==i){
                    System.err.print("=");
                }
                else{
                    System.out.print("+");
                }
                j++;
            }
            System.out.println(sum);
            
            i++;
        }
    }
}