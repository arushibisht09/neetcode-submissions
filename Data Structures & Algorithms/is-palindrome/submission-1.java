class Solution {
    public boolean isPalindrome(String s) {
        
        String clean = "" ; 

        for(char c : s.toCharArray()){

            if(Character.isDigit(c) || Character.isLetter(c)){
                clean += c ; 
            }

        }
        clean = clean.toLowerCase();

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
}
