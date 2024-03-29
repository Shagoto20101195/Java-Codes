//Written by Shagoto
import java.util.*;
public class RestoringThreeNumbers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    int max = 0;
    for(int i = 0; i<4; i++)
    {
      a.add(read.nextInt());
      if(a.get(i) > max)
      {
        max = a.get(i);
      }
    }
    
    a.remove(a.indexOf(max));
    System.out.println((max - a.get(0))+" "+(max - a.get(1))+" "+(max - a.get(2)));
  }
}