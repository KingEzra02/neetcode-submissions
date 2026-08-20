class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean doContainDup = false;
       for(int i = 0; i < nums.length; i++){
           for(int j = i + 1; j < nums.length; j++){
               if(nums[i] == nums[j]){
                   doContainDup = true;
                   return doContainDup;
               }
           }
       } 

       return doContainDup;
    }
}