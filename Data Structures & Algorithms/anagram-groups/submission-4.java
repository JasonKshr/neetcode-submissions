class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> group = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String word = strs[i];
            char[] sort = word.toCharArray();
            Arrays.sort(sort);
            String sorted = new String(sort);

            if(!group.containsKey(sorted)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                group.put(sorted, list);
            }
            else{
                group.get(sorted).add(strs[i]);
            }           
        }

        return new ArrayList<>(group.values());
    }
}
