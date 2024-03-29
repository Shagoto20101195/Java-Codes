//Written by Shagoto
import java.util.*;
public class PuzzlePieces
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int m = read.nextInt();
      
      if(n == 1 || m == 1)
      {
        System.out.println("YES");
      }
      else if(n == 2 && m == 2)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}