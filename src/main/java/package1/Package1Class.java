package package1;
class A{
    public int a=3;
    private int b=9;
    int c=10;//default
    protected int d=11;


    public void currentMethod(){
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
    }
}
public class Package1Class {

    public int x=3;
    private int y=9;
    int z=10;//default
    protected int m=11;

    public static void main(String args[]){
       A a=new A();
       System.out.println(a.a);
       // System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
        a.currentMethod();
    }
}
