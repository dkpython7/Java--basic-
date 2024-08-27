import java.util.Scanner;
public class NCR {
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact*=i; 
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int n= s.nextInt();
        int r = s.nextInt();
        int result = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(result);
    }
}

