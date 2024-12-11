import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Q4 {
    public static String longestPalindromeSubstring(String s) {
        int n = s.length();
        int maxLength = 1;
        int start = 0; 
        
        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1; 
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    if (length > maxLength) {
                        start = i;
                        maxLength = length;
                    }
                }
            }
        }
        return s.substring(start, start + maxLength);
    }
    
    public static void main(String[] args)throws IOException {
        String Str;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Str = input.readLine();
        String result = longestPalindromeSubstring(Str);
        System.out.println("Longest palindrome substring: " + result);
        System.out.println("Length of longest palindrome: " + result.length());
    }
}
