//Written by Shagoto
import java.util.*;
public class Keyboard
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    ArrayList<Character> ch1 = new ArrayList<Character>();
    ArrayList<Character> ch2 = new ArrayList<Character>();
    ArrayList<Character> ch3 = new ArrayList<Character>();
    
    String s1 = "qwertyuiop";
    String s2 = "asdfghjkl;";
    String s3 = "zxcvbnm,./";
    
    for(int i = 0; i<10; i++)
    {
      ch1.add(s1.charAt(i));
      ch2.add(s2.charAt(i));
      ch3.add(s3.charAt(i));
    }
    
    char p = read.nextLine().charAt(0);
    String s = read.nextLine();
    
    if(p == 'R')
    {
      for(int i = 0; i<s.length(); i++)
      {
        if(s.charAt(i) == 'q' || s.charAt(i) == 'a' || s.charAt(i) == 'z')
        {
          System.out.print(s.charAt(i));
        }
        else if(ch1.contains(s.charAt(i)))
        {
          System.out.print(ch1.get((ch1.indexOf(s.charAt(i)))-1));
        }
        else if(ch2.contains(s.charAt(i)))
        {
          System.out.print(ch2.get((ch2.indexOf(s.charAt(i)))-1));
        }
        else if(ch3.contains(s.charAt(i)))
        {
          System.out.print(ch3.get((ch3.indexOf(s.charAt(i)))-1));
        }
      }
      System.out.println();
    }
    
    else if(p == 'L')
    {
      for(int i = 0; i<s.length(); i++)
      {
        if(s.charAt(i) == 'p' || s.charAt(i) == ';' || s.charAt(i) == '/')
        {
          System.out.print(s.charAt(i));
        }
        else if(ch1.contains(s.charAt(i)))
        {
          System.out.print(ch1.get((ch1.indexOf(s.charAt(i)))+1));
        }
        else if(ch2.contains(s.charAt(i)))
        {
          System.out.print(ch2.get((ch2.indexOf(s.charAt(i)))+1));
        }
        else if(ch3.contains(s.charAt(i)))
        {
          System.out.print(ch3.get((ch3.indexOf(s.charAt(i)))+1));
        }
      }
      System.out.println();
    }
  }
}