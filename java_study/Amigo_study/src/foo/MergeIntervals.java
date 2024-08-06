package foo;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(input)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //{{1,3},{2,6},{8,10},{15,18}};
        List<int[]> res = new ArrayList<>();
        int[] compare = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            //{1,3} 3
            //{2,6} 2
            if (intervals[i][0] <= compare[1]){
                compare[1] = Math.max(intervals[i][1], compare[1]);
            }else{
                res.add(compare);
                compare = intervals[i];
            }
        }
        res.add(compare);
        return res.toArray(new int[res.size()][]);
    }
}
