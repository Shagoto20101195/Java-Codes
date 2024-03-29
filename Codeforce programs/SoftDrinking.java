//Written by Shagoto
import java.util.*;
public class SoftDrinking
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int k = read.nextInt();
    int l = read.nextInt();
    int c = read.nextInt();
    int d = read.nextInt();
    int p = read.nextInt();
    int nl = read.nextInt();
    int np = read.nextInt();
    
    int temp1 = k * l / nl;
    int temp2 = c * d;
    int temp3 = p / np;
    
    int ans = Math.min(temp1, Math.min(temp2, temp3));
    System.out.println(ans / n);
  }
}