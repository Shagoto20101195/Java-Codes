import java.util.*;
import java.io.*;
public class FourSegments
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int [] arr = new int[4];
      arr[0] = read.nextInt();
      arr[1] = read.nextInt();
      arr[2] = read.nextInt();
      arr[3] = read.nextInt();
      Arrays.sort(arr);
      
      System.out.println(arr[0]*arr[2]);
    }
  }
}