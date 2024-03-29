//Written by Shagoto
import java.util.*;
public class UltraFastMathematician
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s1 = read.nextLine();
    char [] ch1 = s1.toCharArray();
    String s2 = read.nextLine();
    char [] ch2 = s2.toCharArray();
    
    for(int i = 0; i<ch1.length; i++)
    {
      if(ch1[i] == ch2[i])
      {
        System.out.print(0);
      }
      else
      {
        System.out.print(1);
      }
    }
    System.out.println();
  }
}