// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class CountingRooms
{
  static int n, m;
  static int nmax = 10000+10;
  static char [][] arr = new char[nmax][nmax];
  static boolean [][] visited = new boolean[nmax][nmax];
  static void dfs(int i, int j)
  {
    visited[i][j] = true;
    
    if(i > 0 && arr[i-1][j] == '.' && !visited[i-1][j])
    {
      dfs(i-1, j);
    }
    if(j > 0 && arr[i][j-1] == '.' && !visited[i][j-1])
    {
      dfs(i, j-1);
    }
    if(i < n - 1 && arr[i+1][j] == '.' && !visited[i+1][j])
    {
      dfs(i+1, j);
    }
    if(j < m - 1 && arr[i][j+1] == '.' && !visited[i][j+1])
    {
      dfs(i, j+1);
    }
  }
  
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    n = read.nextInt();
    m = read.nextInt();
    read.nextLine();
    
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextLine().toCharArray();
    }
    
    int count = 0;
    for(int i = 0; i<n; i++)
    {
      for(int j = 0; j<m; j++)
      {
        if(arr[i][j] == '.' && !visited[i][j])
        {
          dfs(i, j);
          count++;
        }
      }
    }
    
    System.out.println(count);
  }
}