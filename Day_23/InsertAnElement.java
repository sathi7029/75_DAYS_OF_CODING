public class InsertAnElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=arr.length;
        int pos=3;
        int ele=100;
        for(int i=n-1;i>pos-1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=ele;
        System.out.println("after insertion array element are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
