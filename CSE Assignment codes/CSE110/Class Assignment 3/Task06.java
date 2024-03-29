import java.util.Scanner;
public class Task06
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter S");
    Float S = read.nextFloat();
    
    if(S < 100)
    {
      float L = 3000 - (125*S*S);
      System.out.println("L = "+L);
    }
    
    else
    {
      float L = 12000 / (4 + (S*S/149000));
      System.out.println("L = "+L);
    }
  }
}