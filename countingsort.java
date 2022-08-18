public class countingsort {
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 1, 4, 3, 7};
        arr = countingSort(arr);
        display(arr);
    }

    static int[] countingSort(int[] arr) {
 
        int[] result = new int[arr.length];

        // finding max
        int max = 0;
        for(int e: arr) {
            if (max < e) max = e;
        }

        // count array to store the no. of occurence of the elements
        int[] count = new int[max+1];
        for(int e: arr) {
            count[e]++;
        } 

        // update the elements of count with the cummulative sum
        int sums = 0;
        for(int i = 0; i< count.length; i++) {
            sums += count[i];
            count[i] = sums;
        }

        // updating the result array
        for (int i : arr) {
            count[i]--;
            result[count[i]] = i;
        }   

        return result;
    }

    static void display(int[] nums) {
        for(int e: nums) {
            System.out.print(" "+e);
        }
        System.out.println();
    }
}
