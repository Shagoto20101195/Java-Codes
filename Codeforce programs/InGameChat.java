// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class InGameChat
{
  public static void main(String[] args) throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(isr);
//    Scanner read = new Scanner(System.in);
    
    int t = Integer.parseInt(read.readLine());
    for(int x = 1; x<=t; x++)
    {
      int n = Integer.parseInt(read.readLine());
      String s = read.readLine();
      
      int count = 0;
      for(int i = n-1; i>=0; i--)
      {
        if(s.charAt(i) == ')')
        {
          count++;
        }
        else
        {
          break;
        }
      }
      
      if(count > n - count)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
  }
}