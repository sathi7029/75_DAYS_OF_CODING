import java.util.*;
public class findDuplicates {
    public static void main(String[] args) {
        int a[]={3,5,4,2,2,1,3};
        System.out.println("duplicates are:");
        Set<Integer>s=new HashSet<>();
        for(int no:a)
        {
            if(s.add(no)==false)
            {
                System.out.print(no+" ");
            }
        }

    }
}
