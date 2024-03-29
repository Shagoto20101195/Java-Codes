//Written by Shagoto
import java.util.*;
public class OlympicMedal
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int r1Count = read.nextInt();
    int [] r1arr = new int[r1Count];
    int r1int = 0;
    for(int i = 0; i<r1Count; i++)
    {
      r1arr[i] = read.nextInt();
      if(i == 0)
      {
        r1int = r1arr[i];
      }
      else if(r1arr[i] > r1int)
      {
        r1int = r1arr[i];
      }
    }
    
    int p1Count = read.nextInt();
    int [] p1arr = new int[p1Count];
    int p1int = 0;
    for(int i = 0; i<p1Count; i++)
    {
      p1arr[i] = read.nextInt();
      if(i == 0)
      {
        p1int = p1arr[i];
      }
      else if(p1arr[i] > p1int)
      {
        p1int = p1arr[i];
      }
    }
    
    int p2Count = read.nextInt();
    int [] p2arr = new int[p2Count];
    int p2int = 0;
    for(int i = 0; i<p2Count; i++)
    {
      p2arr[i] = read.nextInt();
      if(i == 0)
      {
        p2int = p2arr[i];
      }
      else if(p2arr[i] < p2int)
      {
        p2int = p2arr[i];
      }
    }
    
    int a = read.nextInt();
    int b = read.nextInt();
    
    double r1 = (double)r1int;
    double p1 = (double)p1int;
    double p2 = (double)p2int;
    
    double r2 = (Math.pow(r1,2)) / (((a * p2)/(b * p1)) + 1);
    System.out.println(Math.sqrt(r2));
  }
}