import java.util.*;
 class sample {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int x[],n,m,k=0;
        n=sc.nextInt();
        
        x=new int[n];
        
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        m=sc.nextInt();
        for(int i=0;i<n;i++) 
        {
            if(x[i]==m)
            k++;
        }
        System.out.println(k);
        
            
    }
    
}
