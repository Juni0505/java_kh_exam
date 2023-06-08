package com.kh.practice.list.music.run;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.view.MusicView;

public class Run {

	public static void main(String[] args) {
/*		String a = "a";
		String b = "b";
		int result = a.compareTo(b);		// a를 기준으로 b랑 비교함
		int result1 = b.compareTo(a);
		System.out.println(result);			// 음수 값이 나옴 == 작다
		System.out.println(result1);	*/	// 양수 값이 나옴 == 크다
											// 0값이 나옴 == 서로 값이 같다.
		
		
		MusicView mv = new MusicView();
		mv.mainMenu();
	}

}
