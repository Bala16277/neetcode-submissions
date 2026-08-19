class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j = i + 1; j < nums.length - 1; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }
                for(int k = j + 1; k < nums.length; k++) {
                    if(k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    List<Integer> triplet = new ArrayList<>();
                    int target = nums[i] + nums[j] + nums[k];
                    if(target == 0) {
                        triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        triplets.add(triplet);
                    }
                }
            }
        }
        return triplets;
    }
}
