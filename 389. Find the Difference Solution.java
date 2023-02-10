class Solution {
    public char findTheDifference(String s, String t) {
        char[] c = s.toCharArray();
        char[] ch = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(ch);

        int x = 0;
        int y = 0;

        while (x < s.length()) {
            if (c[x] != ch[y]) {
                return ch[y];
            }
            x++;
            y++;
        }
        return ch[t.length() - 1];
    }
}
