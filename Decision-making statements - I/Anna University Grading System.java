import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
       if(a==100)
      {
        System.out.println("S");
      }
      else if(a>=90&&a<=99)
      {
        System.out.println("A");
      }
       else if(a>=80&&a<=89)
      {
        System.out.println("B");
      }
       else if(a>=70&&a<=79)
      {
        System.out.println("C");
      }
       else if(a>=60&&a<=69)
      {
        System.out.println("D");
      }
     else if(a>=50&&a<=59)
      {
        System.out.println("E");
      }
       else 
      {
        System.out.println("F");
      }
    }
}

