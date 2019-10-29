package ArraySplit.ArraySplit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public List<int[]> splitArray(int[] array, int split) {
		List<int[]> arrayList = new ArrayList<int[]>();
		int i = 0;
		while (i < array.length) {
			arrayList.add(Arrays.copyOfRange(array, i, i + split));
			i += split;
		}
		return arrayList;
	}
}
