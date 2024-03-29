//Written by Shagoto
import java.util.*;
public class AntonAndDigits
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int digit2 = read.nextInt();
    int digit3 = read.nextInt();
    int digit5 = read.nextInt();
    int digit6 = read.nextInt();
    
    int sum = 0;
    while(digit2 > 0 && digit5 > 0 && digit6 > 0)
    {
      sum += 256;
      digit2--;
      digit5--;
      digit6--;
    }
    
    while(digit2 > 0 && digit3 > 0)
    {
      sum += 32;
      digit2--;
      digit3--;
    }
    
    System.out.println(sum);
  }
}