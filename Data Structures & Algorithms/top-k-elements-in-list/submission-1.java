class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>(); 
        
        //Make a map 
        for (int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        // prority queue - compare the frequencies (figure out what 
        //to  store)
        PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a,b) -> {
            return Integer.compare(map.get(a) , map.get(b)); 
            }
        ); 

        // for loop to add the hashmap to pq
        for(int n: map.keySet()){
            pq.offer(n);
        }

        while(pq.size() > k ){
            pq.poll(); 
        }
        
        int[] result = new int[k]; 

        for (int i = 0; i <k; i++){
            result[i] = pq.poll(); 
        }
        
        return result; 

    }
}
