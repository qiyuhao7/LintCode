package Easy;

public class T14 {
    public int binarySearch(int[] nums, int target) {
        // write your code here
        if(nums.length == 0){
            return -1;
        }

        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int key = (start + end) / 2;
            if (nums[key] < target){
                start = key + 1;
            }else{
                end = key;
            }
        }
        if(nums[start] == target){
            return start;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        T14 t14 = new T14();
        int[] nums = {1,4,4,5,7,7,8,9,9,10};
        int target = 5;
        int position = t14.binarySearch(nums, target);
        System.out.println(position);
    }
}
