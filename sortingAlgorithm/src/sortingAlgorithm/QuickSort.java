package sortingAlgorithm;

/**
 * TODO快速排序
 * 
 * @author Administrator
 * @date 2017年11月3日
 * @version
 */
public class QuickSort {
	/**
	 * 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置
	 * 
	 * @param numbers 带查找数组
	 * @param low 开始位置
	 * @param high 结束位置
	 * @return 中轴所在位置
	 */
	public static int getMiddle(int[] numbers, int low, int high) {
		// 数组的第一个作为中轴
		int temp = numbers[low]; 
		while (low < high) {
			while (low < high && numbers[high] > temp) {
				high--;
			}
			// 比中轴小的记录移到低端
			numbers[low] = numbers[high];
			while (low < high && numbers[low] < temp) {
				low++;
			}
			// 比中轴大的记录移到高端
			numbers[high] = numbers[low]; 
		}
		numbers[low] = temp; // 中轴记录到尾
		return low; // 返回中轴的位置
	}

	/**
	 * 
	 * @param numbers 带排序数组
	 * @param low 开始位置
	 * @param high 结束位置
	 */
	public static void quick(int[] numbers, int low, int high) {
		if (low < high) {
			int middle = getMiddle(numbers, low, high); // 将numbers数组进行一分为二
			quick(numbers, low, middle - 1); // 对低字段表进行递归排序
			quick(numbers, middle + 1, high); // 对高字段表进行递归排序
		}

	}

	/**
	 * 快速排序
	 * 快速排序提供方法调用
	 * @param numbers 带排序数组
	 */
	public static void quickSort(int[] numbers) {
		// 查看数组是否为空
		if (numbers.length > 0) 
		{
			quick(numbers, 0, numbers.length - 1);
		}
	}

}
