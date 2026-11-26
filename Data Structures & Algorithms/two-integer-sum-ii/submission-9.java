class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // [1,2,3,4]
        //  | |
        //  i j


        //target 3

        // 
        // till the time numbers[j] <= 400 run the loop
        
        int i = 0;
        int j = numbers.length-1;  

        while (i < j){

                if(numbers[i]+ numbers[j] > target){
                    j--;
                }
               else if(numbers[i]+ numbers[j] == target){
                    i = i+1;
                    j= j+1;
                    return new int[] {i,j}; 
                } 
                else{
                    i++; 
                }
                

        }

        throw new IllegalArgumentException("No valid solution found");
        
    }
}
