package Algorithms;

public class ReverseString {
//TC:O(N/2) SC:O(N)
    public static void main(String[] args)
    {
        String s="Fruit";
        //convert this string array of character
        char[] chr=s.toCharArray();
        int start=0;
        int end=chr.length-1;
        while(start< end)
        {
            char temp= chr[start];
            chr[start]=chr[end];
            chr[end]=temp;
            start++;
            end--;
        }
        System.out.println(new String(chr));


    }
}
