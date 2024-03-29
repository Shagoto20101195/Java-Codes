import java.util.*;
public class FractionalKnapsack
{
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int kW = read.nextInt();
    
    int [] val = new int[n];
    int [] weight = new int[n];
    
    for(int i = 0; i<n; i++)
    {
      weight[i] = read.nextInt();
    }
    
    for(int i = 0; i<n; i++)
    {
      val[i] = read.nextInt();
    }
    
    ArrayList<Pair> pairs = new ArrayList<>();
    for(int i = 0; i<n; i++)
    {
      int perVal = val[i] / weight[i];
      pairs.add(new Pair(perVal, i));
    }
    
    Collections.sort(pairs, new Comparator<Pair>(){
      public int compare(Pair a, Pair b)
      {
        return b.perUnit - a.perUnit;
      }
    });
       
    int maxVal = 0;
    int curW = kW;
    int index = 0;
    
    while(curW > 0 && index < n)
    {
      Pair curItem = pairs.get(index);
      int weight_of_item = weight[curItem.itemIndex];
      int val_of_item = val[curItem.itemIndex];
      int perUnit_of_item = curItem.perUnit;
      
      if(weight_of_item <= curW)
      {
        curW -= weight_of_item;
        maxVal += val_of_item;
        index++;
      }
      else
      {
        int partial = weight_of_item - curW;
        curW -= partial;
        maxVal += perUnit_of_item * partial;
        index++;
      }
    }
    
    System.out.println(maxVal);
  }
}

class Pair
{
  int perUnit;
  int itemIndex;
  
  public Pair(int x, int y)
  {
    perUnit = x;
    itemIndex = y;
  }
}