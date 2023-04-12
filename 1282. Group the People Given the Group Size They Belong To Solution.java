class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();   
        for (int i = 0; i < groupSizes.length; i++) {
            
            int size = groupSizes[i];   
            map.putIfAbsent(size, new ArrayList<>());
          
            
            if (map.get(size).size() == size) {
                ans.add(map.get(size));  
                map.put(size, new ArrayList<>()); 
            }

            map.get(size).add(i);
        }
        ans.addAll(map.values());  
        return ans;   
    }
}
