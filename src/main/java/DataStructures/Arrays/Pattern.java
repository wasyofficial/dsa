package DataStructures.Arrays;

public class Pattern {
    public static void main(String[] args) {
//        //n =5
////            * * * * *
////            * * * * *
////            * * * * *
////            * * * * *
////            * * * * *
//
//        for (int row = 1; row <= 5; row++) {
//            for(int col=1; col <=5 ; col++)
//            {
//                System.out.print("x ");
//            }
//            System.out.println("");
//        }
//
//
//        System.out.println("&&&&Increament Triangle&&&&&");
//        //            *
//        //            * *
//        //            * * *
//        //            * * * *
//        //            * * * * *
//        for(int row=1; row<=5;row++)
//        {
//            for(int col=1; col<=row;col++)
//            {
//                System.out.print("x ");
//            }
//            System.out.println("");
//        }
//        System.out.println("&&&& Decrement Triangle&&&&&");
//
//        // * * * * *
//        // * * * *
//        // * * *
//        // * *
//        // *
//
//        for(int row=1; row <=5; row++)
//        {
//            for(int col=1; col<=(5-row)+1; col++)
//            {
//                System.out.print("x ");
//            }
//            System.out.println("");
//        }

        System.out.println("&&&& Pyramid &&&&&");

        //            *
        //          * * *
        //        * * * * *
        //      * * * * * * *
        //    * * * * * * * * *


        for(int row=1; row <=5; row++)
        {

            //decremtn blank space
            for(int j=1; j <= (5-row)+1; j++)
            {
                System.out.print("  ");
            }
            //increament with *- first traingle
             for(int k=1; k < row; k++)
             {
                 System.out.print("x ");
             }
             //increamnse with x-second traingle
            for(int l=1; l <=row;l++)
            {
                System.out.print("x ");
            }

            System.out.println(" ");

        }

    }
}
