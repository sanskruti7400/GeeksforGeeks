class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> arr = new HashSet<>();
        ArrayList<Integer> res= new ArrayList<>();
        for(int i : a){
            arr.add(i);
        }
        for(int j : b){
            arr.add(j);
        }
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            Integer val=it.next();
            res.add(val);
        }
        Collections.sort(res);
        return res;
    }
}
