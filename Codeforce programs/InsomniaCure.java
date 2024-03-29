//Written by Shagoto
import java.util.*;
public class InsomniaCure
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int [] temp = new int[4];
    int k = read.nextInt();
    temp[0] = k;
    int l = read.nextInt();
    temp[1] = l;
    int m = read.nextInt();
    temp[2] = m;
    int n = read.nextInt();
    temp[3] = n;
    Arrays.sort(temp);
    
    int d = read.nextInt();
    
    if(k == 1 || l == 1 || m == 1 || n == 1)
    {
      System.out.println(d);
    }
    else
    {
      ArrayList<Integer> a = new ArrayList<Integer>();
      for(int i = 0; i<d; i++)
      {
        a.add(i+1);
      }
      
      for(int i = 0; i<a.size(); i++)
      {
        if(a.get(i) % temp[0] == 0)
        {
          a.remove(i);
        }
      }
      
      for(int i = 0; i<a.size(); i++)
      {
        if(a.get(i) % temp[1] == 0)
        {
          a.remove(i);
        }
      }
      
      for(int i = 0; i<a.size(); i++)
      {
        if(a.get(i) % temp[2] == 0)
        {
          a.remove(i);
        }
      }
      
      for(int i = 0; i<a.size(); i++)
      {
        if(a.get(i) % temp[3] == 0)
        {
          a.remove(i);
        }
      }
      
      System.out.println(d - a.size());
    }
  }
}