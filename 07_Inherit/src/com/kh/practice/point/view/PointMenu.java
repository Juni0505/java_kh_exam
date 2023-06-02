package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();

	public void mainMenu() {
		while (true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 원 ");
			System.out.println("2. 사각형 ");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int mM = sc.nextInt();
			if (!(mM == 1) && !(mM == 2) || (mM == 9)) {
				System.out.println("종료합니다.");
				
			} else if (mM == 1) {
				circleMenu();
				break;
			} else if (mM == 2) {
				rectangleMenu();
				break;
			}	break;
		}	
	}

	public void circleMenu() {
		while (true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레 ");
			System.out.println("2. 원 넓이 ");
			System.out.println("9. 메인으로 ");
			System.out.println("메뉴 번호 : ");
			int cM = sc.nextInt();
			while (true) {
				if (!(cM == 1) && !(cM == 2) || (cM == 9)) {
					System.out.println("종료합니다.");
					
				} else if (cM == 1) {
					calcCircum();
					break;
				} else if (cM == 2) {
					calcCircleArea();
					break;
				}	
			} break;
		}
	}

	public void rectangleMenu() {
		while(true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레 ");
			System.out.println("2. 사각형 넓이 ");
			System.out.println("9. 메인으로 ");
			System.out.println("메뉴 번호 : ");
			int rM = sc.nextInt();
			while (true) {
				if(!(rM == 1) && !(rM == 2) || (rM == 9)) {
					System.out.println("종료합니다.");
					
				} else if(rM == 1) {
					calcPerimeter();
					break;
				} else if(rM == 2) {
					calcRectArea();
					break;
				}	
			} break;
		}

	}

	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int cC1 = sc.nextInt();
		System.out.println("y 좌표 : ");
		int cC2 = sc.nextInt();
		System.out.println("반지름 : ");
		int cC3 = sc.nextInt();
		System.out.println(cc.calcCircum(cC1, cC2, cC3));
	}

	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		int cCA1 = sc.nextInt();
		System.out.println("y 좌표 : ");
		int cCA2 = sc.nextInt();
		System.out.println("반지름 : ");
		int cCA3 = sc.nextInt();
		System.out.println(cc.calcCircum(cCA1, cCA2, cCA3));
	}

	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		int cP1 = sc.nextInt();
		System.out.println("y 좌표 : ");
		int cP2 = sc.nextInt();
		System.out.println("높이 : ");
		int cP3 = sc.nextInt();
		System.out.println("너비 : ");
		int cP4 = sc.nextInt();
		System.out.println(rc.calcPerimerther(cP1, cP2, cP3, cP4));
	}

	public void calcRectArea() {
		System.out.println("x 좌표 : ");
		int cRA1 = sc.nextInt();
		System.out.println("y 좌표 : ");
		int cRA2 = sc.nextInt();
		System.out.println("높이 : ");
		int cRA3 = sc.nextInt();
		System.out.println("너비 : ");
		int cRA4 = sc.nextInt();
		System.out.println(rc.calcArea(cRA1, cRA2, cRA3, cRA4));
	}

}
