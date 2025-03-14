class Solution {
    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        int i=0,res=0;
        while(i<=k-1){
            res=arr[i];
            i++;
        }
        return res;
    }
}
