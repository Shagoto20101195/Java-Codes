//Written by Shagoto
import java.util.*;
public class ParkLighting
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
   
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int m = read.nextInt();
      int area = n * m;
      
      if(area % 2 == 0)
      {
        System.out.println(area / 2);
      }
      else
      {
        System.out.println(area / 2 + 1);
      }
    }
  }
}