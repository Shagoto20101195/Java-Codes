import java.util.Scanner;
public class Task06
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    System.out.println("Enter number");
    int n = read.nextInt();
    
    int [] a = new int[] {10, 30, 20, 50, 40};
    
    for(int i = 1; i<=n; i++)
    {
      int max = 0;
      int maxIndex = 0;
      
      for(int j = i-1; j<a.length; j++)
      {
        if(a[j] > max)
        {
          max = a[j];
          maxIndex = j;
        }
      }
      
      int temp = a[i-1];
      a[i-1]  = max;
      a[maxIndex] = temp;
    }
    
    for(int i = 0; i<a.length; i++)
    {
      System.out.println(a[i]);
    }
  }
}