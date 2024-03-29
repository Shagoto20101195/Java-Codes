//Written by Shagoto
import java.util.*;
public class XeniaAndRingroad
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    long time = 0;
    int ip = 1;
    
    for(int x = 0; x<m; x++)
    {
      int h = read.nextInt();
      
      if(h == ip)
      {
        time += 0;
        ip = h;
      }
      else if(h > ip)
      {
        time += (h - ip);
        ip = h;
      }
      else if(h < ip)
      {
        time += (n - ip) + 1;
        ip = 1;
        time += (h - ip);
        ip = h;
      }
    }
    System.out.println(time);
  }
}