public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 11, 14, 43, 66, 69, 88 };
        // System.out.println(RecBinarySearch(arr, 66, 0, arr.length));
        System.out.println(IteBinarySearch(arr, 66));
    }

    static int RecBinarySearch(int[] arr, int searchElement, int first, int last) {
        int mid = (last + first) / 2;
        if (first > last)
            return -1;
        if (arr[mid] == searchElement)
            return mid;
        else if (arr[mid] > searchElement) {
            return RecBinarySearch(arr, searchElement, first, mid - 1);
        } else {
            return RecBinarySearch(arr, searchElement, mid + 1, last);
        }
    }

    static int IteBinarySearch(int[] arr, int searchElement) {
        int first = 0, last = arr.length-1;
        int mid;
        while(first < last) {
            mid = (first+last) / 2;
            if(arr[mid] == searchElement) return mid;
            else if(searchElement < arr[mid]) last = mid-1;
            else first = mid+1;
        }
        return -1;
    }
}
