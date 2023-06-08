package com.kh.practice.list.music.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();

	public int addList(Music music) {
		int result = 0;
		if (list.add(music)) {
			result = 1;
		}
		return result; // 0: 추가 실패, 1: 추가 성공
	}

	public int addAtZero(Music music) {
		int result = 0;
		int cnt = list.size();
		((ArrayList<Music>) list).add(0, music);
		int cntAfter = list.size();
		if (cnt < cntAfter) {
			result = cntAfter - cnt;
		}
		return result;
	}

	public List<Music> printAll() {
		// TODO
		return list;
	}

	public Music searchMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}
		return result;
	}

	public Music removeMusic(String title) {
		Music removeMusic = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				removeMusic = list.get(i);
				list.remove(i);

			}
		}
		return removeMusic;
	}

	public Music setMusic(String title, Music music) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.set(i, music);
				/*
				 * Music result = null; for(Music vo : list) { if(vo.getTitle().equals(title)) {
				 * // title이 같은 것을 찾 result = vo; // 찾은 Music 객체vo를 return 하면 됨.
				 * 
				 * // 불가 vo = muisc; // vo는 for문의 새로운 지역변수로 list와는 무관한 공간임 int findIdx =
				 * list.indexOf(vo); list.set(findIdx, music);
				 * 
				 * break;
				 */
			}
		}
		return music;
	}

	public int ascTitle() {
		int result = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j).getTitle().compareTo(list.get(j + 1).getTitle()) > 0) {
					Music temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		result = 1;
		return result;

	}

	public int descSinger() {
		// list 에서 singer 는 없다. list의 1개 객체에서 Singer가 있다.
		// list.get(0).getSinger();
		int result = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j).getSinger().compareTo(list.get(j + 1).getSinger()) < 0) {
					// 정렬기준은 list의 Music 형태의 객체 중 singer 값으로 비교함.

					Music temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		result = 1;
		return result;
	}

	public int ascTitle2() {
		Collections.sort(list, new AscTitle());
		int result;
		if (list.size() > 0) {
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}

	public int descSinger2() {
		Collections.sort(list);
		int result;
		if (list.size() > 0) {
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}

	public int saveFile(String filePath) {
		int result = 0; // 0 : 저장실패, 1 : 저장성공

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(filePath)));) {
			oos.writeObject(list);
			oos.flush();
			result = 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// filePath에 list의 Music 객체들을 저장함
		return result;
	}

	public int loadFile(String filePath) {
		int result = 0;
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));) {
			list = (List<Music>) ois.readObject();
			System.out.println(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}