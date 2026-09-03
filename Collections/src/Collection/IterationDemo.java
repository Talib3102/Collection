package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationDemo {
    public static void main(String[] args) {
        List<String> user=new ArrayList<>();
        user.add("abcd");
        user.add("efg");
        user.add("hij");
        user.add("klm");

        System.out.println("Using enhance/for each loop");
        for (String i: user)
            System.out.println(i);
        System.out.println("Uing for loop");
        for (int i = 0; i < user.size(); i++) {
            System.out.println(user.get(i));

        }
        System.out.println("Using Iterator");
        Iterator<String> it= user.iterator();
        while(it.hasNext()){
            //System.out.println(it.next());
            if(it.next().equals("efg")){
                it.remove();
            }
        }
        for (String use : user)
            System.out.println(use);
    }
}
