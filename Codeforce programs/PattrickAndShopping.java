//Written by Shagoto
import java.util.*;
public class PattrickAndShopping
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int d1 = read.nextInt();
    int d2 = read.nextInt();
    int d3 = read.nextInt();
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add((2*d1)+(2*d2));
    arr.add((2*d2)+(2*d3));
    arr.add((2*d1)+(2*d3));
    arr.add(d1+d2+d3);
    
    Collections.sort(arr);
    System.out.println(arr.get(0));
  }
}