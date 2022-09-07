public class Outerclass {
    int x=10;
    class inner{
        int y=20;
        void show(){
            System.out.println("show mwthod of inner class");
            System.out.println(x+" "+y);
        }
    }
    inner i=new inner();
    
    void outerShow(){
        System.out.println("outer show method");
        System.out.println(i.y);
        //i.show();
    }
    public static void main(String[] args) {
        Outerclass.inner oi=new Outerclass().new inner();
        Outerclass o =new Outerclass();
        oi.show();
        o.outerShow();
        
    }
}
