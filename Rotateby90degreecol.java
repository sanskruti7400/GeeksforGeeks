class GFG {
    static void rotate(int mat[][]) {
        for(int i=0;i<mat.length-1;i++){
            for(int j=i+1;j<mat.length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length/2;j++){
                int flag=mat[i][j];
                mat[i][j]=mat[i][mat.length-1-j];
                mat[i][mat.length-1-j]=flag;
            }
        }
    }
}
