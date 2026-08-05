//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class prime_number {
    public prime_number() {
    }

    static boolean prime_number(int num) {
        if (num <= 1) {
            return false;
        } else {
            for(int i = 2; i < num; ++i) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(prime_number(1));
    }
}
