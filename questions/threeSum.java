package questions;

import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int[] num = { 12, 44, 21, 64, 1, 21, 54 };
        // bruteSum(num, 54);
        twoPointerSum(num,76);
    }

    static void bruteSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target) {
                        System.out.printf("The numbers are: %d %d %d", i, j, k);
                        return;
                    }
                }
            }
        }
    }

    static void twoPointerSum(int[] array, int target) {
        Arrays.sort(array);
        display(array);
        int last = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            int first = i+1;
            int goal = target - array[i];
            while (first < last) {
                if (array[first] + array[last] > goal) {
                    last--;
                } else if (array[first] + array[last] < goal) {
                    first++;
                } else {
                    System.out.printf("The numbers are: %d %d %d", array[i], array[first], array[last]);
                    return;
                }
            }
        }

    }

    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
