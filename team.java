import java.util.Scanner;
public class Team{
	public static void main(String[] args) {
		int solved = 0;
		Scanner read = new Scanner(System.in);
        System.out.println("Enter a number:");
 		int n = read.nextInt();
 		for (int i=0;i<n;i++){
 			int p = read.nextInt();
 			int v = read.nextInt();
 			int t = read.nextInt();
			if(p+v+t>=2){
				solved++;
			}
 		}
		System.out.println(solved);
	}
}
