//Written by Shagoto
import java.util.*;
public class BrainsPhotos
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int m = read.nextInt();
    int n = read.nextInt();
    boolean check = true;
    
    for(int i = 1; i<=m; i++)
    {
      for(int j = 1; j<=n; j++)
      {
        char ch = read.next().charAt(0);
        
        if(ch == 'C' || ch == 'M' || ch == 'Y')
        {
          check = false;
        }
      }
    }
    
    if(check)
    {
      System.out.println("#Black&White");
    }
    else
    {
      System.out.println("#Color");
    }
  }
}