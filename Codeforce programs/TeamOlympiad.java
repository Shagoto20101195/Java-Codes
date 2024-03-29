//Written by Shagoto
import java.util.*;
public class TeamOlympiad
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    for(int i = 0; i<n; i++)
    {
      int temp = read.nextInt();
      arr.add(temp);
      
      if(temp == 1)
      {
        count1++;
      }
      else if(temp == 2)
      {
        count2++;
      }
      else
      {
        count3++;
      }
    }
    
    int group = (int)Math.min(count1, (Math.min(count2,count3)));
    
    if(group != 0)
    {
      System.out.println(group);
      for(int i = 0; i<group; i++)
      {
        System.out.println((arr.indexOf(1)+1)+" "+(arr.indexOf(2)+1)+" "+(arr.indexOf(3)+1));
        arr.set(arr.indexOf(1),0);
        arr.set(arr.indexOf(2),0);
        arr.set(arr.indexOf(3),0);
      }
    }
    else
    {
      System.out.println(0);
    }
  }
}