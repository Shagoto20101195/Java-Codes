//Written by Shagoto
//I solved it without understanding
import java.util.*;
public class Puzzles
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    
    int [] a = new int[m];
    for(int i = 0; i<m; i++)
    {
      a[i] = read.nextInt();
    }
    
    Arrays.sort(a);
    int ans = 1000;
    for(int i = 0; i+n-1<m; i++)
    {
      ans = Math.min(ans, a[i+n-1]-a[i]);
    }
    
    System.out.println(ans);
  }
}