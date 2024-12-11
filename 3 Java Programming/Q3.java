import java.io.*;
public class Q3 {
    public static String DuplicatesRemover(String resStr) {
        StringBuilder res = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (int i = 0; i < resStr.length(); i++) {
            if (!seen[resStr.charAt(i)]) {
                seen[resStr.charAt(i)] = true;
                res.append(resStr.charAt(i));
            }
        }

        return res.toString();

    }

    public static void main(String[] args) throws IOException {
        String Str;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Str = input.readLine();

        String result = DuplicatesRemover(Str);

        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
        }

        input.close();
    }
}
