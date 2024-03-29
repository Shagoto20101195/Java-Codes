//Written by Shagoto
import java.util.*;
public class CaseOfTheZerosAndOnes
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    read.nextLine();
    String s = read.nextLine();
    char [] ch = s.toCharArray();
    int count1 = 0;
    int count0 = 0;
    
    for(int i = 0; i<n; i++)
    {
      if(ch[i] == '0')
      {
        count0++;
      }
      else
      {
        count1++;
      }
    }
    
    if(count0 > count1)
    {
      System.out.println(count0 - count1);
    }
    else if(count0 < count1)
    {
      System.out.println(count1 - count0);
    }
    else
    {
      System.out.println(0);
    }
  }
}