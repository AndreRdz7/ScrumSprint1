import java.util.Scanner;
class vanya_f{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
		int n,h,res=0,p;
		n=sc.nextInt();
		h=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			p=sc.nextInt();
			if(p<=h)
				res++;
			else
				res=res+2; 
			p=0;
		}
		System.out.println(res);

	}
}