import java.util.Scanner;
public class AllprimeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int i= 2;
       
        for(i= 2; i<=n;i++){
            boolean isPrime = true;
            for(int j = 2; j<i; j++){
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
