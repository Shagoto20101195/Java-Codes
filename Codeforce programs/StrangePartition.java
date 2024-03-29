// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class StrangePartition
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int m = read.nextInt();
      long min = 0;
      long max = 0;
      
      for(int i = 0; i<n; i++)
      {
        int num = read.nextInt();
        if(num % m == 0)
        {
          max += num / m;
        }
        else
        {
          max += num / m + 1;
        }
        min += num;
      }
      
      if(min % m == 0)
      {
        System.out.println((min / m)+" "+max);
      }
      else
      {
        System.out.println((min / m + 1)+" "+max);
      }
    }
  }
}