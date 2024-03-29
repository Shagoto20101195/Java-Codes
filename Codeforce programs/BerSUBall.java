//Written by Shagoto
import java.util.*;
public class BerSUBall
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    ArrayList<Integer> boy = new ArrayList<Integer>();
    for(int i = 0; i<n; i++)
    {
      boy.add(read.nextInt());
    }
    
    int m = read.nextInt();
    ArrayList<Integer> girl = new ArrayList<Integer>();
    for(int i = 0; i<m; i++)
    {
      girl.add(read.nextInt());
    }
    
    int count = 0;
    
    Collections.sort(boy);
    Collections.sort(girl);
    
    for(int i = 0; i<boy.size(); i++)
    {
      for(int j = 0; j<girl.size(); j++)
      {
        if((int)Math.abs(boy.get(i) - girl.get(j)) <= 1)
        {
          count++;
          boy.remove(i);
          girl.remove(j);
          
          i = -1;
          break;
        }
      }
    }
    
    System.out.println(count);
  }
}