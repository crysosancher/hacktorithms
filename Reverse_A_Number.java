import java.util.*;
public class Reverse_A_Number {
        public static void main(String[] args) {
            // write your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            while(n>0){
                int rev=n %10;
                n=n/ 10;
                System.out.println(rev);
            }
        }
    }