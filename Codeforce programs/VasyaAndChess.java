import java.util.*;
import java.io.*;
public class VasyaAndChess
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    if(n % 2 == 0)
    {
      System.out.println("white");
      System.out.println("1 2");
    }
    else
    {
      System.out.println("black");
    }
  }
}