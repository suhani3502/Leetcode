class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> output = new ArrayList<String>();
        int should_ve = 1;
        for(int i=1;i<=target.length;i++){
            if(target[i-1] != should_ve){
                int cnt = target[i-1] - should_ve;
                while(cnt-- > 0){
                    output.add("Push");
                    output.add("Pop");
                }
            }
            output.add("Push");
            should_ve = target[i-1] + 1;
        }
        
        return output;
    }
}