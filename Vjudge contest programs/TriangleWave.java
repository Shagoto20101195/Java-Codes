//Written by Shagoto
//Source - UVA
import java.util.*;
public class TriangleWave
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int T = read.nextInt();
    for(int x = 1; x<=T; x++)
    {
      int amp = read.nextInt();
      int freq = read.nextInt();
      
      String wave = "";
      for(int i = 1; i<=amp; i++)
      {
        for(int j = 1; j<=i; j++)
        {
          wave = wave + i;
        }
        wave = wave + "\n";
      }
      
      for(int i = amp-1; i>=1; i--)
      {
        for(int j = 1; j<=i ; j++)
        {
          wave = wave + i;
        }
        wave = wave + "\n";
      }
      
      for(int i = 1; i<=freq; i++)
      {
        System.out.print(wave);
        if(i < freq)
        {
          System.out.println();
        }
      }
      
      if(x < T)
      {
        System.out.println();
      }
    }
  }
}