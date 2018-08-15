import java.util.*;
public class BoyorGirl
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        HashSet<Character> set = new HashSet<Character>();

        for(char c : s.toCharArray())
        {
            set.add(c);
        }

        int n = set.size();

        if(n % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

    }
}