public class something {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
        // System.out.println(slidingWindow(arr, 1));
    }

    static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            // System.out.print(i+" ");
            sum += slidingWindow(arr, i);
        }
        return sum;
    }

    static int slidingWindow(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int temp = sum;
        // System.out.print(sum + " ");
        for (int i = k; i < arr.length; i++) {
            temp = temp + arr[i] - arr[i - k];
            sum += temp;
        }
        System.out.println(sum);
        return sum;
    }
}