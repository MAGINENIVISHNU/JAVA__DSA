import java.util.HashSet;
import java.util.Scanner;

public class sequenceunique {
    public static void sequence(String s, int idx, HashSet<String> set, String s2) {
        if (idx == s.length()) {
            if (!set.contains(s2)) {
                System.out.println(s2);
                set.add(s2);
            }
            return;
        }
        char cur = s.charAt(idx);
        sequence(s, idx + 1, set, s2 + cur);
        sequence(s, idx + 1, set, s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<String> set = new HashSet<>();
        sequence(s, 0, set, "");
    }
}
