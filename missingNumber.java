class Solution {
    int missingNumber(int arr[]) {
        Arrays.sort(arr);
        if(arr[0]!=1){
            return 1;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr.length == 1){
                return arr[i] + 1;
            }
            if(arr[i]+1!=arr[i+1]){
                return arr[i]+1;
            }
        }
        return arr[arr.length-1]+1;
    }
}