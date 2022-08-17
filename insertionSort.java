public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {50, 40, 45, 36, 57, 2, 33};
        sort(arr);

        for(int e: arr) {
            System.out.print(e+" ");
        }
    }

    static void sort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int j=i-1;
            int temp = arr[i];
            while(j>=0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
