class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>(); 

// making a pair of i and number where i is the 
        for (int i =0; i<nums.length; i++){

            int number = target - nums[i] ; 

           if (map.containsKey(number)){
            return new int[]{map.get(number), i} ; 
           }
           else{
            map.put(nums[i],i); 
           }

        }
        return new int[]{};
    }
}
