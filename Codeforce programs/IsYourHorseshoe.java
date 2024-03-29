//Written by Shagoto
import java.util.*;
public class IsYourHorseshoe
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    HashSet<Integer> a = new HashSet<Integer>();
    a.add(read.nextInt());
    a.add(read.nextInt());
    a.add(read.nextInt());
    a.add(read.nextInt());
    
    if(a.size() == 1)
    {
      System.out.println(3);
    }
    else if(a.size() == 2)
    {
      System.out.println(2);
    }
    else if(a.size() == 3)
    {
      System.out.println(1);
    }
    else
    {
      System.out.println(0);
    }
  }
}