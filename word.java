import java.util.*;

public class word{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();

		int counter = 0;

		for(char c : palabra.toCharArray())
		{
			if(c >= 'a' && c <= 'z')
				counter--;
			else
				counter++;
		}

		if(counter < 0)
			System.out.println(palabra.toLowerCase());
		else
			System.out.println(palabra.toUpperCase());
	}
}