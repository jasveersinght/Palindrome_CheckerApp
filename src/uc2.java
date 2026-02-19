public class uc2 {
    public static void main(String[] args){
        String input = "civic";
        int n = input.length();
        char[] queue = new char[n];
        int front = 0;
        int rear = -1;
        char[] stack = new char[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            queue[++rear] = ch;
            stack[++top] = ch;
        }
        boolean isPalindrome = true;
        while (front <= rear) {
            char fromQueue = queue[front++];
            char fromStack = stack[top--];
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}