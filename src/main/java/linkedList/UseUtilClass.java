package linkedList;
import java.util.ArrayList;
import java.util.Collections;

public class UseUtilClass {

    public static void main(String[] args) {
//Arraylist- search - o(1)
        //linked list - insert/delete -O(1--)
       // LinkedList<String> cars = new LinkedList<String>();
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("maruthi");
        cars.add("toyota");
        cars.add("tata");
        cars.add("kia");
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);

        cars.remove("kia");
        System.out.println(cars);

        System.out.println(cars.get(0));
        cars.set(0,"inova");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.size());

    }
}
