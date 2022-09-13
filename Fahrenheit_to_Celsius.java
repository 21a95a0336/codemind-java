import java.util.Scanner;
class Demo7
{
	public static void main(String args[])
	{
		int f;
		float C;
		Scanner sc=new Scanner(System.in);

		f=sc.nextInt();

		C=(float)((f-32)*(0.55555));

		System.out.printf("%.2f",C);
	}
}