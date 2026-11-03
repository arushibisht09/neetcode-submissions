class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>(); 

        for (int i=0; i<strs.length ; i++){

            //1. Convert str to character array 
            char[] chars = strs[i].toCharArray(); 

            // Sort the char array
            Arrays.sort(chars); 
        
            //Convert it to String
            String key = new String(chars); 

            // if the key does not exist then make a new ArrayList
            if (!map.containsKey(key)){
                map.put(key, new ArrayList<String>()); 
            }
            
            // add the original value to the arraylist
            map.get(key).add(strs[i]); 

            
        }
        
        List<List<String>> list = new ArrayList<>(); 

        for(ArrayList<String> group : map.values()){
            list.add(group); 
        }

        return list;

    }
}
