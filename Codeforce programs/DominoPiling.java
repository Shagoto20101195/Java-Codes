//Written by Shagoto
import java.util.Scanner;
public class DominoPiling
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int M = read.nextInt();
    int N = read.nextInt();
    int D = 2;
    
    if(M>=1 && M<=N && N<=16)
    {
      int Area = M * N;
      System.out.println(Area/D);
    }
  }
}