import java.util.Scanner;

public class basic{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in );
    //     int f= s.nextInt();
    //     int cel =(int)((5.0/9)*(f-32));
    //     System.out.println(cel);
    //     System.out.println("hello");



        int i= s.nextInt();
        int j= s.nextInt();
        int k= s.nextInt();
        boolean isALargest = (i>=j)&&(i>=k);
        System.out.println(isALargest);

     }
}