package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	
	int r = 0;
	JOptionPane.showMessageDialog(null, "You are entering a lottery compeition! You are watching the TV...");
	JOptionPane.showMessageDialog(null, "Anouncer: Now, the time has come. The lottery is now starting.");
	JOptionPane.showMessageDialog(null, "He calls out the numbers and.....");
	Random LotteryTicket=new Random();
	r=LotteryTicket.nextInt(4);
	System.out.println(r);
	
	
	
	r=LotteryTicket.nextInt((4-1)+1)+1;
	
	
	
System.out.println(0);

if (r==1) {
	JOptionPane.showMessageDialog(null, "You win!");
	JOptionPane.showMessageDialog(null, "You jump up and down! You can't believe you won 1,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 dollars! You are now the richest man on Earth!");
	
}
else if (r==0) {
JOptionPane.showMessageDialog(null, "Sorry, you lost");	
	JOptionPane.showMessageDialog(null, "You cry, putting your head down");
}
else if (r==2) {
JOptionPane.showMessageDialog(null, "Sorry, you lost");	
JOptionPane.showMessageDialog(null, "You cry, putting your head down");
}
else if (r==3) {
JOptionPane.showMessageDialog(null, "Sorry, you lost");	
JOptionPane.showMessageDialog(null, "You cry, putting your head down");
 if (r==4) {
JOptionPane.showMessageDialog(null, "Sorry, you lost");	
JOptionPane.showMessageDialog(null, "You cry, putting your head down");
}
}
}}

