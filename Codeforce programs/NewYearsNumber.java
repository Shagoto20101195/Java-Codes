// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class NewYearsNumber
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      
      if(n % 2020 <= n / 2021)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}