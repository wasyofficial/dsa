package Algorithms;

public class twoPointer {
    public static void main(String[] args){
        String ans="";
        String s="The sky is blue";
        for(int start=s.length()-1; start >=0 ; start--)
        {
            if(s.charAt(start)==' ')
            {continue;}
            int end=start;
            while(start >=0 && s.charAt(start)!=' ')
            {start--;}
            ans=ans+s.substring(start+1,end+1)+" ";

        }

        System.out.println(ans);

    }
}
