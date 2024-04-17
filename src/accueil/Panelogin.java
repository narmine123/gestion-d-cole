package accueil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import admin.MyFrame;
import professor.*;
import student.*;

public class Panelogin extends JPanel {
	public Panelogin() {
		BorderLayout bl=new BorderLayout();
		//bl.setHgap(150);
		this.setLayout(bl);
		this.setVisible(true);

		//JPanel panel_1 = new JPanel();
		//panel_1.setBackground(SystemColor.textHighlight);
		//.add(panel_1, BorderLayout.WEST);
		//panel_1.setLayout(null);

		JPanel panel = new JPanel();
		panel.setVisible(true);
		this.add(panel);
		BorderLayout btext = new BorderLayout();
		panel.setLayout(btext);
		JLabel ltext = new JLabel();
		ltext.setText("L O G I N  F O R M");
		JPanel ptext=new JPanel();
		ptext.setBackground(new Color(137, 207, 240));

		ptext.add(ltext);
		panel.add(ptext,BorderLayout.NORTH);
		ltext.setFont(new Font("MV Boli", Font.PLAIN, 40));
		JLabel licon = new JLabel();
		JPanel picon = new JPanel();
		picon.add(licon);
		licon.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\login3.png"));
		picon.setBackground(new Color(137, 207, 240));
		panel.add(picon,BorderLayout.WEST);

		

		JLabel licon1 = new JLabel();
		JPanel picon1 = new JPanel();
		picon1.add(licon1);
		licon1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\pencil.png"));
		picon1.setBackground(new Color(137, 207, 240));
		panel.add(picon1,BorderLayout.EAST);
		
		
		JLabel licon3 = new JLabel();
		JPanel picon3 = new JPanel();
		picon3.add(licon3);
		licon3.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\globe.png"));
		picon3.setBackground(new Color(137, 207, 240));
		panel.add(picon3,BorderLayout.SOUTH);
		
		
		

		panel.setBackground(new Color(137, 207, 240));
		panel.setVisible(true);
		this.setBackground(new Color(137, 207, 240));

		JPanel cont=new JPanel();
		cont.setBackground(new Color(137, 207, 240));
		cont.setLayout(new GridLayout(5,1));
		panel.add(cont,BorderLayout.CENTER);

JPanel v1=new JPanel();
v1.setBackground(new Color(137, 207, 240));
cont.add(v1);


		/*JPanel name=new JPanel();
		name.setBackground(new Color(137, 207, 240));
		JLabel namelabel = new JLabel("U S E R   I D       ");
		namelabel.setBounds(325, 123, 194, 20);
		//namelabel.setHorizontalAlignment(SwingConstants.LEFT);
		namelabel.setLabelFor(namelabel);
		//namelabel.setVerticalAlignment(SwingConstants.BOTTOM);
		namelabel.setFont(new Font("MV Boli", Font.PLAIN, 30));
		name.add(namelabel);
	
		cont.add(name);
		cont.setVisible(true);

		JTextField user = new JTextField();
		user.setBounds(325, 123, 194, 20);
	name.add(user);
		user.setColumns(35);*/
		

		
		JPanel v2=new JPanel();
		v2.setBackground(new Color(137, 207, 240));
		cont.add(v2);	
		
		JPanel mdp =new JPanel();
		mdp.setBackground(new Color(137, 207, 240));
		JLabel mdplabel = new JLabel("U S E R  I D  ");
		mdp.add(mdplabel);
		mdplabel.setFont(new Font("MV Boli", Font.PLAIN, 30));
		mdplabel.setBounds(325, 186, 194, 25);

		JPasswordField pass = new JPasswordField();
		pass.setFont(new Font("MV Boli", Font.PLAIN, 15));
		pass.setForeground(new Color(0, 0, 0));
		pass.setColumns(17);
		pass.setBounds(325, 186, 194, 25);
		mdp.add(pass);
		cont.add(mdp);	
		JPanel v11=new JPanel();
		v11.setBackground(new Color(137, 207, 240));
		cont.add(v11);
		JButton button = new JButton("S I G N  I N");
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
				//get text from user
				//get text from password 
				//String un=user.getText();
				boolean isProf = false ; 
				boolean isEtud = false ; 
				ResultSet resprof = null ; 
				ResultSet resetudiant = null ; 
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
					Statement stmtp=con.createStatement();
					Statement stmte=con.createStatement();
					String sqletudiant ="select * from etudiant where id_etudiant ="+pass.getText();
					String sqlprof ="select * from professeur where id_prof =" +pass.getText();

					//Object list [];
					//Panelprof.setTeacherList(list) ; 
					resprof = stmtp.executeQuery(sqlprof);
					resetudiant = stmte.executeQuery(sqletudiant);
					isProf = resprof.next();
					isEtud = resetudiant.next();
				}
					catch (Exception e) {
						System.out.println(e);
					}
				String pas=pass.getText();
				if(pas.equals("000")) {
					MyFrame frame = null;
					try {
						frame = new MyFrame ();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					frame.setVisible(true);
				} 
				else if (isProf)
				{
					Professor profpage=new Professor(); 
					profpage.setVisible(true);
					profpage.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				else if (isEtud)
				{
					Student student = new Student();
					student.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					student.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"UNVALIDE USER ID");
				}

			}
		});
		button.setPreferredSize(new Dimension(50, 100));
		button.setFont(new Font("MV Boli", Font.PLAIN, 20));
		button.setBounds(325,86, 194, 55);
		JPanel j=new JPanel();
		j.setBackground(new Color(137, 207, 240));
		j.setLayout(new GridLayout(2,5));
		
		cont.add(j);
		
		JPanel v3=new JPanel();
		v3.setBackground(new Color(137, 207, 240));
		j.add(v3);
		
		JPanel v4=new JPanel();
		v4.setBackground(new Color(137, 207, 240));
		j.add(v4);
		
		j.add(button);
		
		
		JPanel v5=new JPanel();
		v5.setBackground(new Color(137, 207, 240));
		j.add(v5);
		
		JPanel v6=new JPanel();
		v6.setBackground(new Color(137, 207, 240));
		j.add(v6);
		
		JPanel v7=new JPanel();
		v7.setBackground(new Color(137, 207, 240));
		j.add(v7);
		JPanel v8=new JPanel();
		v8.setBackground(new Color(137, 207, 240));
		j.add(v8);
		
		JPanel v9=new JPanel();
		v9.setBackground(new Color(137, 207, 240));
		j.add(v9);
		JPanel v10=new JPanel();
		v10.setBackground(new Color(137, 207, 240));
		j.add(v10);
		
		
		
		
		//panel_1.setBackground(new Color(137, 207, 240));
		/*


JPanel name=new JPanel();
name.setBackground(new Color(137, 207, 240));
JLabel namelabel = new JLabel("USER ID");
namelabel.setBounds(325, 122, 94, 19);
namelabel.setHorizontalAlignment(SwingConstants.LEFT);
namelabel.setLabelFor(namelabel);
namelabel.setVerticalAlignment(SwingConstants.BOTTOM);
namelabel.setFont(new Font("Tahoma", Font.BOLD, 15));
name.add(namelabel);
panel.add(name);
panel.setVisible(true);

JTextField user = new JTextField();
user.setBounds(429, 123, 194, 20);
name.add(user);
user.setColumns(10);
JPanel mdp =new JPanel();
JLabel mdplabel = new JLabel("P A S S W O R D ");
mdp.add(mdplabel);
mdplabel.setFont(new Font("Tahoma", Font.BOLD, 20));
mdplabel.setBounds(325, 186, 94, 17);

JPasswordField pass = new JPasswordField();
pass.setFont(new Font("Tahoma", Font.BOLD, 20));
pass.setForeground(new Color(0, 0, 0));
pass.setColumns(10);
pass.setBounds(429, 184, 194, 20);
mdp.add(pass);
panel.add(mdp);
JButton button = new JButton("S I G N  I N");
button.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		//get text from user
		//get text from password 
		String un=user.getText();
		String pas=pass.getText();
		if(un.equals("admin")&&pas.equals("1234")) {
			MyFrame frame = new MyFrame ();
			frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			frame.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null,"Unvalide Username or Password");
		}

	}
});
button.setFont(new Font("Tahoma", Font.BOLD, 20));
button.setBounds(260, 305, 177, 37);
panel.add(button);



JLabel lab = new JLabel(" L O G I N ");
lab.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
lab.setBounds(267, 23, 66, 37);
panel.add(lab,BorderLayout.NORTH);
JPanel img=new JPanel();
JLabel label = new JLabel();
img.add(label);
label.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\login2.png"));
label.setBounds(0, 71, 315, 241);
panel.add(img,BorderLayout.WEST);
img.setBackground(new Color(137, 207, 240));
this.setBackground(new Color(137, 207, 240));
this.setBounds(100, 100, 650, 412);
		 */



	}}


