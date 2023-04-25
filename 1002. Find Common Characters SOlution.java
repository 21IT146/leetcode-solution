class Solution {
    public List<String> commonChars(String[] words) {
      
        
        
        int vt[][]= new int[26][3];
        for(int i=0;i<26;i++)
            vt[i][1]=1000000;
        
    
        int n=words.length;
        for(String st:words){
            
            for(char c:st.toCharArray()){
                vt[c-'a'][0]++;
                vt[c-'a'][2]++;
            }
            for(int i=0;i<26;i++){
                vt[i][1]=Math.min(vt[i][1],vt[i][2]);vt[i][2]=0;}
  
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<26;i++){
          while(vt[i][0]>=n && vt[i][1]-->0)list.add(String.valueOf((char)(97+i)));}
      
        return list;
    }
}
