package TimeComplexity;

import java.util.Scanner;

public class kpowN {

    //o(k^n)
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n= s.nextInt();
        int x=(int)Math.pow(k,n);//k^n

        for(int i=1; i <= n;i++)//O(N)
        {
            System.out.println("n timesHello  "+i);
        }

        for(int i=1; i <= k;i++)//O(K)
        {
            System.out.println("k times  Hello    "+i);
        }

        for(int i=1; i < x; i++)//O(X)
        {
            System.out.println(" k^n times Hello"+i);
        }
    }
}
