package sortingAlgorithm;

public class BubbleSortTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1314, 920, 360 , 20863,3456,246437,234 ,11,23,3232,2323,4343,2131,221,312,321,3,123,21,321,321,3,123,21,321,3,213,21,321,312,3,21,1314, 920, 360 , 20863,3456,246437,234 ,11,23,3232,2323,4343,2131,221,312,321,3,123,21,321,321,3,123,21,321,3,213,21,321,312,3,21,1314, 920, 360 , 20863,3456,246437,234 ,11,23,3232,2323,4343,2131,221,312,321,3,123,21,321,321,3,123,21,321,3,213,21,321,312,3,21,1314, 920, 360 , 20863,3456,246437,234 ,11,23,3232,2323,4343,2131,221,312,321,3,123,21,321,321,3,123,21,321,3,213,21,321,312,3,21};
		long startTime=System.nanoTime();   //获取开始时间    
		System.out.print("排序前：");
		TestSort.printArr(numbers);
		new BubbleSortImprove().bubbleSort(numbers);
		System.out.print("冒泡排序后：");
		TestSort.printArr(numbers);
		long endTime=System.nanoTime(); //获取结束时间  
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 
	}

}
