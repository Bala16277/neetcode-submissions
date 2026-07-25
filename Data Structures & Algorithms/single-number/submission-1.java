class Solution {
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums)
        .boxed()
        .collect(
            Collectors.groupingBy(
                o -> o,
                Collectors.counting()
            )
        ).entrySet()
        .stream()
        .filter(e -> e.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(0)
        .intValue();
    }
}
