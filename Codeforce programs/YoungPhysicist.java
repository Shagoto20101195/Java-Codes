import java.util.Scanner;
public class YoungPhysicist
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    if(n>=1 && n<=100)
    {
      int sum1 = 0;
      int sum2 = 0;
      int sum3 = 0;
      
      int i = 1;
      while(i<=n)
      {
        int x = read.nextInt();
        int y = read.nextInt();
        int z = read.nextInt();
        
        sum1 = sum1 + x;
        sum2 = sum2 + y;
        sum3 = sum3 + z;
        
        i = i + 1;
      }
      
      if(sum1 == 0 && sum2 == 0 && sum3 == 0)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}