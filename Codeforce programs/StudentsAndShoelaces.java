// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class StudentsAndShoelaces
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int e = read.nextInt();
    ArrayList<Integer> [] arr = new ArrayList[n+1];
    
    for(int i = 0; i<n+1; i++)
    {
      arr[i] = new ArrayList<Integer>();
    }
    
    for(int i = 0; i<e; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      arr[u].add(v);
      arr[v].add(u);
    }
    
    int group = 0;
    while(true)
    {
      int count = 0;
      ArrayList<Integer> temp = new ArrayList<Integer>();
      for(int i = 1; i<=n; i++)
      {
        if(arr[i].size() == 1)
        {
          count++;
          temp.add(i);
          arr[i] = new ArrayList<Integer>();
        }
      }
      
      for(int i = 1; i<=n; i++)
      {
        for(int j = 0; j<temp.size(); j++)
        {
          if(arr[i].contains(temp.get(j)))
          {
            arr[i].remove(arr[i].indexOf(temp.get(j)));
          }
        }
      }
      
      if(count == 0)
      {
        break;
      }
      else
      {
        group++;
      }
    }
    
    System.out.println(group);
  }
}