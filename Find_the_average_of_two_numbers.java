import java.util.Scanner;
class average
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=0.0;
        double s=0.0;
        s=a+b;
        c=s/2;
        System.out.println(String.format("%.4f",c));
    }
}