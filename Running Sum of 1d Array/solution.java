import java.util.*;
import java.util.stream.IntStream;
//0 ms very efficient approach. Minimum memory consumption
public class Main {
    public static void main(String[] args) {
        int[] ejemplo= {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(ejemplo)));
        }

    public static int[] runningSum(int[] nums) {

            int i = 1;
            while (i<nums.length){
                nums[i]+=nums[i-1];
                i++;
            }
            return nums;
        }
}
