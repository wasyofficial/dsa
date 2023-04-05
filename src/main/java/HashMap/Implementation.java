package HashMap;

import java.util.HashMap;

public class Implementation {
    public static void main(String[] args)
    {
        HashMap<Integer,String> map= new HashMap<>();
        //insert the value
        map.put(101,"waseem");
        map.put(102,"rosy");
        map.put(103,"rohit");

        //Java8 for each Lambda
        map.forEach((k,v)->{System.out.println("key is   "+k +" and value "+ v);});

     System.out.println("---updating values---");
        map.put(101,"Satyam");
        map.put(103,"dolly");
        //Java8 for each Lambda
        map.forEach((k,v)->{System.out.println("key is   "+k +" and value "+ v);});

        System.out.println("====Get the values for a key===");
        String name=map.get(103);
        System.out.println("person with roll number 103 is "+name);

        System.out.println("====Contains Key===");
        boolean present=map.containsKey(100);
        System.out.println("Person with roll number 100 is present: "+present);

        System.out.println("==get Size of the map===");
        System.out.println("Map's size is:"+ map.size());

        //same address
        // write hashcode method
        // write equals method
        System.out.println("==Remove element form Map===");
        System.out.println("Map's size is:"+ map.remove(101));
        map.forEach((k,v)->{System.out.println("key is   "+k +" and value "+ v);});
    }
}
