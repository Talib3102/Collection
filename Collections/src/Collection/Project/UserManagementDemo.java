package Collection.Project;

import java.util.*;

public class UserManagementDemo {
    public static void main(String[] args) {
//        Set<String> user1Role=new HashSet<>(Arrays.asList("ADMIN","USER"));
//        User user1=new User("Talib",true,user1Role);
        List<User> users=new ArrayList<>();
        users.add(new User("Talib",true,new HashSet<>(Arrays.asList("ADMIN","USER"))));
        users.add(new User("Suleman",false,new HashSet<>(Arrays.asList("USER"))));
        users.add(new User("Sufiyan",true,new HashSet<>(Arrays.asList("MANAGER"))));

        //Remove INACTIVE USER
        Iterator<User> it= users.iterator();
        while(it.hasNext()){
            if (!it.next().isActive()){
                it.remove();
            }
        }
        System.out.println("ACTIVE USER");
        for (User user: users)
            System.out.println(user.getName());
        //COUNT USER PER ROLE
        Map<String,Integer> roleCount=new HashMap<>();
        for (User user: users) {
            for (String role : user.getRoles()) {
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }
        }
        System.out.println("All user role count");
        for (Map.Entry<String,Integer> std :roleCount.entrySet()){
            System.out.println(std.getKey() + " : "+ std.getValue());
        }
    }
}
