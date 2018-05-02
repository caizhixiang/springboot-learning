package com.caizhixiang.spring.sort;

public class InsertSort {

	public static <T extends Comparable<? super T>> void insertSort(T[] a) {
		for (int i = 1; i < a.length; i++) {
			T tmp = a[i];// 保存当前位置p的元素，其中[0,p-1]已经有序
			int j;
			for (j = i; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--) {
				a[j] = a[j - 1];// 后移一位
			}
			a[j] = tmp;// 插入到合适的位置
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 34, 8, 64, 51, 32, 21 };
		insertSort(arr);
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
	}
}