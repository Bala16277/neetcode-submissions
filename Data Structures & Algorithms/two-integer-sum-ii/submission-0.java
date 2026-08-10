class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(!numMap.containsKey(target - numbers[i])) {
                numMap.put(numbers[i], i);
            } else {
                return new int[]{numMap.get(target - numbers[i]) + 1, i + 1};
            }
        }
        return new int[2];
    }
}
