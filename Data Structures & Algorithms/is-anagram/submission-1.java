class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

       Map<Character, Integer> fMap = new HashMap<>();
       for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fMap.put(ch, fMap.getOrDefault(ch, 0) + 1);
       }

        for(int j = 0; j < t.length(); j++) {
            char ch1 = t.charAt(j);
            if(fMap.containsKey(ch1)) {
                fMap.put(ch1, fMap.get(ch1) - 1);
                if(fMap.get(ch1) == 0) {
                    fMap.remove(ch1);
                }
            }
        }

        return fMap.size() == 0;
    }
}
