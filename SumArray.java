import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number row:");
        n=scanner.nextInt();
        System.out.println("Input number col:");
        m=scanner.nextInt();
        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];
        int[][] matrixC = new int[n][m];
        //input matrix A
        System.out.println("Input matrixA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element matrixB["+i+ "," +j+ "]:");
                matrixA[i][j] = scanner.nextInt();
            }
        }
        //display matrix A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        //input matrix B
        System.out.println("Input matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element matrixB["+i+ "," +j+ "]:");
                matrixB[i][j] = scanner.nextInt();
            }
        }
        //display matrix B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
        //display matrix c
        System.out.print(" Display matrix C:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixC[i][j]=matrixA[i][j]+matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
