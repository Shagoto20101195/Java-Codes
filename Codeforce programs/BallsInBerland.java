import java.util.*;
import java.io.*;
public class BallsInBerland
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int a = read.nextInt();
      int b = read.nextInt();
      int k = read.nextInt();
      int [] boy = new int[a+1];
      int [] girl = new int[b+1];
      int [] temp = new int[k];
      
      ArrayList<Pair> pairs = new ArrayList<>();
      for(int i = 0; i<k; i++)
      {
        int v = read.nextInt();
        temp[i] = v;
        boy[v]++;
      }
      for(int i = 0; i<k; i++)
      {
        int v = read.nextInt();
        girl[v]++;
        pairs.add(new Pair(temp[i], v));
      }
      
      long count = 0;
      for(int i = 0; i<k; i++)
      {
        count += k - boy[pairs.get(i).boy] - girl[pairs.get(i).girl] + 1;
      }
      
      System.out.println(count / 2);
    }
  }
}

class Pair
{
  int boy;
  int girl;
  
  public Pair(int x, int y)
  {
    boy = x;
    girl = y;
  }
}