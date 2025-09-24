// the following code is implemenion of StrassenAlgo 
// the is some AI generated  so i wrote simple algorithm  Thank you
public class StrassenAlgo {
    private void algorithm(){
        /*
            Step 1 : {
                if matrix size is not in terms of 2 power add rows n colums filled with zero to make it 2 power
                row
            }

            Step 2 :{
                Divide both the matrix into 4 parts both as 
                A11 A12         B11 B12
                A21 A22         B21 B22
            }

            Step 3 :{
                Define matrix add funcion 
                Define Matrix subtratic funcion
                for multiplicaiton we use recursion
            }

            Step 4 : {
                Please kindly use defined function mentioned in step 3 to perform step 4
                we perform 7 multiplicaiton instead of 8 so it decreases the time complexity
                7 multiplicaiton as follow
                P = (A11 + A22)(B11 + B22)
                Q = B11 ( A21 + A22)
                R = A11 (B12 - B22 )
                S = A22 (B21 - B11)
                T = B22( A12+A11)
                U = (A21 - A11)(B12 + B11)
                V = (B21+B22)(A12 - A22)

                C11 = P+S-T+V
                C12 = R+T
                C21 = Q+S
                C22 = P+T-Q+U

                c = [{C11 C12} {C21 C22} ]

                return C 
            }
        */
    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Function to subtract two matrices
    private static int[][] subtractMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Strassen's algorithm for matrix multiplication
    public static int[][] strassenMultiply(int[][] A, int[][] B) {
        int n = A.length;

        if (n == 1) {
            int[][] result = new int[1][1];
            result[0][0] = A[0][0] * B[0][0];
            return result;
        }

        int newSize = n / 2;
        int[][] a11 = new int[newSize][newSize];
        int[][] a12 = new int[newSize][newSize];
        int[][] a21 = new int[newSize][newSize];
        int[][] a22 = new int[newSize][newSize];
        int[][] b11 = new int[newSize][newSize];
        int[][] b12 = new int[newSize][newSize];
        int[][] b21 = new int[newSize][newSize];
        int[][] b22 = new int[newSize][newSize];

        // Dividing matrices into 4 sub-matrices
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                a11[i][j] = A[i][j];
                a12[i][j] = A[i][j + newSize];
                a21[i][j] = A[i + newSize][j];
                a22[i][j] = A[i + newSize][j + newSize];

                b11[i][j] = B[i][j];
                b12[i][j] = B[i][j + newSize];
                b21[i][j] = B[i + newSize][j];
                b22[i][j] = B[i + newSize][j + newSize];
            }
        }

        // Calculating the 7 products
        int[][] p1 = strassenMultiply(a11, subtractMatrices(b12, b22));
        int[][] p2 = strassenMultiply(addMatrices(a11, a12), b22);
        int[][] p3 = strassenMultiply(addMatrices(a21, a22), b11);
        int[][] p4 = strassenMultiply(a22, subtractMatrices(b21, b11));
        int[][] p5 = strassenMultiply(addMatrices(a11, a22), addMatrices(b11, b22));
        int[][] p6 = strassenMultiply(subtractMatrices(a12, a22), addMatrices(b21, b22));
        int[][] p7 = strassenMultiply(subtractMatrices(a11, a21), addMatrices(b11, b12));

        // Combining the results into a single matrix
        int[][] c11 = addMatrices(subtractMatrices(addMatrices(p5, p4), p2), p6);
        int[][] c12 = addMatrices(p1, p2);
        int[][] c21 = addMatrices(p3, p4);
        int[][] c22 = subtractMatrices(subtractMatrices(addMatrices(p5, p1), p3), p7);

        int[][] result = new int[n][n];
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                result[i][j] = c11[i][j];
                result[i][j + newSize] = c12[i][j];
                result[i + newSize][j] = c21[i][j];
                result[i + newSize][j + newSize] = c22[i][j];
            }
        }

        return result;
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] B = {
            {17, 18, 19, 20},
            {21, 22, 23, 24},
            {25, 26, 27, 28},
            {29, 30, 31, 32}
        };

        int[][] result = strassenMultiply(A, B);

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}