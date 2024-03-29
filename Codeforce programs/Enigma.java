import java.util.*;
import java.io.*;
public class Enigma
{
  public static void main(String[] args) throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(isr);
    
    String first = read.readLine();
    String sec = read.readLine();
    int count = 0;
    for(int i = 0; i<=first.length() - sec.length(); i++)
    {
      boolean check = true;
      for(int j = 0; j<sec.length(); j++)
      {
        if(first.charAt(j+i) == sec.charAt(j))
        {
          check = false;
          break;
        }
      }
      
      if(check)
      {
        count++;
      }
    }
    
    System.out.println(count);
  }
}