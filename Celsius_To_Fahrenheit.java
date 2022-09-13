import java.util.Scanner;
class Demo7
{
	public static void main(String args[])
	{
		int C;
		float F;
		Scanner sc=new Scanner(System.in);

		C=sc.nextInt();

		F=(float)(9*C)/5+32;
		System.out.printf("%.2f",F);
	}
}