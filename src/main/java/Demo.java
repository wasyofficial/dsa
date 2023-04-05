
public class Demo {// 0  1  1  2  3  5  8  13  21  34  55  89  144
     static int first=0;
     static int second=1;
     static int third=0;//place to store 3rd number
//10
    static void fib(int n)
    {
        if(n < 0)//base condition
        {
           return;
        }
        third=first+second;
        System.out.print("   "+third);
        first=second;
        second=third;
        fib(n-1);
    }
    public static void main(String[] args) {
        System.out.print(first+ "   "+second);
        fib(10);

//    for(int n=0; n <= 10; n++)
//    {
//         third=first+second;
//         System.out.print("   "+third);
//         first=second;
//         second=third;
//     }
    }
}