import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr = {1,354,2,45,26,34,64,57,8,56,222};
		SelectSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void SelectSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			if (i != min) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
