//Written by Shagoto
import java.util.Scanner;
public class AntonAndDanik
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    read.nextLine();
    String s = read.nextLine();
    char [] ch = s.toCharArray();
    
    int countA = 0;
    int countD = 0;
    for(int i = 0; i<n; i++)
    {
      if(ch[i] == 'A')
      {
        countA++;
      }
      else if(ch[i] == 'D')
      {
        countD++;
      }
    }
    
    if(countA > countD)
    {
      System.out.println("Anton");
    }
    else if(countD > countA)
    {
      System.out.println("Danik");
    }
    else
    {
      System.out.println("Friendship");
    }
  }
}