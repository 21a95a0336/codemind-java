import java.util.Scanner;
class sample{
    public static int palandrom(int n){
  
     int sum=0,r;
     while(n>0)
     {
         r=n%10;
         sum=sum*10+r;
         n=n/10;
     }
     return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m;
        m=sc.nextInt();
        if(palandrom(m)==m)
        System.out.println("True");
        else
        System.out.println("False");
    }
}