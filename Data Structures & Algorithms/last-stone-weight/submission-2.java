class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if(stones == null || n == 0) {
            return 0;
        }

        if(n == 1) {
            return stones[0];
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < n; i++) {
            maxHeap.offer(stones[i]);
        }
        
        while(maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x > y) {
                maxHeap.offer(x - y);
            } else if(x < y) {
                maxHeap.offer(y - x);
            } else {
                continue;
            }
        }

        return !maxHeap.isEmpty() ? maxHeap.peek() : 0;
    }
}
