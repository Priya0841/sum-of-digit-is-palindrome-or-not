class Solution {
    int isDigitSumPalindrome(int n) {
        
        int sum = 0;
        while(n!= 0){
            sum = sum + n%10;
            n = n/10;
        }
        int reversed = 0;
        int original = sum;
        //code for checking palindrome or not
        while(sum != 0){
            reversed = reversed *10 + sum %10;
            sum/= 10;
        }
        return original == reversed ? 1 : 0;
    }
}
