```java
import java.util.Scanner;

class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String normalized = word.replaceAll("\\s+", "").toLowerCase();
        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean palindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                palindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
```
