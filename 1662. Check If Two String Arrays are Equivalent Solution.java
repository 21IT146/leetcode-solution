class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // String sb=new String(" ");
        // String sp=new String(" ");

        // for(int i=0;i<word1.length;i++)
        // {
        //     sb+=word1[i];
        // }
        // for(int i=0;i<word2.length;i++)
        // {
        //     sp+=word2[i];
        // }
        // if(sb.length()!=sp.length())
        // {
        //     return false;
        // }
        // int j=0;
        // for(int i=0;i<sb.length();i++)
        // {
        //     if(sb.charAt(i)!=sp.charAt(j))
        //     {
        //         return false;

        //     }
        //     if(j<sb.length()-1){
        //        j++;
        //     }
        // }
        return String.join("",word1).equals(String.join("",word2));
    }
}
