class Solution {
    public static boolean matSearch(int mat[][], int x) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(x==mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
