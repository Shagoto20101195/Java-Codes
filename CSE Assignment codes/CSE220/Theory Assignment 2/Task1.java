import java.util.*;
public class Task1
{
  static int powerN(int base, int n)
  {
    if(n == 0)
    {
      return 1;
    }
    
    return powerN(base, n-1) * base;
  }
  
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    System.out.println(powerN(n, m));
  }
}