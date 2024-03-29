//Written by Shagoto
import java.util.*;
public class AliceBobAndCandies
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      ArrayList<Integer> a = new ArrayList<Integer>();
      int n = read.nextInt();
      for(int i = 0; i<n; i++)
      {
        a.add(read.nextInt());
      }
      
      int move = 0;
      int sizeA = 0;
      int sizeB = 0;
      int lastA = 0;
      int lastB = 0;
      while(a.size() > 0)
      {
        if(move == 0)
        {
          sizeA += a.get(0);
          lastA = a.get(0);
          move++;
          a.remove(0);
        }
        
        else if(move % 2 == 1)
        {
          lastB = 0;
          while(lastA >= lastB)
          {
            lastB += a.get(a.size()-1);
            sizeB += a.get(a.size()-1);
            a.remove(a.size()-1);
            if(a.size() == 0)
            {
              break;
            }
          }
          move++;
        }
        
        else if(move % 2 == 0)
        {
          lastA = 0;
          while(lastB >= lastA)
          {
            lastA += a.get(0);
            sizeA += a.get(0);
            a.remove(0);
            if(a.size() == 0)
            {
              break;
            }
          }
          move++;
        }
      }
      
      System.out.println(move+" "+sizeA+" "+sizeB);
    }
  }
}