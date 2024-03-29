import java.io.*;
public class StrangeFunctions
{
  public static void main(String[] args) throws IOException
  { 
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(isr); 
    
    int t = Integer.parseInt(read.readLine());
    for(int x = 1; x<=t; x++)
    {
      String s = read.readLine();
      System.out.println(s.length());
    }
  }
}