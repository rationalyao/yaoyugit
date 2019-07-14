import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] arr_test = {1,23,6,41,245,2,5635,465,357,5865,3,6256345};
		System.out.println(Arrays.toString(InsertSort(arr_test)));
	}

	public static int[] InsertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
}
