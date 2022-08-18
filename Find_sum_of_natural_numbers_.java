import java.util.Scanner;
class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum;
        n=sc.nextInt();
        sum=0;
        int i;
        for(i=1;i<=n;i+=1)
            sum+=i;

            {System.out.println( sum );}
    }
}