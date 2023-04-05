package package1;
//same package
public class SubClass extends A{
    void printAValues()
    {
        System.out.println(a);
     //   System.out.println(b);//private
        System.out.println(c);
        System.out.println(d);
    }
    public static void main(String[] args){
        SubClass s=new SubClass();
        s.printAValues();
    }
}
