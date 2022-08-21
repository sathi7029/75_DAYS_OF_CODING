public class CoinChangesProblem {
    static int solve(int a[],int amt,int currIndex){
        int n=a.length;
        //base case
        if(amt==0)return 1;
        if(amt<0)return 0;
        int ways=0;
        for(int i=currIndex;i<n;i++){
            ways+=solve(a,amt-a[i], i);
        }
        return ways;

    }
    public static void main(String[] args) {
        int a[]={1,2};
        int amt=4;
        int ans=solve(a,amt,0);
        System.out.println("total no of ways is:"+ans);


    }
}
