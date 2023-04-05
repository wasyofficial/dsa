package package2;

import package1.Package1Class;

public class SubClass extends Package1Class{
    void printAValues()
    {
        System.out.println(x);
  //      System.out.println(y);//private
  //      System.out.println(z);//default
        System.out.println(m);//protected
    }
    public static void main(String[] args){
        SubClass s=new SubClass();
        s.printAValues();
      //  Package1Class p1=new Package1Class();
      //  p1.x; ..only access

    }
}
