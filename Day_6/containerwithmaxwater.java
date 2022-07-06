import java.util.*;
public class containerwithmaxwater 
{
   static int getContainerWithMaxWater(int arr[]){
    int l=0;
    int n=arr.length;
    int r=n-1;
    int maxArea=0;
    while(l<r)
    {
        int dist=r-l;
        int area=Math.min(arr[l],arr[r])*dist;
        maxArea=Math.max(area,maxArea);

        if(arr[l]<arr[r])
        {
            l++;
        }
        else
        {
            r--;
        }
    }

    return maxArea;
   }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,4,5,8,3,7};
        int ans=getContainerWithMaxWater(arr);
        System.out.println(ans);
    }
    
}
