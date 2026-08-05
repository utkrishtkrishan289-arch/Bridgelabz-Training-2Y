//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Palindrome {
    public Palindrome() {
    }

    static boolean isPalindrome(int num) {
        int original = num;

        int reverse;
        for(reverse = 0; num > 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
