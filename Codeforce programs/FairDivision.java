// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class FairDivision
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] arr = new int[3];
      int sum = 0;
      for(int i = 0; i<n; i++)
      {
        int v = read.nextInt();
        sum += v;
        arr[v]++;
      }
      
      if(sum % 2 == 1 || (sum % 2 == 0 && n % 2 == 1 && arr[1] == 0))
      {
        System.out.println("NO");
      }
      else
      {
        System.out.println("YES");
      }
    }
  }
}