import java.util.*;
public class gravityFlip
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int column = sc.nextInt();
		int[] cubes = new int[column];
		String space = "";

		for(int i=0; i<column; i++)
		{
			cubes[i] = sc.nextInt();
		}
		
		Arrays.sort(cubes);

		for(int i = 0; i<column; i++)
		{
			space += cubes[i] + " ";
		}

		System.out.println(space.trim());
	}
}