class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int i=0,mid=0,j=arr.length-1;
        while(mid<=j){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[i];
                arr[i]=temp;
                i++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[j];
                arr[j]=arr[mid];
                arr[mid]=temp;
                j--;
            }
        }
    }
}
