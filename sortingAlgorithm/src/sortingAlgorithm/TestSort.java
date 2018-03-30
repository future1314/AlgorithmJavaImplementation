package sortingAlgorithm;

public class TestSort {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1314, 920, 360 , 20863,3456,246437,234 };
		System.out.print("排序前：");

		printArr(numbers);
		new BubbleSort().bubbleSort(numbers);
		System.out.print("冒泡排序后：");
		printArr(numbers);

		new QuickSort().quickSort(numbers);
		System.out.print("快速排序后：");
		printArr(numbers);
		
		new InsertSort().insertSort(numbers);;
		System.out.print("插入排序后：");
		printArr(numbers);
		
		new MergeSort().mergeSort(numbers, 0, numbers.length-1);;
		System.out.print("归并排序后：");
		printArr(numbers);
	}

	/**
	 * 打印函数
	 * 
	 * @param numbers
	 *            要排序的数组
	 */
	public static void printArr(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}
		System.out.println("");
	}
}
