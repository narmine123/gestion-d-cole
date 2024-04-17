package accueil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.*;

public class Accueil extends JFrame {

	private JPanel contentPane;
	public Accueil() {
		JFrame currentFrame=this;
		JPanel cont= new JPanel();
		this.setResizable(true);
		this.setSize(1024,1024);
		ImageIcon image=new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\logo.png");
		this.setIconImage(image.getImage());
		this.setTitle("gestion_d'école");
		Panelogin login=new Panelogin();
		login.setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		cont.add(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(new Color(137, 207, 240));
		this.setContentPane(contentPane);
		JPanel pb=new JPanel();
		JLabel pbl=new JLabel();
		ImageIcon imball = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\ball.png");
		pbl.setIcon(imball);
		pb.add(pbl);
		pb.setBackground(new Color(137, 207, 240));
		pb.setVisible(true);
		contentPane.add(pb,BorderLayout.EAST);

		pb.setBounds(2000, 10, 250, 250);


		JPanel pd=new JPanel();
		JLabel pdl=new JLabel();
		ImageIcon edu = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\edu.png");
		pdl.setIcon(edu);
		pd.add(pdl);
		pd.setBackground(new Color(137, 207, 240));
		pd.setVisible(true);
		contentPane.add(pd,BorderLayout.WEST);

		pd.setBounds(20, 30, 250, 250);
		JPanel meduim = new JPanel();
		JLabel med= new JLabel();
		ImageIcon med1 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\school.png");
		med.setIcon(med1);
		med.setFont(new Font( "MV Boli", Font.PLAIN,35));
		med.setText("W E L C O M E  T O  O U R  S C H O O L");
		med.setHorizontalTextPosition(JLabel.CENTER);
		med.setVerticalTextPosition(JLabel.BOTTOM);
		meduim.add(med);
	

		meduim.setBackground(new Color(137, 207, 240));
		contentPane.add(meduim);
		JLabel med2=new JLabel();
		ImageIcon med3 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\login1.png");
		med2.setIcon(med3);
		med2.setFont(new Font( "MV Boli", Font.PLAIN,15));
		med2.setText("TAP TO CONTINUE");
		med2.setHorizontalTextPosition(JLabel.CENTER);
		med2.setVerticalTextPosition(JLabel.BOTTOM);
		med2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		med2.addMouseListener(new MouseAdapter() { 
		    public void mouseEntered(MouseEvent e) {
		        med2.setBackground(Color.black);
		        med2.setForeground(Color.white);
		    }

		    public void mouseExited(MouseEvent e) {
		        med2.setBackground(Color.white);
		        med2.setForeground(Color.black);
		    }
			
			public void mouseClicked(MouseEvent evt) {

				int width = med2.getWidth();
				int height = med2.getHeight();
				med2.setSize(width + 20, height + 5);
				login.setVisible(true);
				contentPane.setVisible(false);
				System.out.print("here");
				currentFrame.setContentPane(login);
			}

		});





		meduim.add(med2,BorderLayout.SOUTH);


	}

}
