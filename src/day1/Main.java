import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
       int n = nums.length;
       if(n==0){
           return n;
       }
       int fast = 1;
       int slow = 1;
        for (fast = 1; fast < n; fast++) {
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
