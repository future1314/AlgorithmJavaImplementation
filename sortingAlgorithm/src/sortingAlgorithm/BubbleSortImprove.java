package sortingAlgorithm;

public class BubbleSortImprove {

	public void bubbleSort(int[] numbers) {
		// ��ʼ��Ϊ����״̬
		boolean sorted = false;
		int temp = 0;
		int size = numbers.length;
		for (int i = 0; i < size - 1&& !sorted; i++) {
			// �����Ѿ�������û�з�����������sortedά��Ϊtrue���´�ѭ����ֱ���˳���
			sorted = true;
			for (int j = 0; j < size - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) // ��������λ��
				{
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					// ��������
					sorted = false;
				}
			}
		}
	}

}
