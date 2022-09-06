import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
// not the most eficient solution Runtime: 130 ms, faster than 5.04% of Java online submissions for First Missing Positive.
//Memory Usage: 102.6 MB, less than 67.36% of Java online submissions for First Missing Positive.

public class Main {
    public static void main(String[] args) {
        Solution ejercicio = new Solution();
        int[] array1= {-3,-1,1,2,3,4,5};

        System.out.println(ejercicio.firstMissingPositive(array1));
    }
}
    //Given an unsorted integer array nums, return the smallest missing positive integer.
    //You must implement an algorithm that runs in O(n) time and uses constant extra space.
 class Solution {
     public int firstMissingPositive(int[] nums) {
            //creamos un Set Collection a partir del Array. Distinct para decir que no haya repetidos. boxed para pasar las
            //variables como Integer no como int. "Integer wraps a value of the primitive type int in an object".
            //toSet collector is used for collecting all Stream elements into a Set instance
            Set<Integer> setOfUniques = Arrays.stream(nums).distinct().boxed().collect(Collectors.toSet());

            
            int index=1;
//we dont know the number of iterations therefore it is a "while" loop
            while(true) {
                if(!setOfUniques.contains(index)){
                    return index;
                }
                index++;
            }

        }
 }
