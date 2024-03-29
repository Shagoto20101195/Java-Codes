//Written by Shagoto
import java.util.*;
public class CopyCopyCopyCopyCopy
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      HashSet<Integer> arr = new HashSet<Integer>();
      int n = read.nextInt();
      for(int i = 0; i<n; i++)
      {
        arr.add(read.nextInt());
      }
      
      System.out.println(arr.size());
    }
  }
}