import java.util.*;
class nextprimepalin{
    public static boolean palindrome(int x){
        int rev=0,r;
        int i=x;
        while (x>0)
        {
           r=x%10;
           rev=rev*10+r;
           x=x/10;
        }
        return rev==i;
    }
    public static boolean isprime(int y){
        int count=0;
        for(int i=1;i<=y;i++)
        {
            if(y%i==0)
            count++;
        }
        return count==2;
    }
    public static int nextpalindrome(int z){
        if (palindrome(z)==true)z++;
        while(palindrome(z)==false){
            z++;
        }return z;
            
        
    }
    public static int nextppalin(int x){
        if (isprime(x)==true)x++;
        while(isprime(x)!=true){
           x = nextpalindrome(x);
        }return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        c=sc.nextInt();
        System.out.println(nextppalin(c));
    }
}