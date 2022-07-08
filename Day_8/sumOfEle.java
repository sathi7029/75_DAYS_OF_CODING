import java.util.*;
public class sumOfEle {
    public static void main(String[]s){
    Scanner sc=new Scanner(System.in);
    int n;
    
    System.out.println("enter the array size:");
    n=sc.nextInt();
    int a[]=new int [n];
    System.out.println("enter the array elements->");
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    sumOfArray(a);
    }
    static void sumOfArray(int m[] )
    {
        int sum=0;
        for(int i=0;i<m.length;i++)
        {
            sum+=m[i];
        }
        System.out.println("sum is:"+sum);
        
    }
}
