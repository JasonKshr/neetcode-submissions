class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        // Make a copy so we can remove things
        HashMap<Integer, Integer> copy = new HashMap<>(map);

        int[] result = new int[k];

        // Find the top k keys with highest values
        for (int i = 0; i < k; i++) {
            int bestKey = Integer.MIN_VALUE;
            int bestValue = Integer.MIN_VALUE;

            // Loop to find max value in the map
            for (int key : copy.keySet()) {
                int value = copy.get(key);
                if (value > bestValue) {
                    bestValue = value;
                    bestKey = key;
                }
            }

            result[i] = bestKey;   // save key
            copy.remove(bestKey);  // remove so the next max can be picked
        }

        return result;
    }
}
