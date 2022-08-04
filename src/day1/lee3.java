public class lee3 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        int arr[] = nums.clone();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[(i+k)%n]=arr[i];
        }
    }
}
