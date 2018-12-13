import java.util.Random;

public class Checkpoint1 {
public static void main(String[] args) {
	int r=0;
	int x=0;
	Random number=new Random();
	r=number.nextInt(1000);
	System.out.println(r);
	x=number.nextInt(900);
	System.out.println(x);
	System.out.println(r+x);
	System.out.println(r-x);
}
}