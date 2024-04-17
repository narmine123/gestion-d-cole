package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panelclass extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panelclass() {
		BorderLayout bl=new BorderLayout();
		bl.setHgap(150);
		this.setLayout(bl);
		this.setVisible(true);
		this.setBackground(new Color(139,170,218));
		JPanel contenair=new JPanel();
		contenair.setLayout(new GridLayout(5,1));
		contenair.setBackground(new Color(139,170,218));
		this.add(contenair);


		JPanel imp=new JPanel();
		ImageIcon im2 = new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\absence.png");
		JLabel lab=new JLabel ();
		lab.setIcon(im2);
		imp.add(lab);
		imp.setVisible(true);
		imp.setBackground(new Color(139,170,218));
		contenair.add(imp);



		JPanel name=new JPanel();
		name.setBackground(new Color(139, 170, 218));
		JLabel namelabel = new JLabel("C L A S S  N U M      ");
		namelabel.setBounds(325, 123, 194, 20);
		namelabel.setLabelFor(namelabel);
		namelabel.setFont(new Font("MV Boli", Font.PLAIN, 30));
		name.add(namelabel);
		JTextField classe = new JTextField();
		classe.setBounds(325,250, 194, 20);
		name.add(classe);
		classe.setColumns(25);
		contenair.add(name);

		
		
		
		
		JPanel day=new JPanel();
		day.setBackground(new Color(139,170,218));
		JLabel daylabel = new JLabel("D A Y       ");
		daylabel.setBounds(325, 123, 194, 20);

		daylabel.setLabelFor(daylabel);
		daylabel.setFont(new Font("MV Boli", Font.PLAIN, 30));
		day.add(daylabel);
		JTextField dayt = new JTextField();
		dayt.setBounds(325, 123, 194, 20);
		day.add(dayt);
		dayt.setColumns(25);
		contenair.add(day);

		JPanel num=new JPanel();
		num.setBackground(new Color(139, 170, 218));
		JLabel numlabel = new JLabel("S E S S I O N   N U M      ");
		numlabel.setBounds(325, 123, 194, 20);
		numlabel.setLabelFor(numlabel);
		numlabel.setFont(new Font("MV Boli", Font.PLAIN, 30));
		num.add(numlabel);
		JTextField numseance = new JTextField();
		numseance.setBounds(325,250, 194, 20);
		num.add(numseance);
		numseance.setColumns(25);
		contenair.add(num);		
		
		JButton button = new JButton("VERIFY");
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
				boolean isTooken = false ; 
				ResultSet resToken = null ; 
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
					Statement stmt=con.createStatement();
					String sql ="select * from seance where num_salle =" +classe.getText()+" and day_seance='"+dayt.getText()+"' and num_seance =" +numseance.getText();

					//Object list [];
					//Panelprof.setTeacherList(list) ; 
					resToken = stmt.executeQuery(sql);
					isTooken = resToken.next();
				}
					catch (Exception e) {
						System.out.println(e);
					}
				
				if(isTooken) {
					JOptionPane.showMessageDialog(null,"THE CLASS IS TOOKEN");
				
				}else {
					JOptionPane.showMessageDialog(null,"THE CLASS IS AVAILABLE");
				}

			}
		});
		
		
		
		button.setPreferredSize(new Dimension(50, 20));
		button.setFont(new Font("MV Boli", Font.PLAIN, 20));
		button.setBounds(325,86, 194, 25);
		JPanel j=new JPanel();
		j.setBackground(new Color(139,170,218));
		j.setLayout(new GridLayout(2,5));
		
		contenair.add(j);
		
		JPanel v3=new JPanel();
		v3.setBackground(new Color(139,170,218));
		j.add(v3);
		
		JPanel v4=new JPanel();
		v4.setBackground(new Color(139,170,218));
		j.add(v4);
		
		j.add(button);
		
		
		JPanel v5=new JPanel();
		v5.setBackground(new Color(139,170,218));
		j.add(v5);
		
		JPanel v6=new JPanel();
		v6.setBackground(new Color(139,170,218));
		j.add(v6);
		
		JPanel v7=new JPanel();
		v7.setBackground(new Color(139,170,218));
		j.add(v7);
		JPanel v8=new JPanel();
		v8.setBackground(new Color(139,170,218));
		j.add(v8);
		
		JPanel v9=new JPanel();
		v9.setBackground(new Color(139,170,218));
		j.add(v9);
		JPanel v10=new JPanel();
		v10.setBackground(new Color(139,170,218));
		j.add(v10);
		
		
		
		
		
		

	}

}
