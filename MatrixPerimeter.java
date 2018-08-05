import java.util.*;

//MatrixPerimeter... the long way
public class MatrixPerimeter {
    int matrixPerimeter(boolean[][] matrix) {
        if(matrix.length == 0)
            return 0;

        int num = 0;
        for(boolean[] a : matrix){
            for(boolean b: a)
                if(b)
                    num += 4;
        }
        int i = 0, j = 0;

        if(matrix.length == 1){
            for(int a = 1; a < matrix[0].length - 1; a++){
                if(matrix[0][a + 1])
                    num--;
                if(matrix[0][a - 1])
                    num--;
            }
            return num;
        }
        else{
            for(boolean[] a : matrix){
                j = 0;
                for(boolean b: a){
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    if(i > 0 && matrix[i][j] && matrix[i - 1][j]){
                        num--;
                    }
                    if((i < (matrix.length - 1)) && matrix[i][j] && matrix[i + 1][j]){
                        num--;
                    }
                    if((j < (matrix[0].length - 1)))
                        if(matrix[i][j] && matrix[i][j + 1]){
                            num--;
                        }
                    if(j > 0 && matrix[i][j] && matrix[i][j - 1]){
                        num--;
                    }

                    j++;
                }
                i++;
            }
        }

        return num;
    }
}
