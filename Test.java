package com.mypkg.controller;
import java.util.Scanner;

public class Test {
	/*
	 * The code has to work for below test cases and display output as given below.
	 * Output is after the --> arrow. Input is before the arrow
	 * Test Cases
	 * 2 FOR 2 0 FOR - > 2,2,0,0,0,0,0,1
	 * 1 for 5 0 FOR 0 0 -> 1,1,1,1,1,0
	 * 1 2 3 4 6 5 for 10 1 -> 1,2,3,4,6,5,5,5,5,5,5,5,5,5,5
	 */
	public static void main(String args[]) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		java7Test(ss);
		ss.close();
	}

	private static void java7Test(Scanner ss) {
		String text;
		String output = "";
		// TODO Auto-generated method stub
		while ((text = ss.nextLine()) != null) {

			String[] trim = text.split("\\s+");

			for (int i = 0; i < trim.length; i++) {
				if (trim[i].equalsIgnoreCase("For")) {
					int a = Integer.parseInt(trim[i - 1].trim());
					int b = Integer.parseInt(trim[i + 1].trim());
					for (int j = 0; j < b; j++) {
						output = output + a + ",";
					}
					i++;
				} else {
					if ((i + 1) < trim.length) {
						if (!(trim[i + 1].trim().equalsIgnoreCase("For"))) {
							output = output + trim[i] + ",";
						}
					} else {
						output = output + trim[i] + ",";
					}
				}
			}
			System.out.println("Output: " + output.substring(0, output.lastIndexOf(",")) + "");
			output = "";
			System.out.println("Enter your Number : ");
		}

	}
}
