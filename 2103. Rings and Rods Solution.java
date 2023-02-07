class Solution {
   public int countPoints(String rings) {
    int r[] = new int[10];
    int g[] = new int[10];
    int b[] = new int[10];
    
    int n = rings.length();
    
    for(int i=0; i<n; i+=2){
        int a = rings.charAt(i+1)-'0';
        if(rings.charAt(i) == 'R'){
            r[a]++;
        }
        else if(rings.charAt(i) == 'G'){
            g[a]++;
        }
        else if(rings.charAt(i) == 'B'){
            b[a]++;
        }
    }
    int count=0;
    for(int j=0; j<10; j++){
        if(r[j] > 0 && g[j] > 0 && b[j] > 0)
            count++;
    }
    
    return count;
}
}
