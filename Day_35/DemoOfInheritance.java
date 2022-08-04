class person{
    void eat(){
        System.out.println("he is eating");
    }
    void drink(){
        System.out.println("he is drinking");
    }
}
class person2 extends person{
    void walk(){
        System.out.println("he is walking");
    }
}
public class DemoOfInheritance {
    public static void main(String[] args) {
        person2 p2=new person2();
        p2.eat();
        p2.drink();
        p2.walk();
    }
}
