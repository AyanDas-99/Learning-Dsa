public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int a,b;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    a = i; b = j;
                    return new int[]{a,b};
                }
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] re = twoSum(arr, 6);
        for(int el:re){
            System.out.println(el);
        }
    }
}
