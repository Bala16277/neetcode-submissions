class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Long> fMap = Arrays.stream(nums)
        .boxed()
        .collect(
            Collectors.groupingBy(
                o -> o,
                Collectors.counting()
            )
        );

        for(Map.Entry<Integer, Long> entry : fMap.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
