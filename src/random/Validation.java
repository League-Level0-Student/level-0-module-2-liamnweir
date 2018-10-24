//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(9);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber==0) {
			JOptionPane.showMessageDialog(null, ("You are a talented person!"));
		}
		if (randomNumber==1) {
			JOptionPane.showMessageDialog(null, ("You are a fenomininal person!"));
		}
		if (randomNumber==2) {
			JOptionPane.showMessageDialog(null, ("You are a trustworthy friend!"));
		}
		if (randomNumber==3) {
			JOptionPane.showMessageDialog(null, ("You are a responsible person"));
		}
		if (randomNumber==4) {
			JOptionPane.showMessageDialog(null, ("You are a honest friend!"));
		}
		if (randomNumber==5) {
			JOptionPane.showMessageDialog(null, ("You make my life so much happier!"));
		}
		if (randomNumber==6) {
			JOptionPane.showMessageDialog(null, ("You are great at everything you do!"));
		}
		if (randomNumber==7) {
			JOptionPane.showMessageDialog(null, ("You are my best friend!"));
		}
		if (randomNumber==8) {
			JOptionPane.showMessageDialog(null, ("I like your personality!"));
		}
		if (randomNumber==9) {
			JOptionPane.showMessageDialog(null, ("You crack me up!"));
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
