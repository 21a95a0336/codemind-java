import java.util.Scanner;
class largestdigit
{
    public static int largerdigit(int n)
    {
        int r,max=0;
        while (n>0)
        {
            r=n%10;
            if(r>max)
            max=r;
            n=n/10;
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,result=0;
        n=sc.nextInt();
        result=largerdigit(n);
        
        System.out.println(result);
    }
  
}