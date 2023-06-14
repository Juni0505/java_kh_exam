package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();

	public void upDown() {
		int randomNum = random.nextInt(100)+ 1;
		int cnt = 0;
		while (true) {
			System.out.println("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = scan.nextInt();
			cnt++;
			if (!(num > 0 && num < 101)) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			} else if (num < randomNum) {
				System.out.println("UP !");
			} else if (num > randomNum) {
				System.out.println("Down !");
			} else if (num == randomNum) {
				System.out.println("정답입니다 !!");
				break;
			}
		}
		System.out.println("시도한 횟수 : " + cnt);
	}
}
