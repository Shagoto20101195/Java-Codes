//Written by Shagoto
import java.util.Scanner;
public class BoyorGirl
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
   
    String name = read.nextLine();
    char [] ch = name.toCharArray();
    int [] count = new int[100];
    
    for(int i = 0; i<name.length(); i++)
    {
      count[i] = 1;
      for(int j = i-1; j>=0; j--)
      {
        if(ch[i] != ch[j])
        {
          count[i] = 1;
        }
        else
        {
          count[i] = 0;
          break;
        }
      }
    }
    
    int sum = 0;
    for(int i = 0; i<name.length(); i++)
    {
      sum += count[i];
    }
    
    if(sum % 2 == 0)
    {
      System.out.println("CHAT WITH HER!");
    }
    else
    {
      System.out.println("IGNORE HIM!");
    }
  }
}