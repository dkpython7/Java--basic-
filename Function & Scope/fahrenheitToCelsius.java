import java.util.Scanner;
public class fahrenheitToCelsius {
    public static float fahrenheitToCelsius(float start, float end, float gap ) {
        while (start<=end) {
            int frn = (int)((5.0/9)*(start-32));
            System.out.println(start +"\t"+ frn);
            start = start + gap;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        float frn = s.nextFloat();
        float FtoC = fahrenheitToCelsius(frn, 100, 20);
        System.out.println(FtoC);
    }
}
