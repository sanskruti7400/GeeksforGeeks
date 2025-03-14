class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int k=arr[arr.length-1];
        res.add(k);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=k){
                k=arr[i];
                res.add(arr[i]);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
