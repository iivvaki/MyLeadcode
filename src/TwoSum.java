public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    j++;
                }
                if(num == nums[j]){
                    int[] res = {i, j};
                    return res;
                }
            }
        }

        return new int[]{};
    }
}
