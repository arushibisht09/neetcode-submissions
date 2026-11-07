class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                
        //  [-1,0,1,2,-1,-4] 
        // sort - [-4,-1,-1, 0, 1, 2] 

    

        Arrays.sort(nums); 
        Set<List<Integer>> set = new HashSet<>(); 

        for (int i = 0; i < nums.length-2; i++) {

            int l = i+1; 
            int r = nums.length -1; 
            
            //This ensures the loop ends as soon as the pointers
            // meet or cross.
            while(l < r){
            int sum = nums[i] + nums[l] + nums[r] ; 

            if(sum<0){
                l++; 
            }
            else if(sum>0){
                r--; 
            }
            if(sum==0){
                set.add(Arrays.asList(nums[i], nums[l],nums[r])); 
                l++;
                r--;
            }
            
            }

            
        }

        return new ArrayList<>(set); 
            


    }
}
