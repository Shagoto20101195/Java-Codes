// Note that here Max-Heap is used
// Everything is 1-index based (even input array)
import java.util.*;
public class HeapDSandSort
{
  // Infinity
  static int infinity = Integer.MAX_VALUE;
  
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    // Enter an Array first (1-index based)
    int n = read.nextInt();
    int [] arr = new int[n+1];
    for(int i = 1; i<=n; i++)
    {
      arr[i] = read.nextInt();
    }
    
    // Build a Heap from Array
    Heap hp = new Heap();
    hp.buildHeap1(arr);
    
    hp.printHeap();
    
    
  }
}

class Heap
{
  int [] arr;
  
  public Heap()
  {
  }
  
  // Method for building a Heap from Array
  // Time Complexity: O(n logn)
  public void buildHeap1(int [] array)
  {
    arr = new int[2];
    arr[1] = array[1];
    for(int i = 2; i<=array.length-1; i++)
    {
      insert(array[i]);
    }
  }
  
  // This one also gives more accurate build
  // Time Complexity: O(n)
  public void buildHeap2(int [] array)
  {
    // Basically building a binary tree of the initial array
    arr = new int[array.length];
    for(int i = 1; i<=array.length-1; i++)
    {
      arr[i] = array[i];
    }
    
    // Starting from half index, sinking every element
    for(int i = array.length / 2; i>=1; i--)
    {
      sink(i);
    }
  }
  
  // Inserting Element (Swimming is done, that is, comparing all the way to up)
  // Can be done with either iteration or Swim method
  public void insert(int elem)
  {
    arr = buildArr(); // Making new Array with an extra slot
    arr[arr.length-1] = elem; // Inserting the element to last index (1-index based)
    
    int i = arr.length-1; // Last index
    int parInd = parent(i); // Parent of last index
    
    // While top not reached and parent value is smaller than child
    while(i > 1 && arr[parInd] < arr[i])
    {
      // Swap the parent and child value
      int temp = arr[i];
      arr[i] = arr[parInd];
      arr[parInd] = temp;
      
      // Now changing indexes for further iterations
      i = parInd;
      parInd = parent(i);
    }
    
    // Using swim (same thing, just taking last index to be -Infinity):
    // arr = buildArr(arr);
    // arr[arr.length-1] = -infinity;
    // arr = swim(arr.length-1, elem);
  }
  
  // Deleting (top aka max) element (Sinking is done, that is, comparing all the way down)
  // Also used for Max-Heap Extraction (Sorting)
  public int deletion()
  {
    // Initially swapping max element in heap with one at bottom
    int temp = arr[1];
    arr[1] = arr[arr.length-1];
    arr[arr.length-1] = temp;
    
    // Now cutting tie with last element which has max element
    arr = delArr();
    // Lastly sink that top element to bottom
    sink(1);
    
    // Returning the max which was stored, if needed
    return temp;
  }
  
  // Sinking way down (Also called "Max-Heapify")
  public void sink(int i)
  {
    int l = lchild(i);
    int r = rchild(i);
    int heapSize = arr.length - 1;
    // Assuming current index of parent is the actual index of parent
    int ind = i;
    
    // At first compare parent with left child
    // If parent smaller than left child then note the index
    if(l <= heapSize && arr[l] > arr[i])
    {
      ind = l;
    }
    
    // Now compare with right child
    // That is, if parent is smaller than both child, then taking right child's index
    if(r <= heapSize && arr[r] > arr[ind])
    {
      ind = r;
    }
    
    // If assumed index of parent not equals to the parent index
    // (Meaning parent value needs to be swapped with child value)
    // Also the recursive call is to check that child's child (grandchild) for further sinking
    if(ind != i)
    {
      int temp = arr[ind];
      arr[ind] = arr[i];
      arr[i] = temp;
      sink(ind);
    }
  }
  
  // Swimming way up (Also called "Heap-Increase-Key")
  public void swim(int i, int elem)
  {
    if(elem < arr[i]) // elem not likely to be less than -Infinity
    {
      return;
    }
    else
    {
      // Parent of last index
      int parInd = parent(i);
      // While top not reached and parent value is smaller than child
      while(i > 1 && arr[parInd] < arr[i]) 
      {
        // Swap the parent and child value
        int temp = arr[i];
        arr[i] = arr[parInd];
        arr[parInd] = temp;
        
        // Now changing indexes for further iterations
        i = parInd;
        parInd = parent(i);
      }
    }
  }
  
  // Sorting (Also called "Max-Heap Extraction")
  // It only keeps deleting top element
  // Giving a descending sort
  public int [] sort()
  {
    // But I'm doing ascending here
    int ind = arr.length - 1;
    int [] sorted = new int[arr.length];
    while(arr.length > 1)
    {
      sorted[ind--] = deletion();
    }
    
    return sorted;
  }
  
  // Method for parent index
  public int parent(int i)
  {
    return i / 2;
  }
  
  // Method for left child index
  public int lchild(int i)
  {
    return i * 2;
  }
  
  // Method for right child index
  public int rchild(int i)
  {
    return (i * 2) + 1;
  }
  
  // Method for printing
  public void printHeap()
  {
    for(int i = 1; i<=arr.length-1; i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  // Building new Array (Resize by +1)
  public int [] buildArr()
  {
    int [] newArr = new int[arr.length+1];
    
    for(int i = 1; i<=arr.length-1; i++)
    {
      newArr[i] = arr[i];
    }
    
    return newArr;
  }
  
  // Building new Array (Resize by -1)
  public int [] delArr()
  {
    int [] newArr = new int[arr.length-1];
    
    for(int i = 1; i<=arr.length-2; i++)
    {
      newArr[i] = arr[i];
    }
    
    return newArr;
  }
}