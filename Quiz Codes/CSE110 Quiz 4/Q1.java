import java.util.Scanner;
public class Q1
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int [] a = new int[10];
    int [] b = new int[10];
    int count = 0;
    for(int i = 0; i<a.length; i++)
    {
      System.out.println("Enter number");
      a[i] = read.nextInt();
      if(a[i] % 2 == 1)
      {
         b[count] = a[i];
         count++;
      }
    }
    
    for(int i = 0; i<count; i++)
    {
      System.out.println(b[i]);
    }
  }
}