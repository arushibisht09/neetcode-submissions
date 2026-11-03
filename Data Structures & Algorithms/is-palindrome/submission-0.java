class Solution {
    public boolean isPalindrome(String s) {
//time complexity - O(n+m)
//space complexity - O(n)
        StringBuilder clean = new StringBuilder(); 

        for(int i =0; i < s.length() ; i++){
            char c = s.charAt(i); 

            if(Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c)); 
            }
        }


        for (int i=0; i <clean.length()/2; i++){ 

            if(clean.charAt(i) != clean.charAt(clean.length()-1-i)){
                return false;
            }
            
        }
        return true; 

    }
}
