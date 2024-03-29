//Written by Shagoto
import java.util.*;
public class Dragons
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
   
    ArrayList<Dragon> arr = new ArrayList<>();
    int s = read.nextInt();
    int n = read.nextInt();
   
    for(int i = 0; i<n; i++)
    {
      arr.add(new Dragon(read.nextInt(),read.nextInt()));
    }
   
    Collections.sort(arr, new Comparator<Dragon>(){
      public int compare(Dragon a, Dragon b)
      {
        if(a.hp == b.hp)
        {
          return b.bonus - a.bonus;
        }
        else
        {
          return a.hp - b.hp;
        }
      }
    });
   
    int count = 0;
    for(int i = 0; i<n; i++)
    {
      String [] temp = arr.get(i).toString().split(" ");
      int draghp = Integer.parseInt(temp[0]);
      int bhp = Integer.parseInt(temp[1]);
     
      if(s > draghp)
      {
        s += bhp;
        count++;
      }
      else
      {
        break;
      }
    }
   
    if(count == n)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}

class Dragon
{
  int hp;
  int bonus;
  public Dragon(int x, int y)
  {
    hp = x;
    bonus = y;
  }
 
  public String toString()
  {
    return hp+" "+bonus;
  }
}