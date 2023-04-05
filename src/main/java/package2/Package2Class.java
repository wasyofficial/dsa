package package2;

//import package1.A; default class not accessible
import package1.Package1Class;

public class Package2Class {

    public static void main(String[] args){
//different world
        Package1Class p1=new Package1Class();
        System.out.println(p1.x);
   //  System.out.println(p1.y);
       //System.out.println(p1.z);
      //  System.out.println(p1.m);
    }
}
