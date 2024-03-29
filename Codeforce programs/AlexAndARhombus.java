//Written by Shagoto
import java.util.*;
public class AlexAndARhombus
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int count = 0;
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=2*i-1; j++)
      {
        count++;
      }
    }
    
    for(int i = 1; i<=n-1; i++)
    {
      for(int j = 1; j<=2*(n-i)-1; j++)
      {
        count++;
      }
    }
    
    System.out.println(count);
  }
}