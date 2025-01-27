class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        int k=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                k=1;
            }
        }
        if(k==0){
            return true;
        }else{
            return false;
        }
    }
}