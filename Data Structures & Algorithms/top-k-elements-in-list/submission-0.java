class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fMap = new HashMap<>();
        for(int num : nums) {
            fMap.put(num, fMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> numList = new ArrayList<>(fMap.keySet());
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> fMap.get(a) - fMap.get(b));
        //1-1, 2-2, 3-3, 7-2
        for(Integer i : numList) {
            minHeap.offer(i);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        System.out.println(minHeap.size());
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
