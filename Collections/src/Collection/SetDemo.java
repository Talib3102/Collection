package Collection;

import java.util.HashSet;
import java.util.Set;
class dog{
    String name;
    dog(String name){
        this.name=name;
    }
}

public class SetDemo {
    //unordered and duplicate values not allowed
    public static void main(String[] args) {
        Set<String> user=new HashSet<>();
        user.add("Talib");
        user.add("Sufiyan");
        user.add("Suleman");
        for (String i : user)
            System.out.println(i);

        dog dog=new dog("Saddam");
        Set<dog> dog1=new HashSet<>();
        dog1.add(dog);
        for (dog animal : dog1){
            System.out.println(animal.name);
        }
    }
}
