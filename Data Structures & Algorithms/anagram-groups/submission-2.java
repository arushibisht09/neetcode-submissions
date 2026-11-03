class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
  //time complexity - O(nk)
  //space complexity - O(n) since 26 is fixed
    HashMap<String, List<String>> map = new HashMap<>();
   

    for(String str : strs){
        // fixed array of ints
        int[] count = new int[26];

            // Count character frequencies
            for (char c : str.toCharArray()) {
                count[c - 'a']++; // find the char and increase it
            }
            //New function to remember; 
            String frequency = Arrays.toString(count); 

            // if does not exist then add

            if(!map.containsKey(frequency)){
                map.put(frequency, new ArrayList<>()); 
            }
            // add the string to arraylist
            map.get(frequency).add(str); 
        
    }
    return new ArrayList<>(map.values()); 


    }
}
