public class rotate90degreeclockwise {
    static void transpose(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int swap=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=swap;
            }
        }
    }
    static void rotate90(int a[][]){
        transpose(a);
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int swap=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=swap;
            }
        }
    }
    public static void main(String[] args) {
        int a[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        rotate90(a);
        System.out.println("after rotation:");
        System.out.println();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
}
