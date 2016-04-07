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
	JPanel p2=new JPanel();
	p2.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
	JTextField f1=new JTextField("Please choose Location",15);
	JTextField f2=new JTextField("Check in date",15);
	JTextField f3=new JTextField("Check out date",15);
	JComboBox s1=new JComboBox();
	JComboBox s2=new JComboBox();
	JComboBox s3=new JComboBox();
	JButton b1=new JButton("OK");
	p2.add(f1);
	p2.add(s1);
	p2.add(f2);
	p2.add(s2);
	p2.add(f3);
	p2.add(s3);
	p2.add(b1);
	c.add(BorderLayout.CENTER,p2);
	JPanel p3=new JPanel();
	p3.setLayout(new FlowLayout(FlowLayout.CENTER,350,10));
	JPanel subp1=new JPanel();
	JLabel map=new JLabel("hello");
	subp1.add(map);
	
	
	
	
	JPanel subp2=new JPanel();
	subp2.setLayout(new BorderLayout());
	JTextArea hotel_info=new JTextArea("Contact information\nTel:(201)586-9124\nEmail:XXXhotle@gmail.com\n");
	hotel_info.setEditable(false);
	subp2.add(BorderLayout.CENTER,hotel_info);
	
	
	
	
	
	
	
	p3.add(subp1);
	p3.add(subp2);
	c.add(BorderLayout.SOUTH,p3);
	setSize(1000,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
}	
	

	public static void main(String[] args) {
		new HomePage();
		
	}

}
