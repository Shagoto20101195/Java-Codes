//Written by Shagoto
import java.util.*;
public class HolidayOfEquality
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] arr = new int[n];
    int max = 0;
    int ans = 0;
    
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextInt();
      
      if(arr[i] > max)
      {
        max = arr[i];
      }
    }
    
    for(int i = 0; i<n; i++)
    {
      ans += max - arr[i];
    }
    
    System.out.println(ans);
  }
}