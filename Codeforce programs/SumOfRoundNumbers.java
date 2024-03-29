//Written by Shagoto
import java.util.*;
public class SumOfRoundNumbers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int num = read.nextInt();
      
      if(num >= 1 && num <= 10)
      {
        System.out.println(1);
        System.out.println(num);
      }
      else
      {
        int count = 0;
        char [] ch = (""+num).toCharArray();
        for(int i = 1; i<ch.length; i++)
        {
          if(ch[i] == '0')
          {
            count++;
          }
        }
        
        if(count == ch.length-1)
        {
          System.out.println(1);
          System.out.println(num);
        }
        else
        {
          ArrayList<Integer> ans = new ArrayList<Integer>();
          while(num > 0)
          {
            if(num / 10000 != 0)
            {
              ans.add(((num / 10000) * 10000));
              num = num % 10000;
            }
            else if(num / 1000 != 0)
            {
              ans.add(((num / 1000) * 1000));
              num = num % 1000;
            }
            else if(num / 100 != 0)
            {
              ans.add(((num / 100) * 100));
              num = num % 100;
            }
            else if(num / 10 != 0)
            {
              ans.add(((num / 10) * 10));
              num = num % 10;
            }
            else
            {
              ans.add(num);
              break;
            }
          }
          System.out.println(ans.size());
          for(int i = 0; i<ans.size(); i++)
          {
            System.out.print(ans.get(i)+" ");
          }
          System.out.println();
        }
      }
    }
  }
}