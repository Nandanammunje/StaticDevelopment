package com.nuance.FileCopier;

import java.util.Comparator;

public class SortbyLength implements Comparator<String> {

	

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		return b.length()-a.length();
	}
}
