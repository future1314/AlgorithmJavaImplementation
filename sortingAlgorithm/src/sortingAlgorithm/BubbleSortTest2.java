package sortingAlgorithm;

public class BubbleSortTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1314, 920, 360 , 20863,3456,246437,234 ,11,23,3232,2323,4343,2131,221,312,321,3,123,21,321,321,3,123,21,321,3,213,21,321,312,3,21,1314, 920, 360 , 20863,3456,246437,234 ,11,23,3232,2323,4343,2131,221,312,321,3,123,21,321,321,3,123,21,321,3,213,21,321,312,3,21,1314, 920, 360 , 20863,3456,246437,234 ,11,23,3232,2323,4343,2131,221,312,321,3,123,21,321,321,3,123,21,321,3,213,21,321,312,3,21,1314, 920, 360 , 20863,3456,246437,234 ,11,23,3232,2323,4343,2131,221,312,321,3,123,21,321,321,3,123,21,321,3,213,21,321,312,3,21};
		long startTime=System.nanoTime();   //��ȡ��ʼʱ��    
		System.out.print("����ǰ��");
		TestSort.printArr(numbers);
		new BubbleSortImprove().bubbleSort(numbers);
		System.out.print("ð�������");
		TestSort.printArr(numbers);
		long endTime=System.nanoTime(); //��ȡ����ʱ��  
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns"); 
	}

}
