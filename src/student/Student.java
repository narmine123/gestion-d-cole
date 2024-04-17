package student;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import admin.Addmark;

public class Student extends JFrame {

	private JPanel contentPane;
	public Student() {

		JFrame currentFrame=this;



		this.getContentPane().setBackground(new Color(139, 170, 218));
		this.getContentPane().setForeground(new Color(153, 180, 209));
		this.getContentPane().setLayout(null);

		JLabel lbLabel = new JLabel("   WELCOME TO THE STUDENTS INTERFACE");
		lbLabel.setBounds(188, 11, 1024, 35);
		lbLabel.setFont(new Font("MV Boli", Font.PLAIN,40));
		this.getContentPane().add(lbLabel);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(130,20, 800, 500);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\student.png"));
		this.getContentPane().add(lblNewLabel);

		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(472, 198, 800,800);
		this.getContentPane().add(horizontalBox);

		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(500, 500, 800, 800);
		this.getContentPane().add(horizontalGlue);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\red fleche.2.png"));
		lblNewLabel_1.setBounds(400, 115, 400, 350);
		this.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("  CONSULT TIMETABLE");
		lblNewLabel_3.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_3.setBounds(800, 100, 400,700);
		this.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\mati3.png"));
		lblNewLabel_4.setBounds(690, 80, 120, 120);
		this.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("  CONSULT COURSES");
		lblNewLabel_5.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_5.setBounds(800, 0, 400, 300);
		this.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\timetable2.png"));
		lblNewLabel_6.setBounds(700,300, 100, 320);
		this.getContentPane().add(lblNewLabel_6);
		
		
		

		JLabel lblNewLabel_7 = new JLabel("  CONSULT SCORES");
		lblNewLabel_7.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_7.setBounds(800,150, 400, 300);
	this.getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\note3.png"));
		lblNewLabel_2.setBounds(700,150, 400, 300);
	
		this.getContentPane().add(lblNewLabel_2);
		lblNewLabel_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			   public void mouseEntered(MouseEvent e) {
				   lblNewLabel_7.setBackground(Color.black);
				   lblNewLabel_7.setForeground(Color.white);
			    }

			    public void mouseExited(MouseEvent e) {
			    	lblNewLabel_7.setBackground(Color.white);
			    	lblNewLabel_7.setForeground(Color.black);
			    }
				
		    public void mouseClicked(MouseEvent e) {
		    	Addmarkspro Addmarkspro=new Addmarkspro(); 
		    	Addmarkspro.setVisible(true);
		     
		    }


		});
		
		
		this.setBounds(100, 100, 1024, 1024);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1024,1024);

	}




}



