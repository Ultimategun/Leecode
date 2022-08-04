import java.lang.reflect.Array;
import java.util.Arrays;

public class lee4 {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] nums) {
        int fast = 1;
        int slow = 1;
        Arrays.sort(nums);
        for (fast =  1; fast < nums.length; fast++) {
            if(nums[fast]!=nums[fast-1]){
                nums[fast]=nums[slow];
                slow++;
            }
        }
        if(fast!=slow){
            return true;
        }else{
            return false;
        }
    }
}
