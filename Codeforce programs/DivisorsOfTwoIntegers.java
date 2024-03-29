//Written by Shagoto
import java.util.*;
public class DivisorsOfTwoIntegers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
     int n = read.nextInt();
    int [] a = new int[n];
    int max = 0;
    for(int i = 0; i<a.length; i++)
    {
      a[i] = read.nextInt();
      if(a[i] > max)
      {
        max = a[i];
      }
    }
    
    Arrays.sort(a);
    int lastNum = 0;
    for(int i = 0; i<a.length; i++)
    {
      if(a[i] == lastNum)
      {
      }
      else
      {
        if(max % a[i] == 0)
        {
          lastNum = a[i];
          a[i] = 0;
        }
      }
    }
    
    Arrays.sort(a);
    System.out.println(max+" "+a[n-1]);
  }
}