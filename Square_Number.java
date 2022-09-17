import java.util.*;
class samplesq{
    static boolean sqrt(int n){
        int x;
        for (int i = 2; i<=n;i++){
            x = i*i;
            double y = (Math.sqrt(n - x));
            if (y == (int)(y)){
                return true;
            }
            
        }return false;}
    
    
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if (sqrt(a)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        
        
       
    }
}