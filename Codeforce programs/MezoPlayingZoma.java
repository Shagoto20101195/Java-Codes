//Written by Shagoto
import java.util.*;
public class MezoPlayingZoma
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    read.nextLine();
    String s = read.nextLine();
    
    int countL = 0;
    int countR = 0;
    for(int i = 0; i<n; i++)
    {
      if(s.charAt(i) == 'L')
      {
        countL++;
      }
      else
      {
        countR++;
      }
    }
    
    int valL = -1*countL;
    int valR = 1*countR;
    System.out.println((int)Math.abs(valL - valR) + 1);
  }
}