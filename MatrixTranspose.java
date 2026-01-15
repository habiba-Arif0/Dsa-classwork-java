public class MatrixTranspose {
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6}};
        int[][] t = new int[3][2];

        for(int i=0;i<2;i++)
            for(int j=0;j<3;j++)
                t[j][i] = mat[i][j];

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++)
                System.out.print(t[i][j]+" ");
            System.out.println();
        }
    }
}
