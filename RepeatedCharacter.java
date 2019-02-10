package com.mypkg.controller;

import java.util.HashMap;

public class RepeatedCharacter {

	public static void main(String[] args) {
		String text = "abcdabba";
		HashMap<Character, Integer> letterCount = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			if(!letterCount.containsKey(text.charAt(i))) {
				letterCount.put(text.charAt(i), 1);
				int count =0;
				for (int j = 0; j < text.length(); j++) {
					if (text.charAt(i) == text.charAt(j)) {
						count++;
						letterCount.put(text.charAt(i), count);
					}
					
				}
			}
		}
		System.out.println(letterCount);
	}

}
