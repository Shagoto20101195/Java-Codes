//Written by Shagoto
import java.util.*;
public class IQTest
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    int n = read.nextInt();
    int count1 = 0;
    int count2 = 0;
    int temp1 = 0;
    int temp2 = 0;
    
    for(int i = 0; i<n; i++)
    {
      a.add(read.nextInt());
      
      if(a.get(i) % 2 == 0)
      {
        count1++;
        temp1 = a.get(i);
      }
      else
      {
        count2++;
        temp2 = a.get(i);
      }
    }
    
    if(count1 == 1)
    {
      System.out.println(a.indexOf(temp1) + 1);
    }
    else if(count2 == 1)
    {
      System.out.println(a.indexOf(temp2) + 1);
    }
  }
}