package com.kh.practice.numrange.controller;

import com.kh.practice.numrange.exception.NumRangeException;

public class NumberController {
	public NumberController() {

	}

	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		if (num1 > 0 && num1 < 101 && num2 > 0 && num2 < 101) {
			if (num1 % num2 == 0) {
				return true;
			} else if (num1 % num2 > 1) {
				return false;
			}
		} throw new NumRangeException("입력된 숫자가 1과 100사이의 범위를 벗어납니다.");

		
	}
}
