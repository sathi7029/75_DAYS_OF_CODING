public class SecondLargestElement {
    static int findSecondLargest(int a[]){
        int n=a.length;
        int l=0;
        int sl=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>a[l])
            {
                sl=l;
                l=i;
            }if(a[i]<a[l])
            {
                if(a[sl]==-1 || a[i]>a[sl])
                {
                    sl=i;
                }
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        int a[]={400,500,100,800,1200};
        int index=findSecondLargest(a);
        System.out.println("the second largest element is:"+a[index]);
    }
}
