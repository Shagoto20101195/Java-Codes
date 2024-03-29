// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class ReversingArrayInPlace
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int [] source = {10, 20, 30, 40, 50};
    reverse(source);
    
    System.out.println(source[0]);
    System.out.println(source[1]);
    System.out.println(source[2]);
    System.out.println(source[3]);
    System.out.println(source[4]);
  }
  
  public static void reverse(int [] arr)
  {
    // also condition i<j will work
    for(int i = 0, j = arr.length - 1; i<arr.length / 2; i++, j--)
    {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    
    return;
  }
}