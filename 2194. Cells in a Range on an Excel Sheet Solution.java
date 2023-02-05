class Solution {
    public List<String> cellsInRange(String s) {
        String a=s.substring(1,2);
        String b=s.substring(s.length()-1,s.length());

        List<String> list=new ArrayList<>();
        char c=s.charAt(0);
        char d=s.charAt(3);
    
        if(a.equals(b)){
           for(char i=c;i<=d;i++){
                // System.out.println(m);
                 list.add(i+a);
            }
        }
        else{
           int x=Integer.parseInt(a);
           int y=Integer.parseInt(b);
           for(int j=x;j<=y;j++){
              for(char i=c;i<=d;i++){
                  String last=Integer.toString(j);
                  list.add(i+last);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
