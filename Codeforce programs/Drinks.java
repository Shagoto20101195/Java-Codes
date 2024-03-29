//Written by Shagoto
import java.util.*;
public class Drinks
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    double n = read.nextDouble();
    double sum = 0.0;
    double [] p = new double[(int)n];
    
    for(int i = 0; i<p.length; i++)
    {
      p[i] = read.nextDouble();
      sum += p[i] / 100;
    }
    
    System.out.println(sum / n * 100);
  }
}