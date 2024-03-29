//Written by Shagoto
import java.util.*;
public class VusCossackAndContest
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int k = read.nextInt();
    int m = read.nextInt();
    
    if(k >= n && m >= n)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}