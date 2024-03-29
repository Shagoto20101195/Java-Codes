//Written by Shagoto
import java.util.*;
public class TelephoneNumber
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      read.nextLine();
      String s = read.nextLine();
      
      if(n <= 11)
      {
        if(n == 11 && s.charAt(0) == '8')
        {
          System.out.println("YES");
        }
        else
        {
          System.out.println("NO");
        }
      }
      else
      {
        ArrayList<Character> arr = new ArrayList<Character>();
        for(int i = 0; i<n; i++)
        {
          arr.add(s.charAt(i));
        }
        
        if(arr.contains('8') == false)
        {
          System.out.println("NO");
        }
        else
        {
          while(arr.size() > 11)
          {
            if(arr.get(0) == '8')
            {
              arr.remove(arr.size() - 1);
            }
            else
            {
              arr.remove(0);
            }
          }
          
          if(arr.get(0) == '8')
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
  }
}