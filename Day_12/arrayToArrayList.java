import java.util.ArrayList;
import java.util.Arrays;
public class arrayToArrayList {
    public static void main(String[] args) {
        Integer[]p={10,20,30,40,50};
        System.out.println("array elements are:");
        for(int e:p)
        {
            System.out.print(" "+e);
        }
        System.out.println();
        ArrayList<Integer>a=new ArrayList<>(Arrays.asList(p));
        System.out.println("after converting the array to list ...the list elements are:");
        for(int i=0;i<a.size();i++)
        System.out.print(" "+a.get(i));

    }
}
