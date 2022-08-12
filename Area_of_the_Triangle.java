import java .util.Scanner;
class area{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,r,v;
        n=sc.nextInt();
        r=sc.nextInt();
        v=sc.nextInt();
        float a,s;
        s=(float)(n+r+v)/2;
         a=(float) Math.sqrt((s)*(s-n)*(s-r)*(s-v));
         
        System.out.format("%.2f",a);
    }
}
