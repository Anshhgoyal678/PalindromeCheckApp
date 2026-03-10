
import java.util.Deque;
import java.util.ArrayDeque;

class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean palindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
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
