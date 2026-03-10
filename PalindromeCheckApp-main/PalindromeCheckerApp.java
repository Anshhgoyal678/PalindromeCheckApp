
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
            queue.add(word.charAt(i));
        }

        boolean palindrome = true;

        for (int i = 0; i < word.length(); i++) {
            if (stack.pop() != queue.remove()) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
