abstract class Animal{
    abstract public void sound();
}
public class Test {
    public static void main(String[] args) {
        Animal Dog=new Animal(){
            public void sound(){
                    System.out.println("barking");
            }
        };
        Animal tiger=new Animal(){
            public void sound(){
                System.out.println("roaring");
            }
        };
        Dog.sound();
        tiger.sound();
    }
}
