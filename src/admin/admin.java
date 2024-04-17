package admin;

import java.awt.Color;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class admin {
	public static void main (String [] args) throws SQLException {
  /*JFrame frame=new JFrame();
  frame.setTitle("gestion_d'école");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setResizable(true);
  frame.setSize(420,420);
  frame.setVisible(true);
  ImageIcon image=new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\logo.png");
  frame.setIconImage(image.getImage());
  frame.getContentPane().setBackground(new Color(139,170,218));
		ImageIcon image1 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\teacher.png");
		JLabel label=new JLabel ();
		label.setText("TEACHERS SPACE");
		label.setIcon(image1);
		label.setHorizontalTextPosition(JLabel.LEFT);
		label.setVerticalTextPosition(JLabel.BOTTOM);*/
		MyFrame MyFrame=new MyFrame(); 
		MyFrame.setVisible(true);
		MyFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
}
}