//Written by Shagoto
import java.util.*;
public class CheapTravel
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int n = read.nextInt();
    int m = read.nextInt();
    int a = read.nextInt();
    int b = read.nextInt();
    
    arr.add(n * a);
    
    if(n % m == 0)
    {
      arr.add(n / m * b);
    }
    else
    {
      arr.add((n / m * b) + (n % m * a));
      arr.add((n / m * b) + (n % m * b));
      arr.add((n / m + 1) * b);
    }
    
    Collections.sort(arr);
    
    if(n < m && b < n*a)
    {
      System.out.println(b);
    }
    else
    {
      System.out.println(arr.get(0));
    }
  }
}