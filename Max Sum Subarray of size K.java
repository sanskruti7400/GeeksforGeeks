class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            cs+=arr[i];
        }
        ms=cs;
        for(int j=k;j<arr.length;j++){
            cs+=arr[j]-arr[j-k];
            ms=Math.max(ms,cs);    
        }
        return ms;
    }
}
