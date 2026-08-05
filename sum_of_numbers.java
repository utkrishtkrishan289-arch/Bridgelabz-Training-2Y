//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class sum_of_numbers {
    public sum_of_numbers() {
    }

    static int sum_of_the_digit(int num) {
        int sum;
        for(sum = 0; num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum_of_the_digit(123));
    }
}
