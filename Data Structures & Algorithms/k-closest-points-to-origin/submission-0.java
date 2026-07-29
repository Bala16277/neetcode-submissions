class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> maxHeap = new PriorityQueue<>((b, a) -> {
            return (a[0] * a[0] + a[1] * a[1]) -
            (b[0] * b[0] + b[1] * b[1]);
        });

        for(int[] point : points) {
            maxHeap.offer(point);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] closestPoints = new int[k][2];
        for(int i = 0; i < k; i++) {
            closestPoints[i] = maxHeap.poll();
        }

        return closestPoints;
    }
}
