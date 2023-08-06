class Solution {
    public int maxArea(int[] height) {
        int max=0; 
        int l=0;
        int r=height.length-1;
        while(l<r){
            if(height[l]<height[r]){
                max=Math.max(max , height[l]*(r-l));
                l++;
            }
            else {
                max=Math.max(max ,height[r]*(r-l));
                r--;
            }
        }
        return max;
    }
}