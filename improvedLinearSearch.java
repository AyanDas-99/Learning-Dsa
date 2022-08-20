public class improvedLinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 44, 21, 64, 1, 21, 54}; 
        int pos = search(arr, 6);
        if(pos != -1)
            System.out.println("Index of element :"+pos);
        else
            System.out.println("Not found");
    }

    static int search(int[] arr, int element) {
        int right = 0;
        int left = arr.length - 1;
        int position = -1;

        while(right <= left) {
            if(arr[right] == element) {
                position = right;
                break;
            }
            else if(arr[left]==element) {
                position = left;
                break;
            }
            right++;
            left--;
        }
        return position;
    }
}
