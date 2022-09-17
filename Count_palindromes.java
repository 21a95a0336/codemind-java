import java.util.*;
 class arrays2 {
     public static boolean palindrome(int x){
         int r,rev=0;
         int w=x;
         while(x>0)
         {
             r=x%10;
             rev=rev*10+r;
             x=x/10;
         }
         return rev==w;
     }
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int x[],n,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++) 
        {
            if(palindrome(x[i]))
            count++;
        } 
        System.out.println(count);
    }
    
}
