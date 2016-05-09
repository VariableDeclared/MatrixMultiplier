/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplier;

import java.util.function.Function;

/**
 *
 * @author UP732011 <UP732011@myport.ac.uk>
 */
public class MatrixMultiplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Integer[][] mat;
            Integer mat1[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
            Integer mat2[][] = {{1}, {2}, {3}, {4}};
            Integer mat3[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {7, 8, 9, 10},
            {11, 12, 13, 14}};
            Integer mat4[][] = {{1, 2}, {1, 2}};

            mat = Multiplier.MultiplyInteger2DMatrices(mat1, mat2);
            System.out.println("Output Matrix: ");
            printMatrixContents(mat);
            mat = Multiplier.MultiplyInteger2DMatrices(mat4, mat4);
            System.out.println("Output Matrix: ");
            printMatrixContents(mat);
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private static void printMatrixContents(Integer [] [] mat)
    {
        Function<Integer, String> func = (Integer v) -> {
                    String con = "";
                    for (int i = 0; i < v; i++) {
                        con += "-----";
                    }
                    return con;
                };
        int row = 0;
        for (Integer[] arr : mat) {
                ++row;
                
                System.out.println("Row: " + row);
                
                System.out.println(func.apply(arr.length));
                System.out.print("| ");
                for (Integer cell : arr) {

                    System.out.print(cell+ "   ");
                    
                }
                System.out.println("|");
                System.out.println(func.apply(arr.length));
            }
    }

}
