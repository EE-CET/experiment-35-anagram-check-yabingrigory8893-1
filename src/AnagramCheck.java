import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            String s1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");
            if (!sc.hasNextLine()) return;
            String s2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

            if (s1.length() != s2.length()) {
                System.out.println("false");
                return;
            }

            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
