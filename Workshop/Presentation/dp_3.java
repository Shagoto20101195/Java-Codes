import java.io.BufferedOutputStream;
import java.io.PrintWriter;

//Todo: Not optimized for memory though a little bit memory is reduced. Time complexity O(n^2) space complexity O(n^2)
// the basic difference previous (dp_1) vs (dp_3) is that in dp_1 we calculated the min value when we were checking
// and going through all substring but here we are doing it separately in another O(n^2) loop.**
public class dp_3 {
    static final PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
    static final String test = "abcbd";

    public static void main(String[] args) {
        pw.println(give_minimum_partition(test));
        pw.close();
    }

    //Todo: Overall Time complexity is O(n^2 + n^2) = O(n^2) where n = length of the string
    //Todo: Overall space complexity is O(n + n^2) = O(n^2)**
    static int give_minimum_partition(String s) {
        //Todo: Partition_count will store the value of min cut / partition required to make substring i - j a palindrome
        int[] partition_count = new int[s.length()];
        boolean[][] is_Palindrome = new boolean[s.length()][s.length()];//O(n^2) memory

        //Todo: To make every single character palindrome since they are palindrome.**
        for (int i = 0; i < s.length(); i++) {
            is_Palindrome[i][i] = true;
            partition_count[i] = (int) 1e9;
        }
        for (int L = 2; L <= s.length(); L++) {//Todo: There are two loops so O(n^2)**
            // For substring of length L, set different
            // possible starting indexes
            for (int i = 0; i < s.length() - L + 1; i++) {
                int j = i + L - 1;
                // if not L = 2 then of isPalindrome[i+1][j-1]
                if (L == 2)
                    is_Palindrome[i][j] = (s.charAt(i) == s.charAt(j));
                else
                    is_Palindrome[i][j] = (s.charAt(i) == s.charAt(j)) && is_Palindrome[i + 1][j - 1];
            }
        }

        for (int i = 0; i < s.length(); i++) {//Todo: Also two loops O(n^2)**
            System.out.println("At substring: "+s.substring(0, i+1));
          if (is_Palindrome[0][i]) partition_count[i] = 0;//If it's already a palindrome we don't do anything.
            else {
                for (int j = 0; j < i; j++) {
                    if (is_Palindrome[j + 1][i]) {
                      System.out.println("Partition at "+s.substring(j+1, i+1));
                        partition_count[i] = Integer.min(partition_count[i], 1 + partition_count[j]);
                    }
                }
            }
        }
        return partition_count[s.length() - 1];
    }
}