package com.mypkg.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftArray {

	public static void main(String[] args) {
	/*	Question : Remove all the repetitions of the number X from this array
		Move all the remaining elements to the right
		Fill the empty spots on the left side with 1
		Write a program to print the rearranged array.*/
		
		 Scanner s = new Scanner(System.in);
		 String T = s.nextLine(); 
	        for(int i1=0;i1<Integer.parseInt(T.trim());i1++){
	        	String N = s.nextLine(); 
	        	String input = s.nextLine(); 
	        	String X = s.nextLine(); 
	        	String arr[]=input.split("\\s+");
	        	int[] a = new int[Integer.parseInt(N.trim())];
	        	for(int i=0;i<arr.length;i++) {
	        		a[i]=Integer.parseInt(arr[i].trim());
	        	}
	        	for(int i=0;i<Integer.parseInt(N.trim());i++) {
	        		if(a[i]==Integer.parseInt(X.trim())) {
	        			for(int k=i;k>0;k--) {
	        				int temp=a[k];
	        				a[k]=a[k-1];
	        				temp=1;
	        				a[k-1]=temp;
	        			}

	        		}
	        	}
	        	System.out.println(Arrays.toString(a));
	        }
		
	}

}
