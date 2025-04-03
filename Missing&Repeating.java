class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[arr.length+1];
        int repeating=-1,miss=-1;
        for(int i=0;i<arr.length;i++){
            if(visited[arr[i]]){
                repeating=arr[i];
            }else{
                visited[arr[i]]=true;
            }
        }
        for(int i=1;i<=arr.length;i++){
            if(!visited[i]){
                miss=i;
                break;
            }
        }
        res.add(repeating);
        res.add(miss);
        return res;
    }
}
