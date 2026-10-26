class Solution {
    public void sortColors(int[] nums) {
       boolean sorted = false;
       int i = 0;
       while(!sorted && i < nums.length-1){
        sorted = true;
        for(int j = 0; j<nums.length-i-1; j++){
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                sorted = false;
            }

        }
        i++;
       }

    }
}