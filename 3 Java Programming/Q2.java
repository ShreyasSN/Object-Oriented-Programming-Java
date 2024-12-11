import java.io.*;
public class Q2 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();

        String[] words = str.trim().split("\\s+");
        int word_count = words.length;

        System.out.println("Total words count : " + word_count);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + ": " + (int) str.charAt(i));
        }

        input.close();
    }
}
