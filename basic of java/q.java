import java.util.Scanner;

public class q{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();

        int currentFahrenhinetValue = start;
        while(currentFahrenhinetValue <=end){
            int celsiusValue = (int)((5.0/9)*(currentFahrenhinetValue - 32));
            System.out.println(currentFahrenhinetValue + "\t" + celsiusValue);
            currentFahrenhinetValue += step;
        }

    }
}

