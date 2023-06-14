package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	String[] str = { "가위", "바위", "보" };

	

	public void rps() {
		System.out.println("당신의 이름을 입력해주세요.");
		String name = scan.nextLine();
		int record = 0;
		int win = 0;
		int lose = 0;
		int tie = 0;
		while (true) {
			System.out.println("가위바위보(가위/바위/보) : ");
			String user = scan.nextLine();
			String randomstr = str[random.nextInt(str.length)];
			System.out.println("컴퓨터 : " + randomstr);
			System.out.println(name + " : " + user);
			if(user.equals(str)) {
				System.out.println("비겼습니다.");
				tie++;
				record++;
			}else if(user.equals("바위") && str.equals("보") || user.equals("가위") && str.equals("바위")
					||user.equals("보") && str.equals("가위")) {
				System.out.println("졌습니다.");
				lose++;
				record++;
			}else if(user.equals("바위") && str.equals("가위")|| user.equals("가위") && str.equals("보")
					|| user.equals("보") && str.equals("바위")) {
				System.out.println("이겼습니다.");
				win++;
				record++;
			}
			if(user.equals("exit")){
				System.out.println(record+"전 "+win+"승 "+tie+"무 "+lose+"패");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			}
		
	}
}