//Written by Shagoto
import java.util.*;
import java.io.*;
public class CellsNotUnderAttack
{
  public static void main(String[]args) throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(isr);
    
    String initial = read.readLine();
    String [] temp1 = initial.split(" ");
    long n = Long.parseLong(temp1[0]);
    int m = Integer.parseInt(temp1[1]);;
    HashSet<Long> row = new HashSet<Long>();
    HashSet<Long> col = new HashSet<Long>();
    long lastIndexR = n;
    long lastIndexC = n;
    
    for(int i = 0; i<m; i++)
    {
      String input = read.readLine();
      String [] temp2 = input.split(" ");
      
      long r = Long.parseLong(temp2[0]);
      long c = Long.parseLong(temp2[1]);
      
      if(i == 0)
      {
        row.add(r);
        col.add(c);
        lastIndexR--;
        lastIndexC--;
      }
      else if(row.contains(r) && col.contains(c))
      {
      }
      else if(row.contains(r))
      {
        lastIndexR--;
        col.add(c);
      }
      else if(col.contains(c))
      {
        lastIndexC--;
        row.add(r);
      }
      else
      {
        row.add(r);
        col.add(c);
        lastIndexR--;
        lastIndexC--;
      }
      
      System.out.print(lastIndexR * lastIndexC);
      if(i < m-1)
      {
        System.out.print(" ");
      }
    }
  }
}