public class UseOfSupper {
    class Parent {
        void name() {
            System.out.println("Tom");
        }

        void food() {
            System.out.println("only corn pizza");
        }
    }

    class Childe extends Parent{
        void name(){
            super.name();
            System.out.println("jerry");
        }
    }
    public static void main(String[] args) {
        Childe c=new Childe();
        c.name();
    }
}
