package com.kh.practice.file.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File checkFile = new File(file);
		if (checkFile.exists()) {
			return true;
		} else {
			return false;
		}
	}

	public void fileSave(String file, String s) {
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(file));
			w.append(s);
			w.flush();
			if(w != null)
				w.close();
				
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

	public StringBuilder fileOpen(String file) {
		StringBuilder strBuilder = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = br.readLine();
			while (str != null) {
				strBuilder.append(str + "\n");
				str = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return strBuilder;
	}

	public void fileEdit(String file, String s) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.append(s);
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}