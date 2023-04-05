package DataStructures.Arrays;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
        int[][] twoDArray=new int[3][3];
     // row=0 // 1 2 3
     // row=1  // 4 5 6
     // row2 // 7 8 9

        //creating
        for(int row=0; row < twoDArray.length; row++)
        {
            for(int col=0; col < twoDArray[row].length;col++)
            {
                twoDArray[row][col]=sc.nextInt();}
        }
        //read//print the 2D array
        for(int row=0; row < twoDArray.length; row++)
        {
            for(int col=0; col < twoDArray[row].length;col++)
            { //
                System.out.print(twoDArray[row][col] + " ");
            }
            System.out.println();
        }

    }
}
