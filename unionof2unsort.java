class Solution {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> res = new HashSet<Integer>();
        Iterator<Integer> it = res.iterator();
        for(int i : a){
            res.add(i);
        }
        for(int j : b){
            res.add(j);
        }
        return res.size();
    }
}
