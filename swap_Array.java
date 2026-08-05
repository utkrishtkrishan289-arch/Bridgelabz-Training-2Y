//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class swap_Array {
    public swap_Array() {
    }

    static void reverseArray(int[] arr) {
        int start = 0;

        for(int end = arr.length - 1; start < end; --end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
        }

    }

    static void displayArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        reverseArray(arr);
        displayArray(arr);
    }
}
