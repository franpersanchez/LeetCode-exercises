import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> num_map = new HashMap<>();
        
        
        for(int i=0; i<nums.length; i++){
            
           int complement= target - nums[i];
            
            
            
            if(num_map.containsKey(complement)){
                return new int[] {num_map.get(complement),i};
                
            }
            //we want to iterate over already existing key->values. If for example, this line before goes on top of if statement, for {5,3,4},10, the (wrong result would be [0,0]
            num_map.put(nums[i],i);
             
        }
        
       throw new IllegalArgumentException("No match found");
    }
}
