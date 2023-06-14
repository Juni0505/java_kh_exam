package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner scan = new Scanner(System.in);
	
	public void practice1() {
		int[] array = new int[10];
		int i;
		for(i = 1; i <= array.length; i++) {
			System.out.print(i + " ");
		}
	}
	public void practice2() {
		int[] array = new int[10];
		int i;
		for(i = 0; i < array.length; i++) {
			System.out.print(array.length - i + " ");
		}
	}
	public void practice3() {
		System.out.print("양의 정수 : ");
		int i = scan.nextInt();
		int[] arr = new int[i];
		for(int s = 1; s <= arr.length; s++) {
			System.out.print(s + " ");
		}
	}
	public void practice4() {
		String strArr[] = {"사과", "귤", "포도","복숭아", "참외"};
		System.out.println(strArr[1]);
	}
	public void practice5() {
		System.out.println("문자열 : ");
		String str = scan.next();
		System.out.println("문자 : ");
		char ch = scan.next().charAt(0);
		
		
		int count = 0;
		int indices[] = new int[str.length()];
		int iC = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count ++;
				indices[iC] = i;
				iC++;
			}
		}
		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스): ");
		for (int j = 0; j < iC; j++) {
			System.out.print(indices[j] + " ");
		}
		System.out.println();
		System.out.println(ch + " 개수: " + count);
		
	}
	public void practice6() {
		String[] arr = new String[7];
		arr[0] = "월요일";
		arr[1] = "화요일";
		arr[2] = "수요일";
		arr[3] = "목요일";
		arr[4] = "금요일";
		arr[5] = "토요일";
		arr[6] = "일요일";
		
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = scan.nextInt();
		if(num >= 0 && num <= 6) {
			System.out.println(arr[num]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void practice7() {
		System.out.println("정수 : ");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번쨰 인덱스에 넣을 값 : ");
			arr[i] = scan.nextInt();
		}
		System.out.println("배열 값들 : " );
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총 합 : " + sum);
	}
	public void practice8() {
		int count = 1;
		System.out.println("정수 : ");
		int num = scan.nextInt();
		if(num >= 3 && num%2==1) {
			for(int i = 0; i<num; i++) {
				if(i>=num/2) {
					System.out.print(count+" ");
					count --;
				}else {
					System.out.print(count + " ");
					count ++;
				}
			}
		} else {
			System.out.println("다시 입력하세요.");
		}
	}
	public void practice9() {
		String[] chickenMenu = {"양념", "후라이드", "간장", "마늘"};
		System.out.println("치킨 이름을 입력하세요. : ");
		String chicken = scan.nextLine();
		boolean found = false;
		for(int i = 0; i < chickenMenu.length; i++) {
			if(chickenMenu[i].equals(chicken)) {
					found = true;
					break;
			}
		}
		if(found) {
			System.out.println(chicken + "치킨 배달 가능");
		}else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
	
		
		
	}
}
