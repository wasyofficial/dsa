package TimeComplexity;
//O(N!)
public class nFactorial {

    void nFac(int n)
    {
        if(n==0)
        {
            System.out.println("******");
            return;
        }
        for(int i=0;i < n; i++)
        {
            nFac(n-1);
        }
    }


    public static void main(String[] args)
    {
        nFactorial nf=new nFactorial();
        nf.nFac(3);
    }
}
