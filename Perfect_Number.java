import java.util.*;
class perfect
{
    public static int perfectnum(int x)
    {
        int sum=0;
        for( int i=1;i<=x/2;i+=1)
        {
            if(x%i==0)
            sum+=i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,result;
        n=sc.nextInt();
        result=perfectnum(n);
        if(result==n)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}