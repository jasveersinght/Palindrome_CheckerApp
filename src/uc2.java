public class uc2 {
    public static void main(String[] args){
        String input ="madam";
        String reversed = "";
        for(int i=0;i < input.length() /2;i++) {
            reversed = reversed + input.charAt(i);
        }
            if (input.equals(reversed)) {
                System.out.println("The string \"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
            }
        }
    }
