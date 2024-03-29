//Written by Shagoto
import java.util.*;
public class NightAtTheMuseum
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    String s = read.nextLine();
    char [] ch = s.toCharArray();
    int count = 0;
    int point = (int)'a';
    
    for(int i = 0; i<ch.length; i++)
    {
      int temp = (int)ch[i];
      int max = Math.max(point, temp);
      int min = Math.min(point, temp);
      
      if(max - min < 14)
      {
        count += max - min;
      }
      else
      {
        count += 26 - (max - min);
      }
      
      point = (int)ch[i];
    }
    
    System.out.println(count);
  }
}