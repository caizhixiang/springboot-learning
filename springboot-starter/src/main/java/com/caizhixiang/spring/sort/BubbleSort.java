package com.caizhixiang.spring.sort;

/**
 * 冒泡排序
 * 
 * @author Administrator
 *
 */
public class BubbleSort {
	public void bubblesort(int arrayVal[], int length) {
		int i, j;
		int temp;

		for (i = 0; i < length - 1; i++)
			for (j = i + 1; j < length; j++)
				if (arrayVal[i] > arrayVal[j]) {
					// 置换位置
					temp = arrayVal[i];
					arrayVal[i] = arrayVal[j];
					arrayVal[j] = temp;
				}
	}

	public static void main(String[] args) {
		BubbleSort selectionSort = new BubbleSort();
		int[] array = { 5, 69, 12, 3, 56, 789, 2, 5648, 23 };
		selectionSort.bubblesort(array, array.length);
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
