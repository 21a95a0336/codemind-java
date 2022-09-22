import java.util.*;
 class arrays2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int x[],n,k=0;
        n=sc.nextInt();
        x=new int[n];
        
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++) 
        {
            if(x[i]%2!=0)
            k=i;
        }   
        System.out.println(k);
    }
    
}
