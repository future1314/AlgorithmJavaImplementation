package sortingAlgorithm;

/**
 * TODO��������
 * 
 * @author Administrator
 * @date 2017��11��3��
 * @version
 */
public class QuickSort {
	/**
	 * ���ҳ����ᣨĬ�������λlow������numbers�������������λ��
	 * 
	 * @param numbers ����������
	 * @param low ��ʼλ��
	 * @param high ����λ��
	 * @return ��������λ��
	 */
	public static int getMiddle(int[] numbers, int low, int high) {
		// ����ĵ�һ����Ϊ����
		int temp = numbers[low]; 
		while (low < high) {
			while (low < high && numbers[high] > temp) {
				high--;
			}
			// ������С�ļ�¼�Ƶ��Ͷ�
			numbers[low] = numbers[high];
			while (low < high && numbers[low] < temp) {
				low++;
			}
			// �������ļ�¼�Ƶ��߶�
			numbers[high] = numbers[low]; 
		}
		numbers[low] = temp; // �����¼��β
		return low; // ���������λ��
	}

	/**
	 * 
	 * @param numbers ����������
	 * @param low ��ʼλ��
	 * @param high ����λ��
	 */
	public static void quick(int[] numbers, int low, int high) {
		if (low < high) {
			int middle = getMiddle(numbers, low, high); // ��numbers�������һ��Ϊ��
			quick(numbers, low, middle - 1); // �Ե��ֶα���еݹ�����
			quick(numbers, middle + 1, high); // �Ը��ֶα���еݹ�����
		}

	}

	/**
	 * ��������
	 * ���������ṩ��������
	 * @param numbers ����������
	 */
	public static void quickSort(int[] numbers) {
		// �鿴�����Ƿ�Ϊ��
		if (numbers.length > 0) 
		{
			quick(numbers, 0, numbers.length - 1);
		}
	}

}
