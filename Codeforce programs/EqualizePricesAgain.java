//Written by Shagoto
import java.util.*;
public class EqualizePricesAgain
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int q = read.nextInt();
    for(int x = 1; x<=q; x++)
    {
      int n = read.nextInt();
      int [] arr = new int[n];
      int sum = 0;
      
      for(int i = 0; i<n; i++)
      {
        arr[i] = read.nextInt();
        sum += arr[i];
      }
      
      if(sum/n*n == sum)
      {
        System.out.println(sum / n);
      }
      else
      {
        System.out.println(sum / n + 1);
      }
    }
  }
}