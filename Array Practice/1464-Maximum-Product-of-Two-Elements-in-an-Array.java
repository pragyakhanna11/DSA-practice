class Solution {
    public int maxProduct(int[] nums) {
        int prod = 0;
        for(int i =0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if((nums[i]-1)*(nums[j]-1)>prod) prod = (nums[i]-1)*(nums[j]-1);
            }
        }
        return prod;
    }
}