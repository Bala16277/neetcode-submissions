class Solution {
    public int lastStoneWeight(int[] stones) {
        
        if(stones == null || stones.length == 0) {
            return 0;
        }

        int n = stones.length;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b,a));
        //Comparator.reverseOrder()
        for(int i = 0; i < n; i++) {
            maxHeap.offer(stones[i]);
        }
        
        while(maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x != y) {
                maxHeap.offer(x - y);
            }
        }

        return !maxHeap.isEmpty() ? maxHeap.peek() : 0;
    }
}
