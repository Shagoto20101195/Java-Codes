//Written by Shagoto
import java.util.*;
import java.io.*;
public class RegistrationSystem
{
  public static void main(String[]args) throws IOException
  {
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(r);
    
    HashMap<String, Integer> a = new HashMap<String, Integer>();
    String n = read.readLine();

    for(int x = 1; x<=Integer.parseInt(n); x++)
    {
      String s = read.readLine();
      
      if(x == 1)
      {
        a.put(s, 0);
        System.out.println("OK");
      }
      else if(a.containsKey(s) == true)
      {
        int temp = a.get(s) + 1;
        a.put(s, temp);
        System.out.println(s+temp);
      }
      else
      {
        a.put(s, 0);
        System.out.println("OK");
      }
    }
  }
}