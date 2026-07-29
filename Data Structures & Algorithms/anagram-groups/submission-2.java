class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs)
            .collect(
                Collectors.groupingBy(s -> {
                    char[] ch = s.toCharArray();
                    Arrays.sort(ch);
                    return Arrays.toString(ch);
                })
            ).values()
            .stream()
            .toList();
        
    }
}
