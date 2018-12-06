import javax.swing.JOptionPane;

public class TicketBooth {
public static void main(String[] args) {
String answer =JOptionPane.showInputDialog("How old are you?");
	int age=Integer.parseInt(answer);
	if (age>=18) {
		JOptionPane.showMessageDialog(null, "You are aloud to vote!");
		
		
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
}
}
