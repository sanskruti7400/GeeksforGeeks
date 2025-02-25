class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int k=arr.length;
        if(arr.length==1){
            return -1;
        }else{
            for(int i=arr.length-1;i>0;i--){
                if(arr.length==2 && arr[i]==arr[i-1]){
                    return -1;
                }
                if(arr[i]!=arr[i-1]){
                    return arr[i-1];
                }
            }
        }
        return -1;
    }
}