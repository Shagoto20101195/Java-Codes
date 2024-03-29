//Written by Shagoto
import java.util.*;
public class VanyaAndCubes
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int height = 0;
    
    for(int i = 1; n > 0; i++)
    {
      n -= i * (i + 1) / 2;
      
      if(n >= 0)
      {
        height++;
      }
    }
    
    System.out.println(height);
  }
}