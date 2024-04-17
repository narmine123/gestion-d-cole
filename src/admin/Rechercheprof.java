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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Rechercheprof extends JFrame {


	public Rechercheprof() {
		JFrame currentFrame=this;
		this.setResizable(true);
		this.setSize(540,540);
		ImageIcon image=new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\logo.png");
		this.setIconImage(image.getImage());
		this.setTitle("SEARCH A TEACHER");
		this.getContentPane().setBackground(new Color(139,170,218));
		this.setVisible(true);
		JLabel j1=new JLabel();
		j1.setText("S E A R C H  A  T E A C H E R ");
		j1.setFont(new Font( "MV Boli", Font.PLAIN,30));
		this.getContentPane().add(j1,BorderLayout.NORTH);
		
		JPanel cont=new JPanel();
		this.getContentPane().add(cont,BorderLayout.CENTER);
	cont.setLayout(new GridLayout(3,1));
		cont.setBackground(new Color(139,170,218));
	
		JLabel lblNewLabel_1 = new JLabel("TEACHER ID");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_1.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_1.setBounds(76, 11, 97, 33);
		JPanel id=new JPanel();
		id.add(lblNewLabel_1);
		JTextField textField = new JTextField();
		textField.setBounds(76, 44, 160, 33);
		id.add(textField);
		textField.setColumns(20);
		id.setBackground(new Color(139,170,218));
		cont.add(id);

		
JButton button = new JButton("SEARCH");	
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
	    
		
		//int un=user.getText();
		//String pas=pass.getText();
		//if(un.equals("admin")&&pas.equals("0000")) {
			//MyFrame frame = new MyFrame ();
			//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			//frame.setVisible(true);
		//else {
			//JOptionPane.showMessageDialog(null,"Unvalide Username or Password");
		 System.exit(0);
		//}

	}
});
button.setPreferredSize(new Dimension(10, 5));
button.setSize(10, 5);
button.setFont(new Font("MV Boli", Font.PLAIN, 15));	

JPanel v1=new JPanel();
v1.setBackground(new Color(139,170,218));
JLabel l1=new JLabel();
v1.add(l1);

v1.setLayout(new GridLayout(7,4));




JPanel v2=new JPanel();
v2.setBackground(new Color(139,170,218));
JLabel l2=new JLabel();
v2.add(l2);
v1.add(v2);
cont.add(v1);
v1.add(button);

JPanel v3=new JPanel();
v3.setBackground(new Color(139,170,218));
JLabel l3=new JLabel();
v3.add(l3);
v1.add(v3);

JPanel v=new JPanel();
v.setBackground(new Color(139,170,218));
JLabel l=new JLabel();
v.add(l);
cont.add(v,BorderLayout.CENTER);
	}

}
