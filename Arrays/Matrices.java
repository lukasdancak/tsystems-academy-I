public class Matrices {
    public static void main(String[] args) {
        //int[][] aMatrix = new int[4][];
        int[][] aMatrix = {{98, 65, 32, 21, 54}, {41, 52, 63, 96, 85}, {48, 54, 65, 48, 7}, {95, 48, 87, 65, 21}};

        int[][] bMatrix = {{79, 46, 31, 82, 56}, {96, 85, 74, 52, 63}, {97, 56, 54, 25, 63}, {19, 37, 64, 28, 95}};
        //{null, ..., null}
        //{{0, 0, 0, 0, 0}, ..., {0, 0, 0, 0, 0}}
        int[][] dMatrix = {{79, 46, 31, 82}, {96, 85, 74, 52}, {97, 56, 54, 25}, {19, 37, 64, 28}};
        int[][] eMatrix = {{79, 46, 31, 82}, {96, 85, 74, 52}, {97, 56, 54, 25}, {19, 37, 64, 28}};

        int[][] fMatrix = {{79, 46, 31}, {96, 85, 74}};
        int[][] gMatrix = {{79, 46, 31}, {96, 85, 74}, {97, 56, 54}};


        int[][] addition = addMatrices(aMatrix, bMatrix);
        int[][] transposed = transpose(aMatrix);
        int[][] multiplied = multiply(dMatrix, eMatrix);

        //print matrix
        printMatrix(aMatrix);
        printMatrix(bMatrix);
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixA[1].length];
        //sucet matic - kazdy prvok s kazdym prvkom
        //vysledok bude v matrixC

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[1].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixC;
    }


    private static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[1].length][matrix.length];
        //https://cs.wikipedia.org/wiki/Transpozice_matice
        //vysledok bude v transposed

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }


        return transposed;
    }

    private static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixA[1].length];
        //https://www.math.sk/skripta/node46.html
        //vysledok bude v matrixC
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[1].length; j++) {
                matrixC[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }


        return matrixC;
    }

    private static int[][] multiplyOpravene(int[][] matrixA, int[][] matrixB) {
        if (matrixA[0].length != matrixB.length) {
            return null;
        }
        int[][] matrixC = new int[matrixA.length][matrixB[1].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixC[i][j] = vynasobitRiadokSoStlpcom(matrixA, i, matrixB, j); //doplnit dalej - urobit metodu,
                // kt spoji matixA i riadok
                //  s matrixB j stlpcom
            }
        }

        //https://www.math.sk/skripta/node46.html
        //vysledok bude v matrixC

        return matrixC;
    }

    static int vynasobitRiadokSoStlpcom(int[][] a, int b, int[][] i, int j) {
        return 0;


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