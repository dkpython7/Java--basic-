/*You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is 
possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) 
in such a way that the first part is strictly decreasing while the second is strictly 
increasing one.
Note : We say that x is strictly larger than y when x > y.
So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly 
increasing sequence.


That is, in the sequence if numbers are decreasing, they can start increase at one point.
And once number starts increasing, they cannot decrease at any point further.
Sequence made up of only increasing numbers or only decreasing numbers is a valid 
sequence. So in both the cases, print true. */

import java.util.Scanner;

public class checkNoSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int n= s.nextInt();
        int prev = s.nextInt();
        int curr;
        boolean isDec = true;
        int i =2;
        while(i<=n){
            curr = s.nextInt();
            i++;
            if (curr == prev){
                System.out.println("false");
                return;
            }
            if (curr < prev){
                if (isDec == false){
                    System.out.println("false");
                    return;
                }  
            }
            else{
                if(isDec= true){
                    isDec=false;
                }
            }
            prev = curr;
        }
        System.out.println("true");
    }
}
