class Solution {
    public List<Integer> partitionLabels(String s) {
        int index = 0, tail_Index = -1, length = 0;
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) map.put(s.charAt(i), i);
        while (index < s.length()) {
            char ch = s.charAt(index);
            int map_lastIndex = map.get(ch);
            if (map_lastIndex > tail_Index) {
                length += map_lastIndex - tail_Index;
                tail_Index = map_lastIndex;
            }
            index++;
            if (tail_Index < index) {
                list.add(length);
                length = 0;
            }
        }
        return list;
    }
}
