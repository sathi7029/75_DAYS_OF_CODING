import java.util.*;
public class Recursion1 {
    static int fact(int n){
        if( n==0 || n==1){
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println("factorial of "+n+"="+fact(n));
        sc.close();
    }
}
