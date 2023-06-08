package com.kh.practice.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// SWAP
		// a 방에 b 값으로 바꾸고, b방에 a값으로 바꾸기
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println(a); // 20
		System.out.println(b); // 10
		
		// 버블 정렬 값을 하나하나 비교하여 하나씩 정렬함
		int[] arr = new int[] { 3, 2, 5, 1, 6, 8 };
		//
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // 오름차순
					// if(arr[j] < arr[j+1] { // 내림차순
					// SWAP
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("==== String 버블 정렬 ====");
		//버블 정렬
		String[] nameArr = new String[] {"손범규", "천영준", "유청하", "김민성"};
		// 배열 ==> List
		for(int i = 0; i < nameArr.length -1; i++) {
			for(int j = 0; j < nameArr.length-i-1; j++) {
				if(nameArr[j].compareTo(nameArr[j+1]) < 0) {	// 내림차순
				//if(nameArr[j].comparTo(nameArr[j+1]) > 0)		// 오름차순
					String temp = nameArr[j];
					nameArr[j] = nameArr[j+1];
					nameArr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < nameArr.length; i++) {
			System.out.print(nameArr[i]+ " ");
		}
		
		
		
	}

}
