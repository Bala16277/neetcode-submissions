/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        int n = intervals.size();
        int[] s = new int[n];
        int[] e = new int[n];

        for(int i = 0; i < n; i++) {
            s[i] = intervals.get(i).start;
            e[i] = intervals.get(i).end;
        }

        Arrays.sort(s);
        Arrays.sort(e);

        int minRooms = 0;
        int startPointer = 0;
        int endPointer = 0;
        int rooms = 0;

        while(startPointer < n) {
            if(s[startPointer] < e[endPointer]) {
                rooms++;
                startPointer++;
            } else {
                rooms--;
                endPointer++;
            }
            minRooms = Math.max(minRooms, rooms);
        }
        return minRooms;
    }
}
