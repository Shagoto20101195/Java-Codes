//Written by Shagoto
import java.util.*;
public class BlackSquare
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int val1 = read.nextInt();
    int val2 = read.nextInt();
    int val3 = read.nextInt();
    int val4 = read.nextInt();
    read.nextLine();
    String s = read.nextLine();
    int sum = 0;
    
    for(int i = 0; i<s.length(); i++)
    {
      if(s.charAt(i) == '1')
      {
        sum += val1;
      }
      else if(s.charAt(i) == '2')
      {
        sum += val2;
      }
      else if(s.charAt(i) == '3')
      {
        sum += val3;
      }
      else if(s.charAt(i) == '4')
      {
        sum += val4;
      }
    }
    
    System.out.println(sum);
  }
}