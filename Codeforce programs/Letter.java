//Written by Shagoto
import java.util.*;
public class Letter
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s1 = read.nextLine();
    String s2 = read.nextLine();
    s1 = s1.replace(" ","");
    s2 = s2.replace(" ","");
    
    ArrayList<Character> a = new ArrayList<Character>();
    for(int i = 0; i<s1.length(); i++)
    {
      a.add(s1.charAt(i));
    }
    
    int count = 0;
    for(int i = 0; i<s2.length(); i++)
    {
      if(a.contains(s2.charAt(i)))
      {
        count++;
        a.remove(a.indexOf(s2.charAt(i)));
      }
      else
      {
        break;
      }
    }
    
    if(count == s2.length())
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}