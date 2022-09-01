import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for( int i=1;i<=b;i+=2)
        System.out.println(a+" x "+i+" = "+(a*i));
        
    } 
}