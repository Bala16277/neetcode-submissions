class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length())
                .append("#")
                .append(str);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> strList = new ArrayList<>();
        while(i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int strLength = Integer.parseInt(str.substring(i, j));

            String decodedWord = str.substring(j + 1, j + 1 + strLength);
            strList.add(decodedWord);
            i = j + 1 + strLength;
        }
        return strList;
    }
}
