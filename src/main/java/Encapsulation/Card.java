package Encapsulation;

public class Card {

    private int iPin=6;//default

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiPin() {
        return iPin;
    }

    public void setiPin(int iPin) {
        this.iPin = iPin;
    }


}
