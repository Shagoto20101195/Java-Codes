//Written by Shagoto
import java.util.*;
public class AntonAndLetters
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    char [] ch = s.toCharArray();
    HashSet<Character> a = new HashSet<Character>();
    for(int i = 0; i<ch.length; i++)
    {
      if((int)ch[i] >= 97 && (int)ch[i] <= 122)
      {
        a.add(ch[i]);
      }
    }
    
    System.out.println(a.size());
  }
}