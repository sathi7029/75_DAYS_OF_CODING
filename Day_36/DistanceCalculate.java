public class DistanceCalculate {
    private int x,y;
    public DistanceCalculate (int x,int y){
        this.x=x;
        this.y=y;
    }
    public double findDistance(DistanceCalculate d){
        double dist=Math.sqrt(Math.pow((d.x-this.x), 2)+Math.pow((d.y-this.y), 2));
        return dist;
    }
    public static void main(String[] args) {
        DistanceCalculate d1=new DistanceCalculate(3,8);
        DistanceCalculate d2=new DistanceCalculate(80, 21);
        double distance=d1.findDistance(d2);
        System.out.println("distance is:"+distance);
    }
}
//updateing