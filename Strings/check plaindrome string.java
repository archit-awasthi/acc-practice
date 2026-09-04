class Solution {
    boolean isPalindrome(String s) {
        int n = s.length();
        
        int left = 0;
        int right = n-1;
        
        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
