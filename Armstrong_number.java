public class ArmstrongNumber {
}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Armstron_number {
    public Armstron_number() {
    }

    static void Armstron_number(int num) {
        int original = num;
        int count = 0;

        int sum;
        for(sum = 0; num > 0; num /= 10) {
            ++count;
        }

        for(int var7 = original; var7 > 0; var7 /= 10) {
            int digit = var7 % 10;
            int power = 1;

            for(int i = 1; i <= count; ++i) {
                power *= digit;
            }

            sum += power;
        }

        if (sum == original) {
            System.out.println(original + " is Armstrong Number");
        } else {
            System.out.println(original + " is Not Armstrong Number");
        }

    }

    public static void main(String[] args) {
        Armstron_number(153);
        Armstron_number(9474);
        Armstron_number(123);
    }
}
