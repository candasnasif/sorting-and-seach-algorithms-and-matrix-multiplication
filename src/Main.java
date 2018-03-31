
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner user_input = new Scanner(System.in);
		System.out.println("1.Matrix Multiplication");
		System.out.println("2.Finding Maximum Element");
		System.out.println("3.Bubble Sort");
		System.out.println("4.Merge Sort");
		System.out.println("5.Binary Search");
		int choice = user_input.nextInt();
		System.out.println("Enter Size");
		int n = user_input.nextInt();
		Algorithms algorithm = new Algorithms(n);
		switch (choice) {
		case 1:
			Matrix m = new Matrix(n);
			int a[][] = new int[n][n];
			int b[][] = new int[n][n];
			int c[][] = new int[n][n];
			m.Generate_Random_Numbers(a);
			m.Generate_Random_Numbers(b);
			long startTime = System.currentTimeMillis();
			m.Matrix_Multiplication(a, b, c);
			long endTime = System.currentTimeMillis();
			long duration = (endTime - startTime);
			System.out.println(duration);
			break;
		case 2:
			int max[] = new int[n];
			algorithm.Generate_Random_Numbers(max);
			long startTime1 = System.nanoTime();
			algorithm.Find_Max_Element(max);
			long endTime1 = System.nanoTime();
			long duration1 = (endTime1 - startTime1);
			System.out.println(duration1);

			break;
		case 3:
			int bub[] = new int[n];
			algorithm.Generate_Random_Numbers(bub);
			long startTime2 = System.nanoTime();
			int result[] = algorithm.Bubblesort(bub);
			long endTime2 = System.nanoTime();
			long duration2 = (endTime2 - startTime2);
			System.out.println(duration2);

			break;
		case 4:
			ArrayList<Integer> merge = new ArrayList<>();
			algorithm.Generate_Random_Numbers(merge);
			long startTime3 = System.nanoTime();
			merge = algorithm.MergeSort(merge);
			long endTime3 = System.nanoTime();
			long duration3 = (endTime3 - startTime3);
			System.out.println(duration3);

			break;
		case 5:
			System.out.println("Enter a number for search");
			// int value=user_input.nextInt();
			int bub_binary[] = new int[n];
			algorithm.Generate_Random_Numbers(bub_binary);
			int result_binary[] = algorithm.Bubblesort(bub_binary);
			long startTime4 = System.nanoTime();
			int index = algorithm.BinarySearch(result_binary, 17, 0, result_binary.length);
			long endTime4 = System.nanoTime();
			long duration4 = (endTime4 - startTime4);
			System.out.println(duration4);

			break;
		}
	}

}
