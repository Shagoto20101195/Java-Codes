//Written by Shagoto
import java.util.*;
public class Reconnaissance2
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] a = new int[n];
    int dif = 1000;
    int index1 = 0;
    int index2 = 0;
    
    for(int i = 0; i<n; i++)
    {
      a[i] = read.nextInt();
    }
    
    for(int i = 0; i<n-1; i++)
    {
      int temp = (int)Math.abs(a[i] - a[i+1]);
      
      if(temp < dif)
      {
        dif = temp;
        index1 = i + 1;
        index2 = i + 2;
      }
    }
    
    if((int)Math.abs(a[0] - a[n-1]) < dif)
    {
      index1 = 1;
      index2 = n;
    }
    
    System.out.println(index1+" "+index2);
  }
}