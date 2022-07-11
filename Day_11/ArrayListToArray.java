import java.util.ArrayList;
import java.util.Collections;
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);
        System.out.println();

        Integer[]arr=new Integer[a.size()];
        a.toArray(arr);
        System.out.println("array elements are:");
        for(int e:arr)
        {
            System.out.print(" "+e);
        }
    }
}
