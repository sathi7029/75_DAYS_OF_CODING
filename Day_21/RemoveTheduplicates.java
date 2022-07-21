import java.util.*;
public class RemoveTheduplicates {
    public static void main(String[] args) {
        int a[]={2,2,5,6,7,5,9};
        Set<Integer>s=new HashSet<>();
        for(int no:a)
        {
            if(s.add(no)==true)
            {
                System.out.print(no+" ");
            }
        }
    }
}
