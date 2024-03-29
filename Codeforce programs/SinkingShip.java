//Written by Shagoto
import java.util.*;
public class SinkingShip
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    read.nextLine();
    ArrayList<String> rat = new ArrayList<String>();
    ArrayList<String> wc = new ArrayList<String>();
    ArrayList<String> man = new ArrayList<String>();
    ArrayList<String> cap = new ArrayList<String>();
    for(int i = 0; i<n; i++)
    {
      String s = read.nextLine();
      String [] temp = s.split(" ");
      
      if(temp[1].equals("captain"))
      {
        cap.add(temp[0]);
      }
      else if(temp[1].equals("man"))
      {
        man.add(temp[0]);
      }
      else if(temp[1].equals("woman"))
      {
        wc.add(temp[0]);
      }
      else if(temp[1].equals("child"))
      {
        wc.add(temp[0]);
      }
      else if(temp[1].equals("rat"))
      {
        rat.add(temp[0]);
      }
    }
    
    for(int i = 0; i<rat.size(); i++)
    {
      System.out.println(rat.get(i));
    }
    for(int i = 0; i<wc.size(); i++)
    {
      System.out.println(wc.get(i));
    }
    for(int i = 0; i<man.size(); i++)
    {
      System.out.println(man.get(i));
    }
    for(int i = 0; i<cap.size(); i++)
    {
      System.out.println(cap.get(i));
    }
  }
}