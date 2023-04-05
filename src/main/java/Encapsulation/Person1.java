package Encapsulation;

public class Person1 {


    public static void main(String[] args)
    {

        //getting default ipin
        Card card=new Card();
        int defaultPin=card.getiPin();
        System.out.println("defaultPin>>>"+defaultPin);

      //setting my own ipin
        card.setiPin(123);
        int myPin=card.getiPin();
        System.out.println("Person1 Pin>>>>>"+myPin);

        card.setName("xyz");
        String myname=card.getName();
        System.out.println("Person1 Pin>>>>>"+myname);
    }
}
