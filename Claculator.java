//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Calculator {
    public Calculator() {
    }

    static int calculator(int a, int b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            return op == '/' ? a / b : 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculator(10, 5, '+'));
    }
}
