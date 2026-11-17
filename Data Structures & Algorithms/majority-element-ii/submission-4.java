class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!seen.containsKey(nums[i])){
                seen.put(nums[i], 1);
            }
            else{
                seen.put(nums[i], seen.get(nums[i])+1);
            }
        }

        List<Integer> output = new ArrayList<>();

        for(Integer x : seen.keySet()){
            if(seen.get(x) > nums.length/3){
                output.add(x);
            }
        }
        return output;
    }
}