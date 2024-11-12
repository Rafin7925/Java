import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Search extends JFrame implements ActionListener
{
		JLabel l1;
		JTextField t1;
		JButton b1; 
		JPanel p1,p2;
{
	this.setTitle("The vibe around you");
	this.setSize(600,900);
	this.setResizable(false);
	ImageIcon img =new ImageIcon("C:\Users\USER\Pictures\New folder");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	p1 = new JPanel();
	p1.setSize(new Dimension(600,900));
	p1.setBackground(Color.blue);
	p1.setLayout(null);
	
	
	
	l1 = new JLabel("SkySkanner");
	l1.setFont(new Font("Serif",Font.BOLD,30));
	l1.setForeground(Color.black);
	l1.setBounds(0,0,600,900);
	p1.add(l1);
	
	p2 = new JPanel();
	p2.setSize(new Dimension(600,900));
	p2.setBackground(Color.black);
	p2.setLayout(null);
	
	t1 = new JTextField();
	t1.setBounds(0,0,600,900);
	p2.add(t1);
	
	b1 = new JButton("Search");
	b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	b1.setForeground(Color.black);
	b1.setBackground(Color.yellow);
	b1.setBounds(0,0,600,900);
	b1.addActionListener(this);
	p2.add(b1);
	
	this.add (p1);
	this.add (p2);

}
public void actionPerformed(ActionEvent ae)
		
		{}
}