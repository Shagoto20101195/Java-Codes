//Written by Shagoto
import java.util.*;
public class Football43A
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    read.nextLine();
    ArrayList<String> a = new ArrayList<String>();
    int count1 = 0;
    int count2 = 0;
    for(int i = 0; i<n; i++)
    {
      String s = read.nextLine();
      
      if(i == 0)
      {
        a.add(s);
        count1++;
      }
      else if(a.contains(s))
      {
        if(a.get(0).equals(s))
        {
          count1++;
        }
        else
        {
          count2++;
        }
      }
      else
      {
        a.add(s);
        count2++;
      }
    }
    
    if(count1 > count2)
    {
      System.out.println(a.get(0));
    }
    else
    {
      System.out.println(a.get(1));
    }
  }
}