import java.util.*;
class countdiv
{
    public static int countdiv(int x, int y, int z)
    {
        int count=0;
        for( int i=x;i<=y;i+=1)
        {
            if(i%z==0)
            count+=1;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,k,result;
        n=sc.nextInt();
         m=sc.nextInt();
         k=sc.nextInt();
        result=countdiv(n,m,k);
        System.out.println(result);
        
        
    }
}