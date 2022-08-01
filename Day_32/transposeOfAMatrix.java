public class transposeOfAMatrix {
    static void printMatrix(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;i++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void TransposeOfAMatrix(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int swap=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=swap;
            }
        }
    }
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("before transpose:");
        printMatrix(a);
        TransposeOfAMatrix(a);
        System.out.println("after transpose:");
        printMatrix(a);
    }
}
