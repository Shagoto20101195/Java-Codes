//Written by Shagoto
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  Reader read = new Reader();
    
    long n = read.nextLong();
    long k = read.nextLong();
    int [] div = new int[(int)n];
    int count = 0;
    
    for(int i = 1; i<=(int)Math.sqrt(n); i++)
    {
      if((int)n % i == 0 &&  i*i != (long)Math.sqrt(n))
      {
        div[count] = i;
        count++;
        div[count] = (int)n / i;
        count++;
      }
      else if((int)n % i == 0 &&  i*i == (int)Math.sqrt(n))
      {
        div[count] = i;
        if((int)n / i != (int)Math.sqrt(n))
        {
          count++;
          div[count] = (int)n / i;
        }
      }
    }
    
   // FastSort fs = new FastSort();
    Arrays.sort(div, 0, count);
    
    if(div[(int)k-1] == 0)
    {
      System.out.println(-1);
    }
    else
    {
      System.out.println(div[(int)k-1]);
    }
 }
}

class Reader
{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
 
    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
 
    public Reader(String file_name) throws IOException
    {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
 
    public String readLine() throws IOException
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }
 
    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');
 
        if (neg)
            return -ret;
        return ret;
    }
 
    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }
 
    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
 
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
 
        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }
 
        if (neg)
            return -ret;
        return ret;
    }
 
    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }
 
    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }
 
    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
    public static void main(String [] args){
        System.out.println("hi");
    }
}

class FastSort {
  
  public static void SortWithoutReturn(int[] array, int ShellHeapMergeMyInsertionSort, int length) {
    sort(array, ShellHeapMergeMyInsertionSort, length);
  }
  
  public static int[] SortWithReturn(int[] array, int ShellHeapMergeMyInsertionSort, int length) {
    sort(array, ShellHeapMergeMyInsertionSort, length);
    return array;
  }
  
  private static void sort(int[] array, int ShellHeapMergeMyInsertionSort, int length) {
    if (ShellHeapMergeMyInsertionSort < 0 || ShellHeapMergeMyInsertionSort > 4) {
      Random random = new Random();
      ShellHeapMergeMyInsertionSort = random.nextInt(4);
    }
    if (ShellHeapMergeMyInsertionSort == 0) {
      ShellSort(array);
    } else if (ShellHeapMergeMyInsertionSort == 1) {
      HeapSort(array);
    } else if (ShellHeapMergeMyInsertionSort == 2) {
      MergeSort(array, 0, length - 1);
    } else if (ShellHeapMergeMyInsertionSort == 3) {
      StraightMergeSort(array, length);
    } else if (ShellHeapMergeMyInsertionSort == 4) {
      insertionSort(array);
    }
  }
  
  private static void StraightMergeSort(int[] array, int size) {
    if (size == 0) {
      return;
    }
    int length = (size / 2) + ((size % 2) == 0 ? 0 : 1);
    Integer[][] ZeroBuffer = new Integer[length + length % 2][2];
    Integer[][] FirstBuffer = new Integer[0][0];
    for (int index = 0; index < length; index++) {
      int ArrayIndex = index * 2;
      int NextArrayIndex = index * 2 + 1;
      if (NextArrayIndex < size) {
        if (array[ArrayIndex] > array[NextArrayIndex]) {
          ZeroBuffer[index][0] = array[NextArrayIndex];
          ZeroBuffer[index][1] = array[ArrayIndex];
        } else {
          ZeroBuffer[index][0] = array[ArrayIndex];
          ZeroBuffer[index][1] = array[NextArrayIndex];
        }
      } else {
        ZeroBuffer[index][0] = array[ArrayIndex];
      }
    }
    boolean position = false;
    int pointer0;
    int pointer;
    int pointer1;
    int number = 4;
    int NewPointer;
    int count;
    Integer[][] NewBuffer;
    Integer[][] OldBuffer;
    length = (size / 4) + ((size % 4) == 0 ? 0 : 1);
    while (true) {
      pointer0 = 0;
      count = (number / 2) - 1;
      if (!position) {
        FirstBuffer = new Integer[length + length % 2][number];
        NewBuffer = FirstBuffer;
        OldBuffer = ZeroBuffer;
      } else {
        ZeroBuffer = new Integer[length + length % 2][number];
        NewBuffer = ZeroBuffer;
        OldBuffer = FirstBuffer;
      }
      for (int i = 0; i < length; i++) {
        pointer = 0;
        pointer1 = 0;
        NewPointer = pointer0 + 1;
        if (length == 1) {
          for (int g = 0; g < size; g++) {
            if (pointer > count || OldBuffer[pointer0][pointer] == null) {
              array[g] = OldBuffer[NewPointer][pointer1];
              pointer1++;
            } else if (pointer1 > count || OldBuffer[NewPointer][pointer1] == null) {
              if (OldBuffer[pointer0][pointer] == null) {
                continue;
              }
              array[g] = OldBuffer[pointer0][pointer];
              pointer++;
            } else if (OldBuffer[pointer0][pointer] >= OldBuffer[NewPointer][pointer1]) {
              array[g] = OldBuffer[NewPointer][pointer1];
              pointer1++;
            } else {
              array[g] = OldBuffer[pointer0][pointer];
              pointer++;
            }
          }
          return;
        }
        for (int g = 0; g < number; g++) {
          if (pointer > count || OldBuffer[pointer0][pointer] == null) {
            if (OldBuffer[NewPointer][pointer1] == null) {
              continue;
            }
            NewBuffer[i][g] = OldBuffer[NewPointer][pointer1];
            pointer1++;
          } else if (pointer1 > count || OldBuffer[NewPointer][pointer1] == null) {
            if (OldBuffer[pointer0][pointer] == null) {
              continue;
            }
            NewBuffer[i][g] = OldBuffer[pointer0][pointer];
            pointer++;
          } else if (OldBuffer[pointer0][pointer] >= OldBuffer[NewPointer][pointer1]) {
            NewBuffer[i][g] = OldBuffer[NewPointer][pointer1];
            pointer1++;
          } else {
            NewBuffer[i][g] = OldBuffer[pointer0][pointer];
            pointer++;
          }
        }
        pointer0 += 2;
      }
      position = !position;
      length = length / 2 + length % 2;
      number *= 2;
      
    }
  }
  
  public static void ShellSort(int[] array) {
    int j;
    for (int gap = array.length / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < array.length; i++) {
        int temp = array[i];
        for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
          array[j] = array[j - gap];
        }
        array[j] = temp;
      }
    }
  }
  
  private static void HeapSort(int[] array) {
    for (int i = array.length / 2 - 1; i >= 0; i--)
      shiftDown(array, i, array.length);
    for (int i = array.length - 1; i > 0; i--) {
      swap(array, 0, i);
      shiftDown(array, 0, i);
    }
  }
  
  private static void shiftDown(int[] array, int i, int n) {
    int child;
    int tmp;
    for (tmp = array[i]; leftChild(i) < n; i = child) {
      child = leftChild(i);
      if (child != n - 1 && (array[child] < array[child + 1]))
        child++;
      if (tmp < array[child])
        array[i] = array[child];
      else
        break;
    }
    array[i] = tmp;
  }
  
  private static int leftChild(int i) {
    return 2 * i + 1;
  }
  
  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  
  private static void MergeSort(int[] array, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      MergeSort(array, low, mid);
      MergeSort(array, mid + 1, high);
      merge(array, low, mid, high);
    }
  }
  
  private static void merge(int[] array, int low, int mid, int high) {
    int n = high - low + 1;
    int[] Temp = new int[n];
    int i = low, j = mid + 1;
    int k = 0;
    while (i <= mid || j <= high) {
      if (i > mid)
        Temp[k++] = array[j++];
      else if (j > high)
        Temp[k++] = array[i++];
      else if (array[i] < array[j])
        Temp[k++] = array[i++];
      else
        Temp[k++] = array[j++];
    }
    for (j = 0; j < n; j++)
      array[low + j] = Temp[j];
  }
  
  private static void insertionSort(int[] elements) {
    for (int i = 1; i < elements.length; i++) {
      int key = elements[i];
      int j = i - 1;
      while (j >= 0 && key < elements[j]) {
        elements[j + 1] = elements[j];
        j--;
      }
      elements[j + 1] = key;
    }
  }
}