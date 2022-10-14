import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        long  a,b;
        int c=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLong();
        b=a;
        for(i=0;a>0;i++)
        {
            c++;
            a=a/10;
        }
        if(c==10)
        {
            if(b/1000000000==0)
            {
                System.out.println("InValid");
            }
            else
            {
                System.out.println("Valid");
            }
        }
        else
        {
            System.out.println("Invalid");
        }
        
    
    
        
    }
}