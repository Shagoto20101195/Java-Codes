// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class RedBlueShuffle
{
  public static void main(String[] args) throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(isr);
    
    int t = Integer.parseInt(read.readLine());
    for(int x = 1; x<=t; x++)
    {
      int n = Integer.parseInt(read.readLine());
      String red = read.readLine();
      String blue = read.readLine();
      int countR = 0;
      int countB = 0;
      
      for(int i = 0; i<n; i++)
      {
        
        if(red.charAt(i) > blue.charAt(i))
        {
          countR++;
        }
        else if(blue.charAt(i) > red.charAt(i))
        {
          countB++;
        }
      }
      
      if(countR == countB)
      {
        System.out.println("EQUAL");
      }
      else if(countR > countB)
      {
        System.out.println("RED");
      }
      else
      {
        System.out.println("BLUE");
      }
    }
  }
}