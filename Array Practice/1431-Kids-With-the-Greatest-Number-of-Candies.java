class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>max) max=candies[i];
            else continue;
        }
        List<Boolean> output = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            boolean var=(candies[i]+extraCandies >= max)?true:false;
            output.add(var);
        }
        return output;
    }
}