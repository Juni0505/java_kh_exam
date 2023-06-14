package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("00메뉴입니다.");
		System.out.println("1.입력 \n2.수정 \n3.조회 \n4.삭제 \n7.종료");
		System.out.println("메뉴 번호를 입력하세요");

		int i = scan.nextInt();
		if (i == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (i == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (i == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (i == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (i == 7) {
			System.out.println("종료 메뉴입니다.");
		}

		scan.close();
	}

	public void method2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");

		int i = scan.nextInt();
		if (i > 0 && (i % 2) == 0) {
			System.out.println("짝수다.");
		} else if (i <= 0) {
			System.out.println("양수만 입력하세요");
		} else if (i % 2 == 1) {
			System.out.println("홀수다");
		}
		scan.close();
	}

	public void method3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.println("수학 점수 : ");
		int math = scan.nextInt();
		System.out.println("영어 점수 : ");
		int eng = scan.nextInt();

		if (kor > 39 && math > 39 && eng > 39 && ((kor + math + eng) / 3) > 59) {
			System.out.println("축하합니다, 합격입니다 ! ");

		} else {
			System.out.println("불합격입니다.");
		}
		scan.close();
	}

	public void method4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1월~12월 사이의 정수 입력 : ");
		int i = scan.nextInt();
		switch (i) {
		case 1:
			System.out.printf("1월은 겨울입니다.");
			break;
		case 2:
			System.out.println("2월은 겨울입니다.");
			break;
		case 3:
			System.out.println("3월은 겨울입니다.");
			break;
		case 4:
			System.out.println("4월은 봄입니다.");
			break;
		case 5:
			System.out.println("5월은 봄입니다.");
			break;
		case 6:
			System.out.println("6월은 봄입니다.");
			break;
		case 7:
			System.out.println("7월은 여름입니다.");
			break;
		case 8:
			System.out.println("8월은 여름입니다.");
			break;
		case 9:
			System.out.println("9월은 여름입니다.");
			break;
		case 10:
			System.out.println("10월은 여름입니다.");
			break;
		case 11:
			System.out.println("11월은 겨울입니다.");
			break;
		case 12:
			System.out.println(i + "월은 겨울입니다.");
			break;
		default:
			System.out.println(i + "월은 잘못 입력된 달입니다.");
		}
		scan.close();
	}

	public void method5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디, 비밀번호를 입력하세요");
		String id = scan.next();
		String password = scan.next();
		if (id.equals("myId") && password.equals("myPassword12")) {
			System.out.println("로그인이 성공");
		} else if (!(id.equals("myId"))) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (!(password.equals("myPassword12"))) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		scan.close();
	}

	public void method6() {
		Scanner scan = new Scanner(System.in);
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String str = scan.next();
		if (str.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if (str.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (str.equals("비회원")) {
			System.out.println("게시글 조회");
		}
		scan.close();
	}

	public void method7() {
		Scanner scan = new Scanner(System.in);

		System.out.println("키를 입력해주세요(m) : ");
		double height = scan.nextDouble();

		System.out.println("몸무게를 입력해주세요(kg) : ");
		double weight = scan.nextDouble();

		System.out.println("BMI지수 : " + (weight) / (height * height));
		double d = (weight) / (height * height);
		if (d < 18.5) {
			System.out.println("저체중입니다.");
		} else if (d >= 18.5 && d <= 23) {
			System.out.println("정상체중입니다.");
		} else if (d >= 23 && d < 25) {
			System.out.println("과체중입니다.");
		} else if (d >= 25 && d < 30) {
			System.out.println("비만입니다.");
		} else if (d >= 30) {
			System.out.println("고도 비만입니다.");
		}
		scan.close();
	}

	public void method8() {
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수와 연산기호를 입력해주세요");
		System.out.println("피연산자 1 입력 : ");
		double i1 = scan.nextInt();
		System.out.println("피연산자 2 입력 : ");
		double i2 = scan.nextInt();
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		String str = scan.next();
		if (i1 <= 0 || i2 <= 0) {
			System.out.println("잘못 입력했습니다.");
		}
		String s1 = i1 + str + i2;

		if (str.equals("+")) {
			System.out.println(s1 + " = " + (double) (i1 + i2));
		} else if (str.equals("-")) {
			System.out.println(s1 + " = " + (double) (i1 - i2));
		} else if (str.equals("*")) {
			System.out.println(s1 + " = " + (double) (i1 * i2));
		} else if (str.equals("/")) {
			System.out.println(s1 + " / " + (double) (i1 / i2));
		} else if (str.equals("%")) {
			System.out.println(s1 + " % " + (double) (i1 % i2));
		}
		scan.close();
	}

	public void method9() {
		Scanner scan = new Scanner(System.in);
		System.out.println("중간고사, 기말고사, 과제점수, 출석회수를 입력하세요 ");
		System.out.println("중간고사 점수 : ");
		double d1 = scan.nextDouble();
		System.out.println("기말고사 점수 : ");
		double d2 = scan.nextDouble();
		System.out.println("과제 점수 : ");
		double d3 = scan.nextDouble();
		System.out.println("출석 회수 : ");
		int i1 = scan.nextInt();
		System.out.println("======결과======");
		double t1 = d1 * 0.2;
		double t2 = d2 * 0.3;
		double t3 = d3 * 0.3;
		double t4 = (double) (i1 * 5) * 0.2;

		System.out.println("중간고사 점수 (20) : " + t1);
		System.out.println("기말고사 점수 (30) : " + t2);
		System.out.println("과제 점수 	   (30) : " + t3);
		System.out.println("출석 점수    (30) : " + t4);
		double t5 = t1 + t2 + t3 + t4;
		System.out.println("총점 : " + t5);
		if (t5 >= 70 && i1 > 14) {
			System.out.println("PASS");
		} else if (i1 < 15) {
			System.out.println("Fail [출석 미달] ");
		} else if (t5 < 70) {
			System.out.println("Fail [점수 미달] ");
		}
		scan.close();
	}

	public void method10() {
		Scanner scan = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out
				.println("1. 메뉴 출력 \n2. 짝수/홀수 \n3. 합격/불합격 \n4. 계절 \n5. 로그인 " + "\n6. 권한확인 \n7. BMI \n8. 계산기 \n9. P/F");
		int s = scan.nextInt();
		System.out.println("선택 : " + s);
		switch (s) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			method4();
			break;
		case 5:
			method5();
			break;
		case 6:
			method6();
			break;
		case 7:
			method7();
			break;
		case 8:
			method8();
			break;
		case 9:
			method9();

		default:
			System.out.println("잘못된 값입니다.");
		}
		scan.close();
	}

	public void method11() {
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호 입력(1000~9999) : ");
		int pw = scan.nextInt();
		String strPw = Integer.toString(pw);
		char ch1 = strPw.charAt(0);
		char ch2 = strPw.charAt(1);
		char ch3 = strPw.charAt(2);
		char ch4 = strPw.charAt(3);

		if (pw > 999 && pw < 10000) {
			if (ch1 == ch2 || ch1 == ch3 || ch1 == ch4 || ch2 == ch3 || ch2 == ch4 || ch3 == ch4) {
				System.out.println("중복값이 있음");
			} else {
				System.out.println("생성 성공");
			}
		} else {
			System.out.println("자릿수가 안맞음");
		}
	scan.close();	}
}
