public class uc2 {
    public static void main(String[] args){
        String input = "noon";
        char[] stack = new char[input.length()];
        int top = -1;
        for (int i = 0; i < input.length(); i++) {
            stack[++top] = input.charAt(i);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            char popped = stack[top--];
            if (input.charAt(i) != popped) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
