// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class BovineDilemma
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      HashSet<Double> uni = new HashSet<Double>();
      int n = read.nextInt();
      int [] arr = new int[n];
      for(int i = 0; i<n; i++)
      {
        arr[i] = read.nextInt();
      }
      
      for(int i = 0; i<n-1; i++)
      {
        for(int j = i+1; j<n; j++)
        {
          uni.add(0.5*(arr[j] - arr[i]));
        }
      }
      
      System.out.println(uni.size());
    }
  }
}