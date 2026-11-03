class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length] ; 
        
        int[] left = new int[nums.length];
         
        int product1 = 1; 

        for(int i = 0; i< nums.length ; i++){
            //left side product
            left[i] = product1; 

            product1 *= nums[i];
        }

        //right side product
        int[] right = new int[nums.length];
        int product2 = 1;

for (int i = nums.length - 1; i >= 0; i--) {

    // Store the product of everything to the right
    right[i]= product2;

    // Update product for the next iteration
    product2 *= nums[i]; 
}

for (int i = 0; i < nums.length; i++) {

    output[i] = left[i] * right[i];

}


        return output; 

    }
}  
