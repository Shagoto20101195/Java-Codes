//Written by Shagoto
import java.util.*;
public class CombinationLock
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    read.nextLine();
    String s1 = read.nextLine();
    String s2 = read.nextLine();
    
    char [] ch1 = s1.toCharArray();
    char [] ch2 = s2.toCharArray();
    int count = 0;
    
    for(int i = 0; i<n; i++)
    {
      if(ch1[i] != ch2[i])
      {
        int temp1 = Integer.parseInt(""+ch1[i]);
        int temp2 = Integer.parseInt(""+ch2[i]);
        
        int fCount = 0;
        int bCount = 0;
        
        if(temp1 > temp2)
        {
          bCount = temp1 - temp2;
          fCount = (10 - temp1) + temp2;
        }
        else
        {
          fCount = temp2 - temp1;
          bCount = (10 - temp2) + temp1;
        }
        
        count += (int)Math.min(fCount, bCount);
      }
    }
    
    System.out.println(count);
  }
}