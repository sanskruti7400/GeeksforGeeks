class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixA.length;j++){
                matrixA[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
    }
}
