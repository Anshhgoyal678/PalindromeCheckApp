
import java.util.*;

interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++)
            stack.push(word.charAt(i));

        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) != stack.pop())
                return false;

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++)
            deque.addLast(word.charAt(i));

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String word) {
        return strategy.checkPalindrome(word);
    }
}

class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        PalindromeStrategy strategy;

        if (word.length() % 2 == 0)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.check(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
