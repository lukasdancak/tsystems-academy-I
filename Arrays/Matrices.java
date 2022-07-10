public class Matrices {
    public static void main(String[] args) {
        //int[][] aMatrix = new int[4][];
        int[][] aMatrix ={{98,65,32,21,54},{41,52,63,96,85},{48,54,65,48,7},{95,48,87,65,21}};

        int[][] bMatrix = {{79,46,31,82,56},{96,85,74,52,63},{97,56,54,25,63},{19,37,64,28,95}};
        //{null, ..., null}
        //{{0, 0, 0, 0, 0}, ..., {0, 0, 0, 0, 0}}



        int[][] addition = addMatrices(aMatrix, bMatrix);
        int[][] transposed = transpose(aMatrix);
        int[][] multiplied = multiply(aMatrix, bMatrix);

        //print matrix
        printMatrix(aMatrix);
        printMatrix(bMatrix);
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixA[1].length];
        //sucet matic - kazdy prvok s kazdym prvkom
        //vysledok bude v matrixC

        for (int i=0;i<matrixA.length;i++){
            for(int j= 0; j<matrixA[1].length;j++){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixC;
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[1].length][matrix.length];
        //https://cs.wikipedia.org/wiki/Transpozice_matice
        //vysledok bude v transposed

        for (int i=0;i<matrix.length;i++){
            for(int j= 0; j<matrix[1].length;j++){
                transposed[j][i] = matrix[i][j];
            }
        }


        return transposed;
    }

    private static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixA[1].length];
        //https://www.math.sk/skripta/node46.html
        //vysledok bude v matrixC
        for (int i=0;i<matrixA.length;i++){
            for(int j= 0; j<matrixA[1].length;j++){
                matrixC[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }


        return matrixC;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("***********");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}