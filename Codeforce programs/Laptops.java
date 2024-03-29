//Written by Shagoto
import java.util.*;
public class Laptops
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    ArrayList<Laptop> arr = new ArrayList<>();
    int n = read.nextInt();
    for(int i = 0; i<n; i++)
    {
      arr.add(new Laptop(read.nextInt(), read.nextInt()));
    }
    
    Collections.sort(arr, new Comparator<Laptop>(){
      public int compare(Laptop a, Laptop b)
      {
        return a.price - b.price;
      }
    });
    
    boolean check = false;
    for(int i = 1; i<n; i++)
    {
      int p1 = arr.get(i-1).getP();
      int q1 = arr.get(i-1).getQ();
      int p2 = arr.get(i).getP();
      int q2 = arr.get(i).getQ();
      
      if(p1 < p2 && q1 > q2)
      {
        check = true;
        break;
      }
    }
    
    if(check)
    {
      System.out.println("Happy Alex");
    }
    else
    {
      System.out.println("Poor Alex");
    }
  }
}

class Laptop
{
  int price;
  int quality;
  
  public Laptop(int x, int y)
  {
    price = x;
    quality = y;
  }
  
  public int getP()
  {
    return price;
  }
  
  public int getQ()
  {
    return quality;
  }
}