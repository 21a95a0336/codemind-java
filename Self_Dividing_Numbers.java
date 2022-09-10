import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(self(i)){
                System.out.print(i+" ");
            }
        }
        
    }
    public static boolean self(int x){
        int w=x;
        while(x>0)
        {
            int r=x%10;
             x=x/10;
             if(r==0)return false;
             else if (w%r!=0)return false;
             
             
        }return true;
    }
}