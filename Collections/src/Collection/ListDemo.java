package Collection;

import java.util.ArrayList;
import java.util.List;
class Car{
    String model;
    Car(String model){
        this.model=model;
    }
}

public class ListDemo {

    public static void main(String[] args) {
        List<String> user=new ArrayList<>();
        user.add("Talib");
        user.add("Suleman");
        user.add("Sufiyan");
        System.out.println("All users");
        for (String i: user ){
            System.out.println(i);
        }
        System.out.println( "get user by index ");
        System.out.println(user.get(1));
        Car car1 = new Car("BMW");
        Car car2 = new Car("OOOD");
        List<Car> carList=new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        System.out.println("All Cars");
        for(Car car: carList){
            System.out.println(car.model);
        }
    }
}
