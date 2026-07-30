class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    res[i] = res[i] * nums[j];
                } else {
                    continue;
                }
            }
        }

        return res;
    }
}  
