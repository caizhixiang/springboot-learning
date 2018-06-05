package com.caizhixiang.spring.sort;

import java.util.Arrays;

/**
 * 快速排序 link{http://developer.51cto.com/art/201403/430986.htm}
 * 
 * @author Administrator
 *
 */
public class QuickSort {
	public static void quickSort(int a[], int left, int right) {
		if (left >= right) {
			return;
		}
		int i = left;
		int j = right;
		int temp = a[left];
		while (i != j) {
			while (i < j && a[j] >= temp) {
				j--;
			}
			while (i < j && a[i] <= temp) {
				i++;
			}
			if (i < j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		// 把基准插入,此时i与j已经相等
		a[left] = a[i];
		a[i] = temp;

		quickSort(a, left, i - 1);// 继续处理左边的，这里是一个递归的过程
		quickSort(a, i + 1, right);// 继续处理右边的 ，这里是一个递归的过程
	}

	public static void main(String[] args) {
		int a[] = { 8, 2, 6, 12, 1, 9, 5, 5, 10 };
		quickSort(a, 0, 8);/* 排好序的结果 */
		Arrays.stream(a).forEach(System.out::println);

	}
}
