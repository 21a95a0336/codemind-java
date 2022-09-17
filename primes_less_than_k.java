import java.util.*;
 class countpalin {
     public static boolean prime(int x){
         int count=0;
         if(x<2)
         return false;
         for(int i=2;i<=(int)Math.sqrt(x);i++)
         {
             if(x%i==0)
             count++;
         }
         if(count==0)
         return true;
         else
         return false;
     }
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int x[],n,count=0,k;
        n=sc.nextInt();
        
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        
        for(int i=0;i<n;i++) 
        {
            if(prime(x[i]))
            {
                if(x[i]<=k)
                    count++;
            }
            
        } 
        System.out.println(count);
    }
    
}
