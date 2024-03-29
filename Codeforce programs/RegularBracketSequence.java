// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class RegularBracketSequence
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    read.nextLine();
    for(int x = 1; x<=t; x++)
    {
      Stack<Character> arr = new Stack<Character>();
      String s = read.nextLine();
      
      for(int i = 0; i<s.length(); i++)
      {
        if(i == 0 && s.charAt(i) != '?')
        {
          arr.push(s.charAt(i));
        }
        else if(s.charAt(i) == ')' && !arr.empty())
        {
          if(arr.peek() == '(')
          {
            arr.pop();
          }
          else
          {
            arr.push(')');
          }
        }
        else if(s.charAt(i) == '?' && !arr.empty() && arr.peek() == '(')
        {
          arr.pop();
        }
        else
        {
          arr.push('(');
        }
      }
      
      if(arr.empty())
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}