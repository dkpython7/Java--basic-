import java.util.Scanner;
public class oddSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = s.nextInt();
        int i= 1;
        while(i<=n) {
            int ValueToPoint= ((2*i)-1);
            int j=1;
            while(j<=n) {
                System.out.print(ValueToPoint);
                ValueToPoint=ValueToPoint+2;
                if(ValueToPoint>(2*n)-1){
                    ValueToPoint=1;
                }
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}