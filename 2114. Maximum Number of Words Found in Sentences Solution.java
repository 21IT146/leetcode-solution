class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=1;
        int maxworld=0;
        for(String str:sentences)
        {
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==' ')
                {
                    max++;
                }
                
            }
            maxworld=Math.max(max,maxworld);
            max=1;
        }
        return maxworld;
    }
}

