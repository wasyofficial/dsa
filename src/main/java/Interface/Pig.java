package Interface;

public class Pig implements Animal{
    @Override
    public void sound() {
        System.out.println("Grunt Grunt");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzzzzzzzz!!!");
    }
}
