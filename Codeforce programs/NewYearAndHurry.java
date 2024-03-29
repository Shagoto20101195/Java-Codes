//Written by Shagoto
import java.util.*;
public class NewYearAndHurry
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int k = read.nextInt();
    int count = 0;
    int time = 0;
    for(int i = 1; i<=n; i++)
    {
      time += 5*i;
      
      if(time + k <= 240)
      {
        count++;
      }
      else
      {
        break;
      }
    }
    
    System.out.println(count);
  }
}