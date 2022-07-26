import java.util.*;
public class maximunSubarray {
    static int maxSubarraySum(int arr[])
    {
        int n=arr.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currSum+=arr[i];
            if(currSum>maxSum)maxSum=currSum;
            if(currSum<0)currSum=0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={6,-7,4,-2,1,5,-4};
        int sum=maxSubarraySum(arr);
        System.out.println("the maximum sum is:"+sum);
    }
}
