package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String testInput = "";
		System.out.print("Enter a hexadecimal number: ");
		testInput = scnr.next();
		int length = testInput.length();
		int i = 0;
		int value = 0;
		long output = 0;
		if (testInput.charAt(0) == '0' && testInput.charAt(1) == 'x') {
			i = 2;
			while (i < (length)) {char c = testInput.charAt(i);
				if (c >= 'A' && c <= 'F' ) {
					value = c - 55;
				} else if (c >= 'a' && c <= 'f'){
					value = c - 87;
				} else if (c >= '0' && c <= '9'){
					value = c - '0';
				}
				output += (value * Math.pow(16,length-i-1));
				i++;
			}
		}
		else {
				while (i <length){char c = testInput.charAt(i);
					if (c >= 'A' && c <= 'F' ) {
						value = c - 55;
					} else if (c >= 'a' && c <= 'f'){
						value = c - 87;
					} else if (c >= '0' && c <= '9'){
						value = c - '0';
					}
					output += (value * Math.pow(16,length-i-1));
					i++;

				}
			}
		System.out.print("Your number is " + output + " in decimal");
    }
}
