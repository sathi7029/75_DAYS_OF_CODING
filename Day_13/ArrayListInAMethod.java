import java.util.ArrayList;
public class ArrayListInAMethod {
    static void display(ArrayList<String>Language)
    {
        for(String e:Language)
        {
            System.out.print(" "+e);
        }
    }
    public static void main(String[] args) {
        ArrayList<String>Language=new ArrayList<>();
        Language.add("java");
        Language.add("rubi");
        Language.add("c#");
        Language.add("go");
        display(Language);
    }
}
