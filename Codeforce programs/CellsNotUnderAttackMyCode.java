//Written by Shagoto
import java.util.*;
public class CellsNotUnderAttackMyCode
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    long total = n*n;
    long m = read.nextLong();
    HashSet<Long> row = new HashSet<Long>();
    HashSet<Long> col = new HashSet<Long>();
    long lastIndexR = 1;
    long lastIndexC = 1;
    long remove = 0;
    
    for(long i = 0; i<m; i++)
    {
      long r = read.nextLong();
      long c = read.nextLong();
      
      if(i == 0)
      {
        row.add(r);
        col.add(c);
        remove = (n - lastIndexR) + (n - lastIndexC) + 1;
      }
      else if(row.contains(r) && col.contains(c))
      {
        remove = 0;
      }
      else if(row.contains(r))
      {
        remove = (n - lastIndexC);
        lastIndexR++;
        col.add(c);
      }
      else if(col.contains(c))
      {
        remove = (n - lastIndexR);
        lastIndexC++;
        row.add(r);
      }
      else
      {
        row.add(r);
        col.add(c);
        lastIndexR++;
        lastIndexC++;
        remove = (n - lastIndexR) + (n - lastIndexC) + 1;
      }
      
      total = total - remove;
      System.out.print(total);
      if(i < m-1)
      {
        System.out.print(" ");
      }
    }
  }
}