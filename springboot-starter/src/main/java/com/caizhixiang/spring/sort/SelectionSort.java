package com.caizhixiang.spring.sort;

/**
 * 选择排序
 * 
 * @author Administrator
 *
 */
public class SelectionSort {
	public void selectionSort(int[] arr) {
		int k;
		for (int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
			k = i;
			for (int j = k + 1; j < arr.length; j++) {// 选最小的记录
				if (arr[j] < arr[k]) {
					k = j; // 记下目前找到的最小值所在的位置
				}
			}
			// 在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
			if (i != k) { // 交换a[i]和a[k]
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		System.out.println("交换后：");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] array = { 5, 69, 12, 3, 56, 789, 2, 5648, 23 };
		selectionSort.selectionSort(array);
	}
}
