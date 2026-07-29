class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        groupedAnagrams = Arrays.stream(strs)
            .collect(
                Collectors.groupingBy(s -> {
                    char[] ch = s.toCharArray();
                    Arrays.sort(ch);
                    return Arrays.toString(ch);
                })
            );
        return new ArrayList<>(groupedAnagrams.values());
    }
}
