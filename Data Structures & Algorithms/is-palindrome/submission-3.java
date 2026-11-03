class Solution {
    public boolean isPalindrome(String s) {
        
//time complexity - O(n)
//space complexity - O(1)
        int pointerA = 0;
        int pointerB= s.length()-1; 


        while(pointerA<pointerB){
// isDigit or letter
            if(!Character.isLetterOrDigit(s.charAt(pointerA))){
                pointerA++; 
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(pointerB))){
                pointerB--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(pointerA)) != Character.toLowerCase(s.charAt(pointerB))){
                return false;
            }
            pointerA++;
            pointerB--; 

        }

        return true;
    }
}
