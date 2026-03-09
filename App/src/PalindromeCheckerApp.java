
public class PalindromeCheckerApp {


    private static boolean check(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return check(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);
        sc.close();

// UC13: Algorithm comparison implementation
import java.util.*;

public class PalindromeCheckerApp {

    public static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }

    public static boolean recursiveCheck(String input, int start, int end) {
        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return recursiveCheck(input, start + 1, end - 1);
    }


    public static void main(String[] args) {

        String str = "madam";
        boolean isPalindrome = true;

        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = recursiveCheck(input, 0, input.length() - 1);
        long end2 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("Recursive Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("Input text: " + str);
        System.out.println("Is it a Palindrome: " + isPalindrome);

    }
}