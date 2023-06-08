package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void mainMenu() {
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			String selectStr = sc.nextLine();
			int select = 0;
			// 비정상입력 경우
			try {
				select = Integer.parseInt(selectStr); //사용자 입력값을 menu에 대입
			} catch (NumberFormatException e) {
				System.out.println("문자는 입력될 수 없습니다.");
			}
			// 정상입력 경우
			switch(select) {
			case 1 :
				addList();
				break;
			case 2 :
				addAtZero();
				break;
			case 3 :
				printAll();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				removeMusic();
				break;
			case 6 :
				setMusic();
				break;
			case 7 :
				ascTitle();
				break;
			case 8 :
				descSinger();
				break;
			case 9 :
				System.out.println("종료");
				return;	// 종료 경우 메소드 종료
			default :
				// 비정상 입력 경우
				System.out.println("메뉴에 해당하는 1~9 숫자만 작성해주세요.");
				continue;	// 다시 메뉴 입력으로 돌아감
			}
				
		}
	}

	public void addList() {
//		****** 마지막 위치에 곡 추가 ******
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.println("곡명을 입력해주세요.");
		String title = sc.nextLine();
		System.out.println("가수명을 입력해주세요.");
		String singer = sc.nextLine();
	/*	Music vo = new Music();
		vo.setTitle(title);
		vo.setSinger(singer);	
		mc.addList(vo);	*/
		int result = mc.addList(new Music(title,singer));
		if(result > 0) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void addAtZero() {
	//	****** 첫 위치에 곡 추가 ******
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.println("곡명을 입력해주세요.");
		String title = sc.nextLine();
		System.out.println("가수명을 입력해주세요.");
		String singer = sc.nextLine();
		int result = mc.addList(new Music(title,singer));
		if(result > 0) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List<Music> musiclist = mc.printAll();
		for(Music music : musiclist) {
			System.out.println(music);
		}
	}

	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("검색할 곡명을 입력해주세요.");
		String title = sc.nextLine();
		Music result = mc.searchMusic(title);
		if(result == null) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			System.out.println("검색한 곡은 " + result.getTitle() +  ", " + result.getSinger() + " 입니다.");
		}
	}

	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.println("삭제할 곡명을 입력해주세요.");
		String title = sc.nextLine();
		Music result = mc.removeMusic(title);
		if(result == null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println(result.getTitle() + ", " + result.getSinger() + "을 삭제 했습니다.");
		}
	}

	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.println("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.println("수정할 곡 명 : ");
		String setTitle = sc.nextLine();
		System.out.println("수정할 가수 명 :");
		String singer = sc.nextLine();
		Music music = new Music(setTitle, singer);
		if(mc.searchMusic(title) == null) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.println(mc.setMusic(setTitle, music)+ "의 값이 변경되었습니다.");
		}
		
	}

	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int result = mc.ascTitle2();
		if(result == 1 ) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}

	public void descSinger() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		int result = mc.descSinger2();
		if(result == 1 ) {
			System.out.println("정렬 성공 ");
		}else {
			System.out.println("정렬 실패 ");
		}
	}
	public void saveFile() {
		System.out.println("****** 곡정보를 파일에 저장 ******");
		System.out.println("저장할 파일경로를 작성해 주세요.");
		String fileName = sc.nextLine();
		int result = mc.saveFile(fileName);
		if(result > 0) {
			System.out.println("저장 성공");
		}else {
			System.out.println("저장 실패");
		}
	}
	
	
	
}
