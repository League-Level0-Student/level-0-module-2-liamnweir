import javax.swing.JOptionPane;

class rollercoaster {
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "You must be 48 or taller to ride on the rollercoaster");
String answer=JOptionPane.showInputDialog("How tall are you? (by inches)");
int inches = Integer.parseInt(answer);
if (inches >= 48) { 
	
JOptionPane.showMessageDialog(null, "You can go on the rollercoster!");
	
	
}
else {
	JOptionPane.showMessageDialog(null, "You are not tall enough. Sorry!");
	
}
}
}



