package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Talib");
        student.put(2, "Suleman");
        student.put(3, "Sufiyan");
        student.get(2);
        System.out.println(student.get(2));
        System.out.println("All user");
        for (Map.Entry<Integer,String> std :student.entrySet()){
            System.out.println(std.getKey() + " : "+ std.getValue());
        }
    }
}
