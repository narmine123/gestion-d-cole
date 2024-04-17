package professor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Professor extends JFrame {

	private JPanel contentPane;

	public Professor() {
		JFrame currentFrame=this;
		BorderLayout bl=new BorderLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		this.setLayout(new GridLayout(2,3));

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
contentPane.setBackground(new Color(139,170,218));
		setContentPane(contentPane);
	this.setResizable(true);
	 this.setSize(1024,1024);
	this.setLayout(bl);
	 BorderLayout b=new BorderLayout();
	
	
	 
	 JPanel ptext= new JPanel();
	 JLabel ltext = new JLabel();
	 ptext.setLayout(b);
	 ltext.setText("        W E L C O M E  T O  T H E  T E A C H E R S  I N T E R F A C E ");
	 ltext.setVisible(true);
	 ltext.setFont(new Font( "MV Boli", Font.PLAIN,30));
		ltext.setSize(500, 80);
		ptext.add(ltext,BorderLayout.CENTER);
		ptext.setBackground(new Color(139,170,218));
	 this.add(ptext,BorderLayout.NORTH);
	
	 ltext.setBounds(50, 850, 1024, 50);
	 
	 JPanel bigpanel=new JPanel();

	 bigpanel.setLayout(new GridLayout(2,3));
	 this.add(bigpanel);
	 JPanel v1=new JPanel();
	 v1.setBackground(new Color(211,211,211));
	 v1.setLayout(new GridLayout(3,1));

	 JLabel jli1=new JLabel();
	 jli1.setVisible(true);
	 ImageIcon imi1 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\gd.png");
	 jli1.setIcon(imi1);
	 v1.add(jli1);
	
	 JLabel jli2=new JLabel();
	 jli2.setVisible(true);
	 ImageIcon imi2 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\sc.png");
	 jli2.setIcon(imi2);
	 v1.add(jli2);
	 
	 
	 
	 JLabel jli3=new JLabel();
	 jli3.setVisible(true);
	 ImageIcon imi3 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\l.png");
	 jli3.setIcon(imi3);
	 v1.add(jli3);
	 
	 v1.setBackground(new Color(139,170,218));
bigpanel.add(v1);
	JPanel jim=new JPanel();
	JLabel jlim = new JLabel();
	ImageIcon im = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\teacher .png");
	jlim.setIcon(im);
	jim.add(jlim,BorderLayout.CENTER);
	jim.setBackground(new Color(139,170,218));
	bigpanel.add(jim);
	 JPanel v2=new JPanel();
	 v2.setBackground(new Color(139,170,218));
	 bigpanel.add(v2);
	 JPanel m1=new JPanel();
	 m1.setBackground(new Color(139,170,218));
	 JLabel i1= new JLabel();
	 ImageIcon im1 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\p1.png");
	 i1.setText("M A N A G E  C O U R S E S");
	 i1.setFont(new Font( "MV Boli", Font.PLAIN,25));
	 i1.setHorizontalTextPosition(JLabel.CENTER);
	 i1.setVerticalTextPosition(JLabel.BOTTOM);
	 i1.setIcon(im1);
	 m1.add(i1);
	 bigpanel.add(m1,BorderLayout.CENTER);
	 
	 
	 
	
	
	 JPanel v3=new JPanel();
	 v3.setBackground(new Color(139,170,218));
	 JLabel jli4=new JLabel();
	 jli4.setVisible(true);
	 ImageIcon imi4 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\tw.png");
	 jli4.setIcon(imi4);
	 v3.add(jli4);
	 bigpanel.add(v3);
	 JPanel m2=new JPanel();
	 m2.setBackground(new Color(139,170,218));
	 JLabel i2= new JLabel();
	 ImageIcon im2 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\p2.png");
	 i2.setText("M A N A G E  S C O R E S");
	 i2.setFont(new Font( "MV Boli", Font.PLAIN,25));
	 i2.setHorizontalTextPosition(JLabel.CENTER);
	 i2.setVerticalTextPosition(JLabel.BOTTOM);
	 i2.setIcon(im2);
	 m2.add(i2);
	 bigpanel.add(m2);
	 
	
	
	 
	 
	 
	 
	 
	}

}
