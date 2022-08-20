public class radixsort {
    public static void main(String[] args) {
        int[] arr = { 414, 22, 245, 11, 4, 625, 222 };
        // int[] arr = {115, 112, 116, 111, 116, 112, 119};
        arr = radixSort(arr);
        display(arr);
        // System.out.println(digit(20, 3));
    }

    static int[] radixSort(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max)
                max = i;
        }

        int exp = 1;
        while(exp <= max){
            // System.out.println("digit: "+i);
            arr = countSort(arr, exp);
            exp = exp * 10;
        }
        return arr;
    }


    static int[] countSort(int[] arr, int exp) {
        // find max
        int max = 0;
        for (int i : arr) {
            // System.out.print(digit(i, place)+" ");
            if ((i * exp % 10)> max) {
                max = i*exp%10;
            }
        }
        // System.out.println("max: " + max);

        int[] count = new int[max + 1];
        for (int i : arr) {
            count[i*exp%10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] result = new int[arr.length];
        for (int i : arr) {
            count[i*exp%10]--;
            result[count[i*exp%10]] = i;
        }

        return result;
    }

    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
