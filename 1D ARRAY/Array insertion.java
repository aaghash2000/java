import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
    int p,e;
        int b[] = new int[a+1];
        for(int i=0;i<a;i++)
        {
            b[i] = sc.nextInt();
        }
        p = sc.nextInt();
       
    if(p<a)
    {
       e = sc.nextInt();
        for(int i = a-1;i >=(p-1);i--)
        {
            b[i+1] = b[i];
        }
        b[p-1] = e;
        for(int i = 0; i <=a; i++)
        {
            System.out.println(b[i]);
        }
    }else
    {
      System.out.println("Invalid Input");
    }
       
    }
}
