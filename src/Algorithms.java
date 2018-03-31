
import java.util.ArrayList;
import java.util.Random;

public class Algorithms {
	int n;

	public Algorithms(int n) {
		super();
		this.n = n;
	}

	public int Find_Max_Element(int a[]) {
		int max = a[0];
		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public void Generate_Random_Numbers(int a[]) {
		Random r = new Random();
		int i;
		for (i = 0; i < n; i++) {
			a[i] = r.nextInt();
		}
	}

	public void Generate_Random_Numbers(ArrayList<Integer> a) {
		Random r = new Random();
		int i;
		for (i = 0; i < n; i++) {
			a.add(r.nextInt());
		}
	}

	public void Generate_Numbers_For_BinarySearch(int a[]) {
		int i;
		for (i = 0; i < n; i++) {
			a[i] = i + 1;
		}
	}

	public int[] Bubblesort(int a[]) {
		int i, j;
		for (i = 0; i < a.length; i++) {
			int swaps = 0;
			for (j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					swaps = swaps + 1;
				}
			}
			if (swaps == 0)
				break;
		}
		return a;
	}

	public int BinarySearch(int a[], int value, int left, int right) {
		if (left <= right) {
			int mid = ((right - left) / 2) + left;
			if (a[mid] == value)
				return mid;
			if (value < a[mid])
				return BinarySearch(a, value, left, mid - 1);
			else if (value > a[mid])
				return BinarySearch(a, value, mid + 1, right);
		}
		return -1;
	}

	public ArrayList<Integer> MergeSort(ArrayList<Integer> a) {
		if (a.size() == 1)
			return a;
		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		return Merge(first, second);

	}

	public ArrayList<Integer> Merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> last = new ArrayList<>();
		while (a.size() > 0 && b.size() > 0) {
			if (a.get(0) > b.get(0)) {
				last.add(b.get(0));
				b.remove(0);
			} else {
				last.add(a.get(0));
				a.remove(0);
			}
			while (a.size() > 0) {
				last.add(a.get(0));
				a.remove(0);
			}
			while (b.size() > 0) {
				last.add(b.get(0));
				b.remove(0);
			}
		}
		return last;

	}

}
