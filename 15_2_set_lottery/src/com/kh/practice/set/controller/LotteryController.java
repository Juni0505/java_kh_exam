package com.kh.practice.set.controller;

import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		
		
		return lottery.add(l);
	}
	public boolean deleteObject(Lottery l) {
		
		return true;
	}
	public HashSet<Lottery> winObject(){
		
		
		return win;
	}
	public TreeSet<Lottery> sortedWinObject(){
		
		return new TreeSet<>(win);
	}
	public boolean searchWinner(Lottery l) {
		
		return win.contains(l);
	}
}
