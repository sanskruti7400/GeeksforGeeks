class Solution {
    void pushZerosToEnd(int[] arr) {
        int k=0;
        for(int num : arr){
            if(num!=0){
                arr[k++]=num;
            }
        }
        int i=arr.length;
        while(k<i){
            arr[k++]=0;
        }
    }
}
