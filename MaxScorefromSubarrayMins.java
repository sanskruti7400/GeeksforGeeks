class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        if(arr.length < 2)
            return 0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i]+arr[i+1];
            max=Math.max(max,sum);
        }
        return max;
    }
}
