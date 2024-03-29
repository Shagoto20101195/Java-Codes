//Written by Shagoto
import java.util.*;
public class AplusB
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int a = read.nextInt();
      int b = read.nextInt();
      System.out.println(a+b);
    }
  }
}