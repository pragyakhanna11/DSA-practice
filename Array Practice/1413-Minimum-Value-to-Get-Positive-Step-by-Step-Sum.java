class Solution {
    public int minStartValue(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(sum<min) min =sum;
        }
        if(min>=1) return 1;
        else return 1-min;
    }
}