public class RBinarySearch {
	public static void main(String[] args) {
		int[] arr_test = {1,42,64,75,322,54647};
		System.out.println(RBinarySearch(arr_test, 322, 0, arr_test.length-1));
	}

	public static int RBinarySearch(int[] arr, int des, int low, int high) {

		int middle = (low + high)/2;

		if (arr[middle] == des) {
			return middle;
		}else if (arr[middle] < des) {
			return RBinarySearch(arr, des, middle+1, high);
		}else  {
			return RBinarySearch(arr, des, low, middle - 1);
		}

	}
}
