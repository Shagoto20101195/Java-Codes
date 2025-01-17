//Written by Shagoto
import java.util.*;
public class SimpleProgramForLinearSearch
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    /*
     Given an array, ask the user for a sum
     Check which two elements give that sum
    */
    int [] a = {2,5,10,31,25,15,12,20,40};
    //Sorting the array is a must
    Arrays.sort(a);
    //Asking the target from user
    int target = read.nextInt();
    int sum = 0; //Initializing the sum
    int start = 0; //Start search from first index
    int finish = a.length-1; //Up to last index
    
    /*
     Loop will go on unless sum becomes equal to target.
     Provided that sum exists from two elements.
     */
    while(sum != target)
    {
      sum = a[start] + a[finish];
      
      if(sum > target)
      {
        //Since the sum is greater, we need a smaller number i.e behind of array
        //we get smaller number, therefore we reduce the index from right
        finish--;
      }
      else if(sum < target)
      {
        //Since the sum is less, we need a greater number i.e in front of array
        //we get greater number, therefore we increase the index from left
        start++;
      }
    }
    
    System.out.println(a[start]+" "+a[finish]); //Printing the output
  }
}