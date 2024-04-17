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

public class Deletestu extends JFrame {

	private JPanel contentPane;

	public Deletestu() {
		JFrame currentFrame=this;
		this.setResizable(true);
		this.setSize(740,540);
		ImageIcon image=new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\logo.png");
		this.setIconImage(image.getImage());
		this.setTitle("DELETE A STUDENT");
		this.getContentPane().setBackground(new Color(139,170,218));
		this.setVisible(true);
		JLabel j1=new JLabel();
		j1.setText(" DELETE AN EXISTANT STUDENT");
		j1.setFont(new Font( "MV Boli", Font.PLAIN,40));
		this.getContentPane().add(j1,BorderLayout.NORTH);

		JPanel cont=new JPanel();
		cont.setLayout(new GridLayout(5,4));
		cont.setBackground(new Color(139,170,218));
		JPanel v1=new JPanel();
		v1.setBackground(new Color(139,170,218));
		cont.add(v1);
		JLabel lblNewLabel_1 = new JLabel("STUDENT ID");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_1.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_1.setBounds(76, 50, 80, 33);
		JPanel nom=new JPanel();
		nom.add(lblNewLabel_1);
		JTextField textField = new JTextField();
		textField.setBounds(76, 44, 160, 33);
		nom.add(textField);
		textField.setColumns(20);
		nom.setBackground(new Color(139,170,218));
		cont.add(nom);

		
JButton button = new JButton("VALIDATE SUPPRESSION") ;
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
	   //  System.exit(0);
		ResultSet  res = null ; 
		Statement stmt = null ; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
			stmt=con.createStatement();
			System.out.println( );
			String sql ="delete from etudiant where id_etudiant = " + textField.getText()  ;
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
button.setFont(new Font("MV Boli", Font.PLAIN, 15));
//button.setBounds(225,86, 50, 25);
/*JPanel cont1=new JPanel();
cont1.setBackground(new Color(139,170,218));
cont1.setLayout(new GridLayout(3,12));
JPanel v3=new JPanel();
v3.setBackground(new Color(139,170,218));
cont1.add(v3);
JPanel v4=new JPanel();
v4.setBackground(new Color(139,170,218));
cont1.add(v4);


cont.add(cont1);*/


//cont.add(button);
cont.setPreferredSize(new Dimension(40, 40));
this.getContentPane().add(cont,BorderLayout.CENTER);

JPanel imp=new JPanel();
JLabel iml=new JLabel();


ImageIcon m3 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\ex.png");
iml.setIcon(m3);
imp.add(iml);
imp.setBackground(new Color(139,170,218));
button.setPreferredSize(new Dimension(50, 50));
this.getContentPane().add(button,BorderLayout.SOUTH);

this.getContentPane().add(imp,BorderLayout.EAST);
	}

}
