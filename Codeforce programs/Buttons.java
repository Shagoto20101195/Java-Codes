//Written by Shagoto
import java.util.*;
public class Buttons
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    
    int count = n;
    int correctB = 1;
    int wrong = n - 1;
    
    while(wrong > 0)
    {
      wrong--;
      correctB++;
      count += (wrong * correctB) + 1;
    }
    
    System.out.println(count);
  }
}