import java.util.Scanner;
class circle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=3.14*a*a;
        System.out.println(String.format("%.2f",b));
    }
}