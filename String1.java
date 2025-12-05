import java.util.*;
class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = userMainCode.countOccurance(s1, s2);
        System.out.println(count);
    }
}

class userMainCode {
    public static int countOccurance(String s1, String s2) {
        int count = 0;
        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 == 0 || l2 == 0) {
            return 0;
        }

        for (int i = 0; i <= l1 - l2; i++) {
            if (s1.substring(i, i + l2).equals(s2)) {
                count++;
            }
        }

        return count;
    }
}