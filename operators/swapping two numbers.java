import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=a;
      a=b;
      b=c;
      System.out.println(a);
      System.out.println(b);
      
    }
}
