package sortingAlgorithm;

/**
 * TODOð������ ���ǱȽϼ򵥵�һ�ֵ������㷨��Ӧ�������Ǵ�ѧ���ȽӴ�����һ�������㷨�ˡ� �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
 * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û����������� ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
 * 
 * @author Administrator
 * @date 2017��11��3��
 * @version
 */
public class BubbleSort {

	public static void bubbleSort(int[] numbers) {
		int temp = 0;
		int size = numbers.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) // ��������λ��
				{
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

}
