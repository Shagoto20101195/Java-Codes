import java.util.*;
import java.io.*;
public class ShovelsAndSwords
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int a = read.nextInt();
      int b = read.nextInt();
      
      System.out.println(Math.min((a+b) / 3, Math.min(a, b)));
    }
  }
}