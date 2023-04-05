package Encapsulation;

public class Person2 {

    public static void main(String[] args)
    {
        Card card=new Card();
        //default value
        int defaultPin= card.getiPin();
        System.out.println("defaultPin>>>"+defaultPin);


        //setting my own pin
        card.setiPin(678);
        int newPin=card.getiPin();
        System.out.println("Person2 iPin>>>>"+newPin);
    }
}
