
class PalindromeCheckerApp {

    static boolean reverseMethod(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return word.equals(reversed);
    }

    static boolean twoPointerMethod(String word) {
        char[] arr = word.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean stackMethod(String word) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < word.length(); i++)
            stack.push(word.charAt(i));

        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) != stack.pop())
                return false;

        return true;
    }

    public static void main(String[] args) {
        String word = "madam";

        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = twoPointerMethod(word);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean r3 = stackMethod(word);
        long end3 = System.nanoTime();

        System.out.println("Reverse Method: " + r1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Two Pointer Method: " + r2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Stack Method: " + r3 + " Time: " + (end3 - start3) + " ns");
    }
}