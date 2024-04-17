package admin;

import java.awt.EventQueue;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.sql.*;

public class Addmatiere extends JFrame {


	public Addmatiere() {
		JFrame currentFrame=this;
		this.setResizable(true);
		this.setSize(540,540);
		ImageIcon image=new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\logo.png");
		this.setIconImage(image.getImage());
		this.setTitle("ADD SUBJECT");
		this.getContentPane().setBackground(new Color(139,170,218));
		this.setVisible(true);
		JLabel j1=new JLabel();
		j1.setText("              A D D  A  N E W  S U B J E C T");
		j1.setFont(new Font( "MV Boli", Font.PLAIN,20));
		this.getContentPane().add(j1,BorderLayout.NORTH);



		JPanel cont = new JPanel();
		cont.setLayout(new GridLayout(5,2));
		this.getContentPane().add(cont,BorderLayout.CENTER);
cont.setBackground(new Color(139,170,218));
		JPanel j2=new JPanel();
		j2.setLayout(new GridLayout(3,1));
		JLabel a2=new JLabel();
		ImageIcon m2 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\books.png");
		a2.setIcon(m2);
		j2.add(a2);
		JLabel a3=new JLabel();
		
		ImageIcon m3 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\tab.png");
		a3.setIcon(m3);

		j2.add(a3);
		
		j2.setBackground(new Color(139,170,218));
		this.getContentPane().add(j2,BorderLayout.WEST);

		JLabel lblNewLabel_1 = new JLabel("GROUP ID");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.PLAIN,15));
		lblNewLabel_1.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_1.setBounds(76, 11, 77, 33);
		JPanel nom=new JPanel();
		nom.add(lblNewLabel_1);
		JTextField textField = new JTextField();
		textField.setBounds(76, 44, 160, 33);
		nom.add(textField);
		textField.setColumns(15);
		nom.setBackground(new Color(139,170,218));
		cont.add(nom);






		JLabel lblNewLabel_3 = new JLabel("PROFESSOR ID");
		lblNewLabel_3.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_3.setFont(new Font("MV Boli", Font.PLAIN,15));
		lblNewLabel_3.setBounds(80, 102, 100, 22);
		JPanel coeff = new JPanel();
		coeff.add(lblNewLabel_3);
		coeff.setBackground(new Color(139,170,218));
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(76, 135, 160, 33);
		coeff.add(textField_2);
		textField_2.setColumns(10);
		cont.add(coeff);


	
		
		JLabel lblNewLabel_4 = new JLabel("SUBJECT NAME");
		lblNewLabel_4.setFont(new Font("MV Boli", Font.PLAIN,15));
		lblNewLabel_4.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_4.setBounds(389, 102, 110, 22);
		JPanel op= new JPanel();
		op.add(lblNewLabel_4);
		op.setBackground(new Color(139,170,218));
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(389, 135, 160, 33);
		textField_3.setColumns(10);
		op.add(textField_3);
cont.add(op);
		
		
		
JButton button = new JButton("VALIDATE ADD");	
button.addActionListener(new ActionListener() {
	   public void mouseEntered(MouseEvent e) {
	        button.setBackground(Color.black);
	        button.setForeground(Color.white);
	    }

	    public void mouseExited(MouseEvent e) {
	    	button.setBackground(Color.white);
	    	button.setForeground(Color.black);
	    }
		
	public void actionPerformed(ActionEvent arg0) {
	     //System.exit(0);
		ResultSet  res = null ; 
		Statement stmt = null ; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
			stmt=con.createStatement();
			System.out.println( );
			String sql ="insert into matiere values ('"+ textField.getText() + "'," + Integer.parseInt(textField_2.getText()) + " , '" + textField_3.getText() + "' )";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		currentFrame.setVisible(false); //you can't see me!
		currentFrame.dispose(); //Destroy the JFrame object
		//get text from user
		//get text from password 
	//	String un=user.getText();
		//String pas=pass.getText();
		//if(un.equals("admin")&&pas.equals("0000")) {
			//MyFrame frame = new MyFrame ();
			//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			//frame.setVisible(true);
		//else {
			//JOptionPane.showMessageDialog(null,"Unvalide Username or Password");
		//}


	}
});
button.setPreferredSize(new Dimension(40, 10));
button.setFont(new Font("MV Boli", Font.PLAIN, 15));
button.setBounds(325,86, 194, 25);
JPanel pan =new JPanel();
pan.setLayout(new GridLayout(1,3));
cont.add(pan);
JPanel v1=new JPanel();
v1.setBackground(new Color(139,170,218));
pan.add(v1);
pan.add(button);
JPanel v2=new JPanel();
v2.setBackground(new Color(139,170,218));
pan.add(v2);
pan.setBackground(new Color(139,170,218));






	}
	
}












