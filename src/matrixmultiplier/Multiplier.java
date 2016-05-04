/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplier;
/**
 *
 * @author UP732011 <UP732011@myport.ac.uk>
 */
public class Multiplier {
    public static final Integer [] [] Multiply2DMatrices(Integer [][] mat1, 
            Integer [][] mat2) throws Exception
    {
        
        if(mat1 == null || mat2 == null || mat1[0].length == 0 || 
                mat2.length == 0)
            throw new Exception("A matrix is null");
        
        printMatrixDimensions(mat1);
        printMatrixDimensions(mat2);
        
        if(mat1[0].length != mat2.length)
            throw new Exception("Sizes are not adequate for multiplication");
        
        Integer [][] returnMat = new Integer[mat1.length] [mat2[0].length];
        
        for(int i = 0; i < mat2[0].length; i++)
        {
            for(int rows = 0; rows < mat1.length; rows++)
            {
                int currentCell = 0;
                for(int k = 0; k < mat1.length; k++)
                {
                    currentCell += mat1[i][k] * mat2[k][i];
                }
                returnMat[rows][i] = currentCell;
            }
            
           
        }
        
        printMatrixDimensions(returnMat);
        return returnMat;
    }
    private static void printMatrixDimensions(Integer [] [] mat)
    {
        System.out.println("Matrix size: " + mat.length + " Rows and "
                + mat[0].length + " Columns");

    }
}
