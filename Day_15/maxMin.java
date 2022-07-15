public class maxMin {
    static int findMax(int a[])
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    static int findMin(int a[])
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int a[]={200,800,400,30,100};
        int max=findMax(a);
        int min=findMin(a);
        System.out.println("maximum element is:"+max);
        System.out.println("minimum element is:"+min);
    }
}
