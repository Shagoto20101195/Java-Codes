//Written by Shagoto
import java.util.*;
public class Square
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      boolean check = true;
      int a = read.nextInt();
      int b = read.nextInt();
      if(a == b)
      {
        check = false;
      }
      int c = read.nextInt();
      int d = read.nextInt();
      if(c == d)
      {
        check = false;
      }
      
      if(a != b && a != c && a != d && b != c && b != d &&  c != d)
      {
        System.out.println("NO");
      }
      else if(check == true)
      {
        ArrayList<Integer> r1 = new ArrayList<Integer>();
        ArrayList<Integer> r2 = new ArrayList<Integer>();
        int common = 0;
        r1.add(a);
        r1.add(b);
        r2.add(c);
        r2.add(d);
        if(r1.contains(c))
        {
          if(r1.contains(d))
          {
            if(c > d)
            {
              common = c;
            }
            else
            {
              common = d;
            }
          }
          else
          {
            common = c;
          }
          if(common < d || common < a || common < b)
          {
            System.out.println("NO");
          }
          else
          {
            r1.remove(r1.indexOf(common));
            r2.remove(r2.indexOf(common));
            if(r1.get(0) + r2.get(0) == common)
            {
              System.out.println("YES");
            }
            else
            {
              System.out.println("NO");
            }
          }
        }
        else if(r1.contains(d))
        {
          if(r1.contains(c))
          {
            if(c > d)
            {
              common = c;
            }
            else
            {
              common = d;
            }
          }
          else
          {
            common = d;
          }
          if(common < c || common < a || common < b)
          {
            System.out.println("NO");
          }
          else
          {
            r1.remove(r1.indexOf(common));
            r2.remove(r2.indexOf(common));
            if(r1.get(0) + r2.get(0) == common)
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
      
      else
      {
        System.out.println("NO");
      }
    }
  }
}