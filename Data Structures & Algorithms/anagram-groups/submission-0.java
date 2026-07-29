class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = Arrays.toString(ch);
            groupedAnagrams.computeIfAbsent(key, k -> new ArrayList()).add(s);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}
