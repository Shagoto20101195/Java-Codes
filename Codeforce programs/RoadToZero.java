//Written by Shagoto
import java.util.*;
public class RoadToZero
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int m = 1; m<=t; m++)
    {
      int x = read.nextInt();
      int y = read.nextInt();
      long a = read.nextLong();
      long b = read.nextLong();
      
      ArrayList<Long> arr = new ArrayList<Long>();
      
      arr.add((x+y)*a);
      int min = (int)Math.min(x,y);
      int max = (int)Math.max(x,y);
      arr.add((min*b)+((max-min) * a));
      
      Collections.sort(arr);
      System.out.println(arr.get(0));
    }
  }
}