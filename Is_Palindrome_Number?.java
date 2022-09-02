import java.util.*;
class sample{
    public static int palindrome(int n){
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m;
        m=sc.nextInt();
        if(m<0)
        {
            m=Math.abs(m);
            
        }
        if(palindrome(m)==m)
        System.out.println("2");
        else
        System.out.println("1");
        
    }
}