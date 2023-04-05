import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Check1 {

    public static void main(String[] args)
    {

        List<String> matchingWord=new ArrayList<>();
        String subString="alpha";

        List<String> userWords=new ArrayList<>();


        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for(int j=0; j < n; j++)
        {
            userWords.add(sc.next());
        }

for(int k=0; k < userWords.size();k++) {
    if ((userWords.get(k)).contains(subString)) {
        matchingWord.add(userWords.get(k));
    }
}

        for(int i=0; i < matchingWord.size();i++)
        {
            System.out.println(matchingWord.get(i));
        }

    }

}
