package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	public MyFrame() throws SQLException{
		ImageIcon image1 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\t3.png");
		ImageIcon image2 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\red2.png");
		JPanel panel =new JPanel();
		panel.setLayout(new GridLayout(2,3));
		JLabel j1=new JLabel();


		j1.setText("              WELCOME TO THE ADMINISTRATIVE INTERFACE");
		j1.setVisible(true);
		j1.setFont(new Font( "MV Boli", Font.PLAIN,30));
		j1.setSize(700, 100);
		Panelprof prof=new Panelprof();
		Panelstudent stu=new Panelstudent();
		Courses cours=new Courses();
		Panelclubs club=new Panelclubs();
		Panelclass classe=new Panelclass();
		Panelmarks marks= new Panelmarks();
		prof.setVisible(false);
		stu.setVisible(false);
		cours.setVisible(false);
		club.setVisible(false);
		classe.setVisible(false);
		marks.setVisible(false);

		JPanel panel2= new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(j1,BorderLayout.CENTER);
		panel2.setBackground(new Color(139,170,218));
		ImageIcon r=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\back.png");
		JLabel r1= new JLabel();
		r1.setIcon(r);

		panel2.add(r1, BorderLayout.EAST);
		r1.setVisible(false);	

		r1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		r1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				r1.setBackground(Color.black);
				r1.setForeground(Color.white);
			}

			public void mouseExited(MouseEvent e) {
				r1.setBackground(Color.white);
				r1.setForeground(Color.black);
			}

			public void mouseClicked(MouseEvent e) {

				panel.setVisible(true);

				classe.setVisible(false);
				prof.setVisible(false);
				stu.setVisible(false);
				cours.setVisible(false);
				club.setVisible(false);
				marks.setVisible(false);
				r1.setVisible(false);
				j1.setText("          WELCOME TO THE ADMINISTRATIVE INTERFACE");

			}});








		JLabel label=new JLabel ();
		label.setText("TEACHERS SPACE");
		label.setFont(new Font( "MV Boli", Font.PLAIN,25));
		label.setIcon(image1);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setBackground(new Color (0,0,0));
		label.setOpaque(false);
		JFrame currentFrame=this;
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label.setBackground(Color.black);
				label.setForeground(Color.white);
			}

			public void mouseExited(MouseEvent e) {
				label.setBackground(Color.white);
				label.setForeground(Color.black);
			}

			public void mouseClicked(MouseEvent e) {

				panel.setVisible(false);
				currentFrame.add(prof);

				prof.setVisible(true);
				r1.setVisible(true);
				j1.setText("                T  E  A  C  H  E  R  S    L  I  S  T");
			}


		});

		JLabel label1=new JLabel ();

		label1.setText("STUDENTS SPACE");
		label1.setIcon(image2);
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.BOTTOM);
		label1.setForeground(new Color (0,0,0));
		label1.setFont(new Font( "MV Boli", Font.PLAIN,25));
		label1.setOpaque(false);

		label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label1.setBackground(Color.black);
				label1.setForeground(Color.white);
			}

			public void mouseExited(MouseEvent e) {
				label1.setBackground(Color.white);
				label1.setForeground(Color.black);
			}


			public void mouseClicked(MouseEvent e) {

				panel.setVisible(false);

				currentFrame.add(stu);
				stu.setVisible(true);
				r1.setVisible(true);
				j1.setText("                S  T  U  D  E  N  T  S    L  I  S  T");
			}


		});

		ImageIcon image3 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\classroom.png");

		JLabel label2=new JLabel ();
		label2.setText("CLASSES");
		label2.setIcon(image3);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		label2.setForeground(new Color (0,0,0));
		label2.setFont(new Font( "MV Boli", Font.PLAIN,25));

		label2.setOpaque(false);
		label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label2.setBackground(Color.black);
				label2.setForeground(Color.white);
			}

			public void mouseExited(MouseEvent e) {
				label2.setBackground(Color.white);
				label2.setForeground(Color.black);
			}


			public void mouseClicked(MouseEvent e) {

				panel.setVisible(false);

				currentFrame.add(classe);
				classe.setVisible(true);
				r1.setVisible(true);
				j1.setText("               C  L  A  S  S  E  S   M  A  N  A  G  M  E  N  T");
			}


		});




		ImageIcon image4 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\th.png");

		JLabel label3=new JLabel ();
		label3.setText("CLUBS");
		label3.setIcon(image4);
		label3.setHorizontalTextPosition(JLabel.CENTER);
		label3.setVerticalTextPosition(JLabel.BOTTOM);
		label3.setForeground(new Color (0,0,0));
		label3.setFont(new Font( "MV Boli", Font.PLAIN,25));
		label3.setOpaque(false);
		label3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label3.setBackground(Color.black);
				label3.setForeground(Color.white);
			}

			public void mouseExited(MouseEvent e) {
				label3.setBackground(Color.white);
				label3.setForeground(Color.black);
			}

			public void mouseClicked(MouseEvent e) {

				panel.setVisible(false);

				currentFrame.add(club);
				club.setVisible(true);
				r1.setVisible(true);
				j1.setText("                            C  L  U  B  S    L  I  S  T");
			}


		});









		ImageIcon image5 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\home.png");

		JLabel label4=new JLabel ();
		label4.setText("MARKS");
		label4.setIcon(image5);
		label4.setHorizontalTextPosition(JLabel.CENTER);
		label4.setVerticalTextPosition(JLabel.BOTTOM);
		label4.setForeground(new Color (0,0,0));
		label4.setFont(new Font( "MV Boli", Font.PLAIN,25));
		label4.setOpaque(false);
		label4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label4.setBackground(Color.black);
				label4.setForeground(Color.white);
			}

			public void mouseExited(MouseEvent e) {
				label4.setBackground(Color.white);
				label4.setForeground(Color.black);
			}

			public void mouseClicked(MouseEvent e) {

				panel.setVisible(false);

				currentFrame.add(marks);
				marks.setVisible(true);
				r1.setVisible(true);
				j1.setText("                      M A N A G E   M A R K S  ");
			}


		});



		ImageIcon image6 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\1.png");

		JLabel label5=new JLabel ();
		label5.setText("COURSES");
		label5.setIcon(image6);
		label5.setHorizontalTextPosition(JLabel.CENTER);
		label5.setVerticalTextPosition(JLabel.BOTTOM);
		label5.setForeground(new Color (0,0,0));
		label5.setFont(new Font( "MV Boli", Font.PLAIN,25));

		label5.setOpaque(false);



		this.add(panel2,BorderLayout.NORTH);
		label5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label5.setBackground(Color.black);
				label5.setForeground(Color.white);
			}

			public void mouseExited(MouseEvent e) {
				label5.setBackground(Color.white);
				label5.setForeground(Color.black);
			}

			public void mouseClicked(MouseEvent e) {

				panel.setVisible(false);

				currentFrame.add(cours);
				cours.setVisible(true);
				r1.setVisible(true);
				j1.setText("                S  U  B  J  E  C  T  S    L  I  S  T");
			}


		});

		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		this.add(panel,BorderLayout.CENTER);
		panel.setBackground(new Color(139,170,218));
		panel2.setBackground(new Color(139,170,218));
		this.setResizable(true);
		this.setSize(1024,1024);
		ImageIcon image=new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\logo.png");
		this.setIconImage(image.getImage());
		this.setTitle("gestion_d'école");

	}}
