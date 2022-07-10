import java.util.ArrayList;
import java.util.Collections;
public class IntroductionToArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();


        //adding element
        list.add(20);
        list.add(60);
        list.add(90);
        list.add(10);
        list.add(40);
        System.out.println(list);


        // get method 
        int ele=list.get(3);
        System.out.println(ele);


        //set method 
        list.set(3,900);
        System.out.println(list);


        //insert in specific position
        list.add(2,700);
        System.out.println(list);


        //delet element
        list.remove(5);
       // System.out.println(list);



       //size
       int size=list.size();
       System.out.println(size);


       //loops on list

       for(int i=0;i<size;i++)
       {
        System.out.print("  "+list.get(i));
       }


       //sorting
       Collections.sort(list);

       System.out.println(list);

    
}
}