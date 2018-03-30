package sortingAlgorithm;

public class BubbleSortImprove {

	public void bubbleSort(int[] numbers) {
		// 初始化为无序状态
		boolean sorted = false;
		int temp = 0;
		int size = numbers.length;
		for (int i = 0; i < size - 1&& !sorted; i++) {
			// 假设已经有序，若没有发生交换，则sorted维持为true，下次循环将直接退出。
			sorted = true;
			for (int j = 0; j < size - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) // 交换两数位置
				{
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					// 数组无序
					sorted = false;
				}
			}
		}
	}

}
