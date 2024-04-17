package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Addmark extends JFrame {

	private JPanel contentPane;
	public Addmark() {
		JFrame currentFrame=this;
		this.setResizable(true);
		this.setSize(740,540);
		ImageIcon image=new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\logo.png");
		this.setIconImage(image.getImage());
		this.setTitle("    ADD MARKS");
		this.getContentPane().setBackground(new Color(139,170,218));
		this.setVisible(true);
		JLabel j1=new JLabel();
		j1.setText("    ADD A NEW MARK");
		j1.setFont(new Font( "MV Boli", Font.PLAIN,40));
		this.getContentPane().add(j1,BorderLayout.NORTH);

		JPanel cont=new JPanel();
		cont.setLayout(new GridLayout(5,4));
		cont.setBackground(new Color(139,170,218));
		JPanel v1=new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT ID");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_1.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_1.setBounds(76, 11, 77, 33);
		JPanel nom=new JPanel();
		nom.add(lblNewLabel_1);
		JTextField textField = new JTextField();
		textField.setBounds(76, 44, 160, 33);
		nom.add(textField);
		textField.setColumns(20);
		nom.setBackground(new Color(139,170,218));
		cont.add(nom);
		
		JLabel lblNewLabel_2 = new JLabel("GROUP ID");
		lblNewLabel_2.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_2.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_2.setBounds(76, 11, 77, 33);
		JPanel nom1=new JPanel();
		nom1.add(lblNewLabel_2);
		JTextField textField1 = new JTextField();
		textField1.setBounds(76, 44, 160, 33);
		nom1.add(textField1);
		textField1.setColumns(20);
		nom1.setBackground(new Color(139,170,218));
		cont.add(nom1);
		
		
		JLabel lblNewLabel_3 = new JLabel("PROFESSOR ID");
		lblNewLabel_3.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_3.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_3.setBounds(76, 11, 77, 33);
		JPanel nom2=new JPanel();
		nom2.add(lblNewLabel_3);
		JTextField textField2 = new JTextField();
		textField2.setBounds(76, 44, 160, 33);
		nom2.add(textField2);
		textField2.setColumns(20);
		nom2.setBackground(new Color(139,170,218));
		cont.add(nom2);
		
		
		JLabel lblNewLabel_4 = new JLabel("MARK VALUE");
		lblNewLabel_4.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_4.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_4.setBounds(76, 11, 77, 33);
		JPanel nom3=new JPanel();
		nom3.add(lblNewLabel_4);
		JTextField textField3 = new JTextField();
		textField3.setBounds(76, 44, 160, 33);
		nom3.add(textField3);
		textField3.setColumns(20);
		nom3.setBackground(new Color(139,170,218));
		cont.add(nom3);
		
	
		
		
		
		

		
JButton button = new JButton("VALIDATE ") ;
        button.addActionListener(new ActionListener() {
	   public void mouseEntered(MouseEvent e) {
	        button.setBackground(Color.black);
	        button.setForeground(Color.white);
	    }

	    public void mouseExited(MouseEvent e) {
	    	button.setBackground(Color.white);
	    	button.setForeground(Color.black);
	    }
		
	/**
	 *
	 */
	public void actionPerformed(ActionEvent arg0) {
	     	//System.exit(0);
			ResultSet  res = null ; 
			Statement stmt = null ; 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
				stmt=con.createStatement();
				System.out.println( );
				String sql ="insert into note values ("+ textField.getText() + ",'" + textField1.getText() + "' , '" + textField2.getText() + "' , " + textField3.getText() + " )";
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


	}
});
        button.setPreferredSize(new Dimension(50, 50));
        this.getContentPane().add(button,BorderLayout.SOUTH);
button.setFont(new Font("MV Boli", Font.PLAIN, 15));
cont.setPreferredSize(new Dimension(40, 40));
this.getContentPane().add(cont,BorderLayout.CENTER);
	}

}
