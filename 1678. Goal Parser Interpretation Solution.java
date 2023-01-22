class Solution {
    public String interpret(String command) {
        StringBuilder sc=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
               sc.append("G");
            }
            else if(command.charAt(i)=='('&& command.charAt(i+1)==')'){
                sc.append("o");
                
            }
            else if(command.charAt(i)=='('&& command.charAt(i+1)=='a'){
                sc.append("al");
                
            }
        }
        return sc.toString();
    }
}
