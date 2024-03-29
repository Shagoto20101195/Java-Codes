//Written by Shagoto
import java.util.*;
public class DieRoll
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int y = read.nextInt();
    int w = read.nextInt();
    
    int max = Math.max(y,w);
    
    if(max == 1)
    {
      System.out.println(1+"/"+1);
    }
    else if(max == 2)
    {
      System.out.println(5+"/"+6);
    }
    else if(max == 3)
    {
      System.out.println(2+"/"+3);
    }
    else if(max == 4)
    {
      System.out.println(1+"/"+2);
    }
    else if(max == 5)
    {
      System.out.println(1+"/"+3);
    }
    else if(max == 6)
    {
      System.out.println(1+"/"+6);
    }
  }
}