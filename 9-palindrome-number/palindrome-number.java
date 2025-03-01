class Solution {
    public boolean isPalindrome(int x) {
        
        String str = Integer.toString(x);

        int l = 0;
        int r = str.length() - 1 ;


        while ( l <  r){

            if (str.charAt(l) != str.charAt(r) && l != r){
                return false;
            }

            else{
                l++;
                r--;
            }

        }

        return true;
            
        
    }
}