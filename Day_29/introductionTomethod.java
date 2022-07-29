public class introductionTomethod {
    int max(int x,int y){
        if (x>y)return x;
        else
        return y;
    }
    public static void main(String[] args) {
        introductionTomethod mp=new introductionTomethod();
        System.out.println("max is:"+ mp.max(3, 4));
    }
}
