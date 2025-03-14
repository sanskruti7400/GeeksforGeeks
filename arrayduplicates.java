class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> res= new ArrayList<>();
        int k=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            k=1;
            if(arr[i]==arr[i+1]){
                k++;
            }
            if(k>1){
                res.add(arr[i]);
            }
        }
        return res;
    }
}
