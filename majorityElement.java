class Solution {
    static int majorityElement(int arr[]) {
        int k ;
        if (arr.length == 1) {
            return arr[0];
        } else {
            for (int i = 0; i < arr.length ; i++) {
                k=0
                for (int j = 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        k++;
                    }
                }
                if (k > arr.length / 2) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
