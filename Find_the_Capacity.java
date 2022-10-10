import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m,b;
        n=sc.nextInt();
        m=sc.nextInt();
        b=sc.nextInt();
        int c=(2*n*m*b*512);
        System.out.println((c/1024)+"KB");
    }
}