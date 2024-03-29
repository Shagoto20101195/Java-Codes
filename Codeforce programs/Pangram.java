//Written by Shagoto
import java.util.*;
public class Pangram
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    HashSet<Character> a = new HashSet<Character>();
    int n = read.nextInt();
    read.nextLine();
    String s = read.nextLine();
    s = s.toUpperCase();
    
    for(int i = 0; i<n; i++)
    {
      a.add(s.charAt(i));
    }
    
    if(a.size() == 26)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}