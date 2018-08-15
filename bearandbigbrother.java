import java.util.Scanner;
public class bearandbigbrother{
	public static void main(String[] args) {
		int i;
		Scanner read = new Scanner(System.in);
        System.out.println("Enter the weight of Limak");
 		int a = read.nextInt();
 		System.out.println("Enter the weight of Bob");
 		int b = read.nextInt();

 		for (i=1;;i++){
 			a = a*3;
 			b = b*2;
			if(a>b){
				break;
			}
 		}
		System.out.println(i);
	}
}
