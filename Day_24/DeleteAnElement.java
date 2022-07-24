import java.util.*;
public class DeleteAnElement {
    static int delet(int arr[],int key)
    {
        int n= arr.length;
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                break;
            }
        }
        if(i==n)return n;
        for(int j=i;j<n-1;j++)
        {
            arr[j]=arr[j+1];
        }
        return n-1;
    }
    public static void main(String[]a)
    {
        int arr[]={2,4,6,7,8,10};
        int key=7;
        delet(arr,key);
        System.out.println("after delete array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }

    }
}

