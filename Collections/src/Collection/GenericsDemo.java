package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    //It ensure Type Safety List<Type> this is syntax
    public static void main(String[] args) {
        List<String> user=new ArrayList<>();
        user.add("Talib");
        //user.add(1); if use generics method and declare type so i cant able to insert other type
    }

}
