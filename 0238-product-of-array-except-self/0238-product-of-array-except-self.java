class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] output = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;

        for(int i=1, j=n-2; i<n && j>=0; i++, j--){
            prefix[i] = prefix[i-1] * nums[i-1];
            suffix[j] = suffix[j+1] * nums[j+1];
        }

        for(int i=0; i<n; i++){
            output[i] = prefix[i] * suffix[i];
        }

        return output;
    }
}