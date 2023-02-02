class Solution {
     
    public String sortSentence(String s) {
       String[]s1=new String[10];
       String[]s2=s.split(" ");
       for(int i=0;i<s2.length;i++)
       {
           String x=s2[i];
           int a=x.charAt(x.length()-1)-'0';
           s1[a]=x.substring(0,x.length()-1);
       }
       String b="";
       for(int i=0;i<s1.length;i++)
       {
         if(s1[i]!=null)
         b=b+s1[i]+" ";
       }
       return b.substring(0,b.length()-1);
    }
}
