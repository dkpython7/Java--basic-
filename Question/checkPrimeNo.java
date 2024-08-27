import java.util.Scanner;

public class checkPrimeNo {
    public static boolean checkPrime1(int n){
        int div= 2;
    while(div <= n-1){
        if(n % div == 0){
        return false;
        }
        div = div+1;
    }
    return true;
    }
    public static boolean checkPrime2(int n){
        int div = 2;
        boolean isPrime = true;
        while (div <=n-1) {
            if (n% div==0){
                isPrime = false;
                break;
            }
            div = div+1;
        }
        return isPrime;
    }
    public static void main(String[]args){
    Scanner s = new Scanner(System.in); 
    System.out.println("Enter a number");
    int n = s.nextInt();
    boolean isPrime = checkPrime2(n);
    System.out.println(isPrime);
    }
}
