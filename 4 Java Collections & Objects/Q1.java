import java.io.*;
import java.util.*;

public class Q1 {
    public static void main(String[] args) throws IOException{
        String Str;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Str = input.readLine();
        
        StringBuilder res = new StringBuilder();
        String withoutVowels = Str.replaceAll("[aeiouAEIOU]", "");
        res.append(withoutVowels);
        String s = res.toString();
        char[] ans = s.toCharArray();
        Arrays.sort(ans);
    
        System.out.println(new String(ans));
        
        input.close();
    }
}
