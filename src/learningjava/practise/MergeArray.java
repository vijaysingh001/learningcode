package learningjava.practise;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 4, 0, 2, 8, 0, 0, 0};

		int[] sortedArr = Arrays.stream(arr)
		        .boxed()
		        .sorted((a, b) -> a == 0 ? 1 : b == 0 ? -1 : a - b)
		        .mapToInt(Integer::intValue)
		        .toArray();

		System.out.println(Arrays.toString(sortedArr));
		

	}

}
