class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>(); 
        
        //Made a map
        for (int num: nums){

            if (map.containsKey(num)){
                map.put(num , map.get(num)+1 ); 
            }
            else{
                map.put(num , 1); 
            }

        }

      int[] result = new int[k];

for (int i = 0; i < k; i++) {

    int maxFrequency = 0;
    int mostFrequent = 0;

    // Find the most frequent number
    for (int num : map.keySet()) {
    int frequency = map.get(num);

    if (frequency > maxFrequency) {
        maxFrequency = frequency;
        mostFrequent = num;
    }
}

    // Save it in result[i]
    result[i] = mostFrequent; 

    // Remove it from the map
    map.remove(mostFrequent); 
}
        
        return result; 
    }
}
