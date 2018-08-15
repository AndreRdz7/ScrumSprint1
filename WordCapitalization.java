import java.util.*;
public class WordCapitalization
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(capitalize(word));
    }

    public static String capitalize(String s)
    {
        char arr[] = s.toCharArray();

        if(arr[0] >= 'a' && arr[0] <= 'z')
            arr[0] -= 32;

        return new String(arr);
    }
}