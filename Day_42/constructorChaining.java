public class constructorChaining {
    int id;
    String name;
    String city;
    constructorChaining(int id,String name){
        this.id=id;
        this.name=name;
    }
    constructorChaining(int id,String name,String city){
        this(id,name);
        this.city=city;
    }
    void display(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("city:"+city);
    }
    public static void main(String[] args) {
        constructorChaining c1=new constructorChaining(1, "sathi");
        //c1.display();
        constructorChaining c2=new constructorChaining(2,"mou","asansol");
        c2.display();
    }
}
