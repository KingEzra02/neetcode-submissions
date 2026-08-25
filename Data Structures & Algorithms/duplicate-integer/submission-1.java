class Solution {
    public boolean hasDuplicate(int[] nums) {
       boolean hasDuplicates = false;
       for(int i = 0; i < nums.length; i++){
        int count = 0;
        for(int j = i + 1; j < nums.length; j++){
            if(nums[i] == nums[j]){
                hasDuplicates = true;
                return hasDuplicates;
            }
        }
       }
       return hasDuplicates;
    }
}