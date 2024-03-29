//Written by Shagoto
import java.util.*;
public class MinutesBeforeNewYear
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int i = 1; i<=t; i++)
    {
      int h = read.nextInt();
      int m = read.nextInt();
      
      System.out.println(1440 - (h*60 + m));
    }
  }
}