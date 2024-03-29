//Written by Shagoto
import java.util.*;
public class NastyaAndRice
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int a = read.nextInt();
      int b = read.nextInt();
      int c = read.nextInt();
      int d = read.nextInt();
      
      int temp1 = n * (a+b);
      int temp2 = n * (a-b);
      
      if(temp1 < c - d || c + d < temp2)
      {
        System.out.println("No");
      }
      else
      {
        System.out.println("Yes");
      }
    }
  }
}