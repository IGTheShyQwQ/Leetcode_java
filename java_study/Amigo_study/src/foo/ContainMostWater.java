package foo;

public class ContainMostWater {
    public static void main(String[] args) {
        int[] input = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println((maxArea(input)));

    }
    public static int maxArea(int[] height) {

        if (height == null || height.length < 1) return 0;
        int max_area = 0;

        int start = 0;
        int end = height.length - 1;

        while(start != end){
            int width = end - start;
            int height_rec = Math.min(height[start], height[end]);
            max_area = Math.max(max_area, width*height_rec);
            if (height[start] < height[end]){
                start++;
            }else end--;
        }
        return max_area;
    }
}
