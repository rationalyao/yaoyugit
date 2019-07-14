public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr_test = {1,4,67,77,99,102,333,576};
		System.out.println(BinarySearch(arr_test, 99));
	}

	public static int BinarySearch(int[] arr, int des) {

		int low = 0;
		int high = arr.length - 1;

		while (low < high) {

			int middle = (low + high)/2;

			if (arr[middle] == des) {
				return middle;
			} else if (arr[middle] < des) {
				low = middle;
			} else {
				high = middle;
				middle = low;
			}
		}

		return -1;
	}

}