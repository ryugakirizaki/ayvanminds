import java.util.*;
class sol
{
    int s(int a, int b)
    {
        if(a>b)
        {
            return a-b;
        }
        else
        {
            return a+b;
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a,b,c;
      a=sc.nextInt();
      b=sc.nextInt();
      sol x=new sol();
      c=x.s(a,b);
      System.out.println(c);
    }
}
