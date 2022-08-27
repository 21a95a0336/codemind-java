import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c,sum=0,pro=1;
        n=sc.nextInt();
        while(n>0)
        {
            c=n%10;
            sum=sum+c;
            pro=pro*c;
            n=n/10;
        }
        System.out.println(Math.abs(pro-sum));
    
  }
}