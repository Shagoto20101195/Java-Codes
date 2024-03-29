// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class DZYLovesChessboard
{
  static int nmax = 1000+10;
  static int n, m;
  static char [][] arr = new char[nmax][nmax];
  static boolean [][] visited = new boolean[nmax][nmax];
  static char [][] color = new char[nmax][nmax];
  static void dfs(int i, int j, char c)
  {
    visited[i][j] = true;
    color[i][j] = c;
    
    if(i > 0 && arr[i-1][j] == '.' && !visited[i-1][j])
    {
      dfs(i-1, j, (c == 'B')? 'W':'B');
    }
    if(j > 0 && arr[i][j-1] == '.' && !visited[i][j-1])
    {
      dfs(i, j-1, (c == 'B')? 'W':'B');
    }
    if(i < n-1 && arr[i+1][j] == '.' && !visited[i+1][j])
    {
      dfs(i+1, j, (c == 'B')? 'W':'B');
    }
    if(j < m-1 && arr[i][j+1] == '.' && !visited[i][j+1])
    {
      dfs(i, j+1, (c == 'B')? 'W':'B');
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
    
    for(int i = 0; i<n; i++)
    {
      for(int j = 0; j<m; j++)
      {
        if(arr[i][j] == '.' && !visited[i][j])
        {
          dfs(i, j, 'B');
        }
      }
    }
    
    for(int i = 0; i<n; i++)
    {
      for(int j = 0; j<m; j++)
      {
        if(!visited[i][j])
        {
          System.out.print('-');
        }
        else
        {
          System.out.print(color[i][j]);
        }
      }
      System.out.println();
    }
  }
}