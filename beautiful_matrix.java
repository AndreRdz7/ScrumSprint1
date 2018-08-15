import java.util.Scanner;
class beautiful_matrix{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
		int a,res=0,ai=0,aj=0;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				a=sc.nextInt();
				if(a==1){
					ai=i;
					aj=j;
					a=0;
				}
			}
		}
		System.out.println(ai);
		System.out.println(aj);
		res=Math.abs(2-ai)+Math.abs(2-aj);
		System.out.println(res);
	}
}