//Written by Shagoto
import java.util.*;
public class TheNumberOfPositions
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int a = read.nextInt();
    int b = read.nextInt();
    
    int count = 0;
    int temp1 = 0;
    int temp2 = n - 1;
    for(int i = 1; i<=n; i++)
    {
      if(temp1 >= a && temp2 <= b)
      {
        count++;
      }
      temp1++;
      temp2--;
    }
    
    System.out.println(count);
  }
}