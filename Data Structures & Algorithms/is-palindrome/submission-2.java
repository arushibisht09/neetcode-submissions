class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder clean = new StringBuilder(); 

        for(int i =0; i < s.length() ; i++){
            char c = s.charAt(i); 

            if(Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c)); 
            }
        }
     int pointer_a = 0; 
        int pointer_b = clean.length()-1 ; 

        while (pointer_a < pointer_b){

            if(clean.charAt(pointer_a) != clean.charAt(pointer_b)){
                return false;
            }

            pointer_a ++;
            pointer_b --; 
        }

        return true; 
    }
    // can eliminate string builder by d
}
