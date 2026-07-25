class Solution {
    public int reverse(int x) {
        int n = x;
        int sum = 0;
        
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
        while(n != 0) {
            int digit = n % 10;
            
            if(sum > INT_MAX / 10 || sum == INT_MAX / 10 && digit > 7) {
                return 0;
            }

            if(sum < INT_MIN / 10 || sum == INT_MIN / 10 && digit < -8) {
                return 0;
            }
            sum = sum * 10 + digit;
            n = n / 10;
        }
        return sum;
    }
}
