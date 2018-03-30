package sortingAlgorithm;

public class TestSort {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1314, 920, 360 , 20863,3456,246437,234 };
		System.out.print("����ǰ��");

		printArr(numbers);
		new BubbleSort().bubbleSort(numbers);
		System.out.print("ð�������");
		printArr(numbers);

		new QuickSort().quickSort(numbers);
		System.out.print("���������");
		printArr(numbers);
		
		new InsertSort().insertSort(numbers);;
		System.out.print("���������");
		printArr(numbers);
		
		new MergeSort().mergeSort(numbers, 0, numbers.length-1);;
		System.out.print("�鲢�����");
		printArr(numbers);
	}

	/**
	 * ��ӡ����
	 * 
	 * @param numbers
	 *            Ҫ���������
	 */
	public static void printArr(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}
		System.out.println("");
	}
}
