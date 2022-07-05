import java.util.*;
public class LeaderElements {
    static void printLeader(int a[]) {
        int n = a.length;
        int b[] = new int[a.length];
        int j = 0;
        int large = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > large) {
                large = a[i];
                //System.out.print(" " + a[i]);
                b[j++] = a[i];

            }
        }
        System.out.println();
          for(j=j-1;j>=0;j--)
            System.out.print(" "+b[j]);
    }

    public static void main(String[]s)
    {
        int a[]={2,7,6,4,1,3};
        printLeader(a);
    }
}
