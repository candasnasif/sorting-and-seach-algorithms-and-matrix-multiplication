
import java.util.Random;
import java.util.Scanner;

public class Matrix {
	int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Matrix(int n) {
		super();
		this.n = n;
	}

	public void Generate_Random_Numbers(int matrix[][]) {
		Random r = new Random();
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matrix[i][j] = r.nextInt();
			}
		}
	}

	public void Matrix_Multiplication(int a[][], int b[][], int c[][]) {
		int i, j, k;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				c[i][j] = 0;
				for (k = 0; k < n; k++) {
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}

	}
}
