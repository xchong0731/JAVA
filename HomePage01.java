package Homepage;
import java.awt.*;
import javax.swing.*;

public class HomePage extends JFrame{

public HomePage(){
	super("HOTEL BOOKING SYSTEM");
	Container c=getContentPane();
	c.setLayout(new BorderLayout());
	JPanel p1=new JPanel();
	JLabel label1=new JLabel("WELCOME TO XXX HOTLE!");
	label1.setFont(new Font("times", Font.BOLD,28));
	p1.add(label1);
	c.add(BorderLayout.NORTH,p1);
	
	
	setSize(1000,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
}	
	

	public static void main(String[] args) {
		new HomePage();
		
	}

}
