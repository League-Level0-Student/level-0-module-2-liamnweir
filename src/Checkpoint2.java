import javax.swing.JOptionPane;

public class Checkpoint2 {
public static void main(String[] args) {
	
String r=JOptionPane.showInputDialog("How many cups of flour do you have?");
int flour=Integer.parseInt(r);
System.out.println(r);
if (flour < 2){
	JOptionPane.showMessageDialog(null, "You must go and buy more!");
	
	
}
else {
	
	JOptionPane.showMessageDialog(null, "Perfect!");
	
}
String x=JOptionPane.showInputDialog("How many people are you making cookies for?");
int people=Integer.parseInt(x);
if (people > 30) {
	JOptionPane.showMessageDialog(null, "You are going to have to bake 2 batches of cookies!");
}
else {
	JOptionPane.showMessageDialog(null, "You will only need one batch of cookies then.");
}
String y=JOptionPane.showInputDialog("How many batches of cookies did you bake?");
int batches=Integer.parseInt(y);
if (batches>2) {
	JOptionPane.showMessageDialog(null, "You are lucky to have so many friends!");
}
}
}
