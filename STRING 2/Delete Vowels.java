  import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      a=a.replaceAll("[aeiouAEIOU]","");
      System.out.println(a);
    }
}
