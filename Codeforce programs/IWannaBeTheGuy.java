//Written by Shagoto
import java.util.*;
public class IWannaBeTheGuy
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    HashSet<Integer> a = new HashSet<Integer>();
    int n = read.nextInt();
    
    int p = read.nextInt();
    for(int i = 1; i<=p; i++)
    {
      a.add(read.nextInt());
    }
    
    int q = read.nextInt();
    for(int i = 1; i<=q; i++)
    {
      a.add(read.nextInt());
    }
    
    if(n == a.size())
    {
      System.out.println("I become the guy.");
    }
    else
    {
      System.out.println("Oh, my keyboard!");
    }
  }
}