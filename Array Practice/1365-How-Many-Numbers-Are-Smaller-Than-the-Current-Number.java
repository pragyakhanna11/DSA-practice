class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=0; j<nums.length; j++){
                if((j!=i)&(nums[j]<nums[i])){
                    sum+=1;
                } 
            }
            smaller[i]=sum;
        }
        return smaller;
    }
}