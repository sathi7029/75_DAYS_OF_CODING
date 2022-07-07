public class binarySearch{
    public int search(int []nums,int target)
    {
        int s=0;
        int n=nums.length;
        int e=n-1;
        while(s<=e)
        {
             int mid=s+(e-s)/2;//this technique does not occur stack overflow
             int midele=arr[mid];
                     if(target==midele)
                {
                     return mid;
                     }
    else if(target> midele)
    {
        s=mid+1;
    }
    else
    {
        e=mid-1;
    }
}
return -1;
    }

}

