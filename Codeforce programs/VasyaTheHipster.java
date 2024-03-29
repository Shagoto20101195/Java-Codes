//Written by Shagoto
import java.util.*;
public class VasyaTheHipster
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int r = read.nextInt();
    int b = read.nextInt();
    
    System.out.println((int)Math.min(r,b)+" "+(int)Math.abs(r - b) / 2);
  }
}