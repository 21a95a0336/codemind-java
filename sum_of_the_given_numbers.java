import java.util.Scanner;
class sample{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t,a,b,sum;
    t=sc.nextInt();
    while(t>0)
    {
        a=sc.nextInt();
        b=sc.nextInt();
        sum=(a+b);
        System.out.println(sum);
        
        t--;
    }
  }
}