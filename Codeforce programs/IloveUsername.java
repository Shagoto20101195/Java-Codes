//Written by Shagoto
import java.util.*;
public class IloveUsername
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int max = 0;
    int min = 0;
    int count = 0;
    
    for(int i = 0; i<n; i++)
    {
      int s = read.nextInt();
      if(i == 0)
      {
        max = s;
        min = s;
      }
      else if(s > max)
      {
        max = s;
        count++;
      }
      else if(s < min)
      {
        min = s;
        count++;
      }
    }
    
    System.out.println(count);
  }
}