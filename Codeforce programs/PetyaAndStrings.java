//Written by Shagoto
import java.util.Scanner;
public class PetyaAndStrings
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s1 = read.nextLine();
    s1 = s1.toUpperCase();
    char [] fWord = s1.toCharArray();
    String s2 = read.nextLine();
    s2 = s2.toUpperCase();
    char [] sWord = s2.toCharArray();
    
    int fString = 0;
    int sString = 0;
    
    for(int i = 0; i<s1.length(); i++)
    {
      fString = (int)fWord[i];
      sString = (int)sWord[i];
      
      if(fString == sString)
      {
        continue;
      }
      else
      {
        break;
      }
    }
    
    
    if(fString == sString)
    {
      System.out.println(0);
    }
    else if(fString > sString)
    {
      System.out.println(1);
    }
    else
    {
      System.out.println(-1);
    }
  }
}