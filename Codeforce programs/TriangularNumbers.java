//Written by Shagoto
import java.util.*;
public class TriangularNumbers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    
    for(int i = 1; i<=32; i++)
    {
      if((i*(i+1)) / 2 == n)
      {
        System.out.println("YES");
        break;
      }
      else if((i*(i+1)) / 2 > n)
      {
        System.out.println("NO");
        break;
      }
      else
      {
        continue;
      }
    }
  }
}