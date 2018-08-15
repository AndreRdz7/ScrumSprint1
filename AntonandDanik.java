//http://codeforces.com/problemset/problem/734/A
import java.util.*;
public class AntonandDanik
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String games = sc.nextLine();
        System.out.println(checkWinner(games));
    }

    public static String checkWinner(String s)
    {
        int counter = 0;

        for(char c : s.toCharArray())
            if(c == 'A')
                counter++;
            else
                counter--;

        if(counter > 0)
            return "Anton";

        if(counter < 0)
            return "Danik";
            
        return "Friendship";
    }
}