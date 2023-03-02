class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
       if(ruleKey.equals("type")){
           System.out.println(ruleKey);
           int i = 0;
           //int col = 0;
           while(i < items.size()){
               if(ruleValue.equals(items.get(i).get(0))){
                   count++;
               }

               i++;
           }

       } 

       if(ruleKey.equals("color")){
               int i = 0;
               // int col = 1;
                while(i < items.size()){
               if(ruleValue.equals(items.get(i).get(1))){
                   count++;
               }

               i++;
           }
       }

       if(ruleKey.equals("name")){
           int i = 0;
           //int col = 2;
                 while(i < items.size()){
               if(ruleValue.equals(items.get(i).get(2))){
                   count++;
               }

               i++;
           }
       }

       return count;
    }
}
