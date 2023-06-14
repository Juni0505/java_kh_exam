package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		System.out.println("1. 성적 저장");
		System.out.println("2. 성적 출력");
		System.out.println("9. 끝내기");
		int select = sc.nextInt();
		while (true) {
			if (!(select == 1) && !(select == 2) && !(select == 9)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			} else if (select == 1) {
				saveScore();
			} else if (select == 2) {
				readScore();
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	public void saveScore() {
		int num = 0;
		System.out.println((num + 1) + "번 째 학생 정보 기록");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("국어 점수 : ");
		int korscore = sc.nextInt();
		System.out.println("영어 점수 : ");
		int engscore = sc.nextInt();
		System.out.println("수학 점수 : ");
		int mathscore = sc.nextInt();
		int sum = korscore + engscore + mathscore;
		double avg = sum / 3.0;
		scr.saveScore(name, korscore, engscore, mathscore, sum, avg);
		System.out.println("그만 입력하시려면 N 또는 n 입력, 계속하시려면 아무 키나 입력하세요");
		char ch = sc.nextLine().charAt(0);
		if (ch == 'n' || ch == 'N') {
			return;
		} else {
			num++;
		}

	}

	public void readScore() {
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0;
		try {
			DataInputStream dis = new DataInputStream(scr.readScore());
			System.out.println("이름/t국어/t영어/t수학/t총점/t평균");
			count = 0;
			while (true) {
				try {
					String str = dis.readUTF();
					System.out.println(str);
					System.out.println("\t");
					int[] score = new int[4];
					for (int i = 0; i < 4; i++) {
						score[i] = dis.readInt();
						System.out.println(score[i]);
						System.out.println("\t");
						if (i == 3) {
							sumAll += score[i];
						}
					}
					double avg = dis.readDouble();
					System.out.print(avg);
					System.out.println();
					avgAll += avg;
					count++;
				} catch (EOFException e) {
					break;
				}
			}
			if (dis != null)
				dis.close();
			System.out.println("===================");
			System.out.println("읽은 횟수/t전체 합계/t전체 평균");
			System.out.println(count + "\t" + sumAll + "\t" + avgAll);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
