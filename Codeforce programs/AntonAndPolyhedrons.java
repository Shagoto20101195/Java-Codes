//Written by Shagoto
import java.util.*;
public class AntonAndPolyhedrons
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    read.nextLine();
    int count = 0;
    for(int i = 0; i<n; i++)
    {
      String s = read.nextLine();
      
      if(s.charAt(0) == 'T')
      {
        count += 4;
      }
      else if(s.charAt(0) == 'C')
      {
        count += 6;
      }
      else if(s.charAt(0) == 'O')
      {
        count += 8;
      }
      else if(s.charAt(0) == 'D')
      {
        count += 12;
      }
      else if(s.charAt(0) == 'I')
      {
        count += 20;
      }
    }
    
    System.out.println(count);
  }
}