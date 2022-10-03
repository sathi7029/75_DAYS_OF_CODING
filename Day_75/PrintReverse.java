public class PrintReverse {
    static void doReverse(int n){
        if(n==0){
            return;
        }
        int rev=n%10;
        n=n/10;
        System.out.print(rev);
        doReverse(n);

    }
    public static void main(String[] args) {
        int n=615;
        doReverse(n);

    }
}
