//Written by Shagoto
import java.util.*;
public class ABCompilationErrors
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long ans1 = 0;
    long ans2 = 0;
    long sumA = 0;
    long sumB = 0;
    long sumC = 0;
    
    int n = read.nextInt();
    for(int i = 0; i<n; i++)
    {
      long temp = read.nextLong();
      sumA += temp;
    }
    
    for(int i = 0; i<n-1; i++)
    {
      long temp = read.nextLong();
      sumB += temp;
    }
    
    ans1 = sumA - sumB;
    
    for(int i = 0; i<n-2; i++)
    {
      long temp = read.nextLong();
      sumC += temp;
    }
    
    ans2 = sumB - sumC;
    
    System.out.println(ans1+"\n"+ans2);
  }
}