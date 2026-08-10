class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int number : nums) {
            numSet.add(number);
        }

        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(!numSet.contains(current - 1)) {
            int length = 1;

                while(numSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            } 
        }

        return longest;
    }

    
}
