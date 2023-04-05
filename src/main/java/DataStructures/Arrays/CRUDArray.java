package DataStructures.Arrays;

import java.util.Scanner;

public class CRUDArray {

    public static void main(String[] args)
    {

        //create
        //1  type[] arrayNm=new type[sizeofthearray];
//        int[] intArray=new int[3];
        // intArray[0]=67;
//        intArray[1]=42;
//        intArray[2]=21;
//
   //     int[] intArray={67,42,21};


//        //read
//        for(int i=0; i < intArray.length;i++)
//        {
//            System.out.print(intArray[i]+"  " );
//        }



        //Take input from user
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();


        int[] userArray=new int[size];
        //createing by user input
        for(int j=0; j < userArray.length;j++)
        {
            userArray[j]=sc.nextInt();
        }
        System.out.print(userArray[2]+"  " );
        //read
        for(int k=0; k < userArray.length;k++)
        {
            System.out.print(userArray[k]+"  " );
        }

        System.out.println();
        System.out.println("************Update**************" );

        //Update
        int updateNeedIndex=3;
        for(int l=0; l < userArray.length;l++)
        {
            if(updateNeedIndex == l)
            { userArray[l]=userArray[l]*2;}
        }

        //read
        for(int k=0; k < userArray.length;k++)
        {
            System.out.print(userArray[k]+"  " );
        }
      //Disadv:
        // Array fixed, it can't be increased /dec dynamically //
       // Javascript:Push to add and pop to delete, dynmically increases and decreases
       //Python: increases dynamically
        //delete
        System.out.println();
        System.out.println("************delete**************" );

        for(int l=0; l < userArray.length;l++)
        {
            userArray[l]=0;//
        }

        for(int k=0; k < userArray.length;k++)
        {
            System.out.print(userArray[k]+"  " );
        }






    }
}
