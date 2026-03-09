
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {


        String input = "refer";

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);


        for (char c : input.toCharArray()) {
            deque.addLast(c);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String originalString = scanner.nextLine();
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);


        }

        boolean isPalindrome = true;



        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {


                isPalindrome = false;
                break;
            }
        }


        System.out.println("Is Palindrome? : " + isPalindrome);
        sc.close();

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
 main
    }
}
