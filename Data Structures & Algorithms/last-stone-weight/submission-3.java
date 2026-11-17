class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < stones.length; i++){
            pq.add(stones[i]);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();

            if(x - y != 0) pq.add(Math.abs(x-y));
        }

        if(pq.peek() != null) return pq.poll().intValue();
        return 0;
    }
}
