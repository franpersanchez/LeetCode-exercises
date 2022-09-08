import org.jetbrains.annotations.NotNull;
//We need to quickly compute the sum of values to the left and the right of every index.
//Let's say we knew S as the sum of the numbers, and we are at index i. If we knew the sum of numbers leftsum that are to the left of index i, then the other sum to the right of the index would just be S - nums[i] - leftsum.
//As such, we only need to know about leftsum to check whether an index is a pivot index in constant time. Let's do that: as we iterate through candidate indexes i, we will maintain the correct value of leftsum.
public class ExamplesDSA {

    public static void main(String[] args) {
        ExamplesDSA ejemplo = new ExamplesDSA();
        int[] arr = {1,7,3,6,5,6};
        System.out.println(ejemplo.pivotIndex(arr));
    }
    public int pivotIndex(int @NotNull [] nums){
        int sum=0, sumLeft=0;
        for(int x:nums)sum=sum+x;

        for (int i=0; i < nums.length; i++){
            if(sumLeft==(sum-sumLeft-nums[i])){
                return i;
            }
            sumLeft=sumLeft+nums[i];
        }
        return -1;

}
}
