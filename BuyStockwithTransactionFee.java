
class Solution {
    public int maxProfit(int arr[], int k) {
        int b=-arr[0];
        int s=0;
        int profit=0;
        for(int i=1;i<arr.length;i++){
            b=Math.max(b,s-arr[i]);
            s=Math.max(s,b+arr[i]-k);
        }
        return s;
    }
}
