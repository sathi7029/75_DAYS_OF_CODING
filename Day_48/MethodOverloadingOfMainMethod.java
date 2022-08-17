public class MethodOverloadingOfMainMethod {
    public static void main(String[] args) {
        System.out.println("In main");
        MethodOverloadingOfMainMethod m=new MethodOverloadingOfMainMethod();
        m.main(69);
    }
    public static void main(int s) {
        System.out.println("int method");
    }
}
