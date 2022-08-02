public class calculateGcd {
    static int calculateGcd(int a,int b){
        if(a==0)return b;
        if(b==0)return a;
        while(a !=b){
            if(a>b)a=a-b;
            else
            b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=12,b=8;
        int gcd=calculateGcd(a, b);
        System.out.println("gcd of "+a+" and "+b+" is:"+gcd);
    }
}
