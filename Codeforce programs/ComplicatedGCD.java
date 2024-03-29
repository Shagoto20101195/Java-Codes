//Written by Shagoto
import java.util.*;
import java.io.*;
public class ComplicatedGCD
{
  public static void main(String[]args) throws IOException
  {
//    Scanner read = new Scanner(System.in);
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(r);
    
    ArrayList<String> a = new ArrayList<String>();
    String [] s = (read.readLine()).split(" ");
    String s1 = s[0];
    a.add(s1);
    String s2 = s[1];
    if(a.contains(s2))
    {
      System.out.println(a.get(0));
    }
    else
    {
      System.out.println(1);
    }
  }
}