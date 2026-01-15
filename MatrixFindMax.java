public class MatrixFindMax {
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6}};
        int max = mat[0][0];

        for(int i=0;i<2;i++)
            for(int j=0;j<3;j++)
                if(mat[i][j] > max) max = mat[i][j];

        System.out.println("Maximum: "+max);
    }
}
