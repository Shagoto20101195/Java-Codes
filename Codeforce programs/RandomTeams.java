//Written by Shagoto
import java.util.*;
public class RandomTeams
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    long n = read.nextLong();
    long m = read.nextLong();
    
    if(n == m)
    {
      System.out.println(0+" "+0);
    }
    else if(m == 1)
    {
      //General formula for pairs: n*(n - 1) / 2
      System.out.println(n*(n-1) / 2+" "+n*(n-1) / 2);
    }
    else
    {
      /*
       * For maximum pairs, I need to have all groups with one member
       * Except for one group, which will have the maximum members.
      */
      long temp = n - (m - 1); // Calculating maximum members in the last group by substracting number of groups with one member
      long ans2 = temp*(temp-1) / 2; // Calculating maximum pairs
      
      /*
       * For minimum pairs, all groups must have same number of members
       * But, n is not always divisible by m. So, the remainder(extra members) is calculated in diff
       * These extra members are added in the groups(i.e n / m + 1) and the new pairs are calculated in temp1
       * And in temp2 the unchanged group pairs are calculated.
       * 
       * Note that pairs are multiplied with diff and (m - diff)
       * This is because the groups have common number in members
       * i.e some groups have a changed number (n / m + 1) and others unchanged (n / m)
       * Therefore their total is calculated by multiplying and finally adding in ans2
       */
      long diff = n - (n / m * m); // or n % m
      long temp1 = diff * ((n / m + 1)*(n / m) / 2); //Note: (n / m) is actually (n / m + 1 - 1) according to general formula
      long temp2 = (m - diff) * (n / m * (n / m - 1) / 2);
      long ans1 = temp1 + temp2; //Adding pairs
      
      System.out.println(ans1+" "+ans2); //Final output
    }
  }
}