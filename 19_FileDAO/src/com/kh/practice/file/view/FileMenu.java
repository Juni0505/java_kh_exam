package com.kh.practice.file.view;

import java.io.File;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		System.out.println("***** My Note *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		while (true) {
			if (!(select == 1) && !(select == 2) && !(select == 3) && !(select == 9)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			} else if (select == 1)
				fileSave();
			else if (select == 2)
				fileOpen();
			else if (select == 3)
				fileEdit();
			else if (select == 9)
				System.out.println("프로그램을 종료합니다.");
			break;
		}
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			System.out.println();
			String str = sc.nextLine();
			if (str.equals("ex끝it"))
				break;
			sb.append(str);
		}
		while(true) {
			System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String filePath = sc.nextLine();
			File f = new File(filePath);
			if(f.exists()) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
				char check = sc.next().charAt(0);
				if(check == 'y' || check == 'Y') {
					fc.fileSave(filePath, sb);
					return;
				}else if (check == 'n' || check == 'N') {
					break;
				}else {
					System.out.println("다시 입력해주세요.");
				}
			}else {
				fc.fileSave(filePath, sb);
				return;
			}
			
		}
		
	}

	public void fileOpen() {
		System.out.println("열 파일 명 : ");
		String filename = sc.nextLine();
		if(fc.checkName(filename) == true) {
			System.out.println(fc.fileOpen(filename));
			return;
		}else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}

	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		System.out.println("수정할 파일 명 : ");
		String filePath = sc.nextLine();
		if(fc.checkName(filePath) == true) {
			while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			if(str.equals("ex끝it"))
				break;
			sb.append(str);
			}
			fc.fileEdit(filePath, sb);
		}else {
			System.out.println("없는 파일 입니다.");
			return;
		}
	}
}
