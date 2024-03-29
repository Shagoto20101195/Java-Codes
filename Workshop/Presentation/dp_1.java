import java.io.BufferedOutputStream;
import java.io.PrintWriter;

//Todo: Implement O(n^3) dp
public class dp_1 {
    static final PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
    static final String test = "abcbd";

    public static void main(String[] args) {
        pw.println(give_me_minimum_partition(test));
        pw.close();
    }

    static int give_me_minimum_partition(String s) {
        //Todo: Partition_count will store the value of min cut / partition required to make substring i - j a palindrome
        int[][] Partition_count = new int[s.length()][s.length()];
        boolean[][] is_Palindrome = new boolean[s.length()][s.length()];

        //Todo: To make every single character palindrome since they are palindrome.
        for (int i = 0; i < s.length(); i++) {
            is_Palindrome[i][i] = true;
        }

        //* Todo: Here L = the length of the substring
        for (int L = 2; L <= s.length(); L++) {
            // For substring of length L, set different
            // possible starting indexes
            for (int i = 0; i < s.length() - L + 1; i++) {
                int j = i + L - 1;
                // if not L = 2 then of isPalindrome[i+1][j-1]
                if (L == 2)
                    is_Palindrome[i][j] = (s.charAt(i) == s.charAt(j));
                else
                    is_Palindrome[i][j] = (s.charAt(i) == s.charAt(j)) && is_Palindrome[i + 1][j - 1];

                //Todo: If i and j is palindrome then partition count is 0
                if (is_Palindrome[i][j])
                    Partition_count[i][j] = 0;
                else {
                    Partition_count[i][j] = (int) 1e9;
                    System.out.println("For string: "+s.substring(i, j+1)+" ");
                    for (int k = i; k <= j - 1; k++){
                      System.out.println("Partitioning in between: "+s.substring(i, k+1)+" and "+s.substring(k+1, j+1));
                        Partition_count[i][j] = Integer.min(Partition_count[i][j],
                                                            Partition_count[i][k] + Partition_count[k + 1][j] + 1);}
                }
            }
        }
        
        return Partition_count[0][s.length() - 1];
    }
}