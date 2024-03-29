//Written by Shagoto
import java.util.Scanner;
public class RomaAndLuckyNumbers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] a = new int[n];
    int k = read.nextInt();
    int count = 0;
    
    for(int i = 0; i<a.length; i++)
    {
      a[i] = read.nextInt();
      String temp = ""+a[i];
      
      if(temp.length() < k)
      {
        count++;
      }
      else
      {
        int numCount = 0;
        char [] ch = temp.toCharArray();
        for(int j = 0; j<ch.length; j++)
        {
          if(ch[j] == '4' || ch[j] == '7')
          {
            numCount++;
          }
        }
        
        if(numCount <= k)
        {
          count++;
        }
      }
    }
    
    System.out.println(count);
  }
}