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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Recherchecourse extends JFrame {
	public static DefaultTableModel buildTableModel(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);

	}
	public Recherchecourse() throws SQLException {
		JFrame currentFrame=this;
		this.setResizable(true);
		this.setSize(540,540);
		ImageIcon image=new ImageIcon("C:\\Users\\USER\\Desktop\\admin\\logo.png");
		this.setIconImage(image.getImage());
		this.setTitle("SEARCH A COURSE");
		this.getContentPane().setBackground(new Color(139,170,218));
		this.setVisible(true);
		JLabel j1=new JLabel();
		j1.setText("       SEARCH A COURSE");
		j1.setFont(new Font( "MV Boli", Font.PLAIN,30));
		this.getContentPane().add(j1,BorderLayout.NORTH);

		JPanel cont=new JPanel();
		this.getContentPane().add(cont,BorderLayout.NORTH);
		//cont.setLayout(new GridLayout(5,4));
		cont.setBackground(new Color(139,170,218));
	

		
		
		JLabel lblNewLabel_2 = new JLabel("PROFESSOR ID  ");
		lblNewLabel_2.setFont(new Font("MV Boli", Font.PLAIN,30));
		lblNewLabel_2.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_2.setBounds(76, 11, 97, 33);
		JPanel id1=new JPanel();
		id1.add(lblNewLabel_2);
		JTextField textField1 = new JTextField();
		textField1.setBounds(76, 44, 160, 33);
		id1.add(textField1);
		textField1.setColumns(20);
		id1.setBackground(new Color(139,170,218));
		cont.add(id1);
		
		

		JButton button = new JButton("SEARCH");	
		button.setPreferredSize(new Dimension(10, 5));
		button.setSize(10, 5);
		button.setFont(new Font("MV Boli", Font.PLAIN, 15));	
		//JPanel v1=new JPanel();
		//v1.setBackground(new Color(139,170,218));
		//JLabel l1=new JLabel();
		//v1.add(l1);

		//v1.setLayout(new GridLayout(4,4));

		ResultSet  res = null ; 
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
		Statement stmt=con.createStatement();
		//System.out.println("inserting records");
		String sql ="select * from matiere  where id_prof=0";
		res = stmt.executeQuery(sql);
		}
		catch (Exception e) {
			System.out.println(e);
		}

		JTable table = new JTable(buildTableModel(res));
		Font font = new Font("Verdana", Font.PLAIN, 12);
		table.setFont(font);
		table.setRowHeight(70);
		//table.setForeground(new Color(139,170,218));
		table.setBackground(new Color(139,170,218));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(
		 JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getHorizontalScrollBar().setBackground(new Color(139,170,218));
		scrollPane.getVerticalScrollBar().setBackground(new Color(139,170,218));
		scrollPane.setBackground(new Color(139,170,218));
		JPanel v2=new JPanel();
		v2.setBackground(new Color(139,170,218));
		//v2.setBackground(new Color(139,170,218));
		v2.add(scrollPane);
		//JLabel l2=new JLabel();
		//v2.add(l2);
		//v1.add(v2);
		//cont.add();
		button.setPreferredSize(new Dimension(60, 20));
		currentFrame.getContentPane().setBackground(new Color(139,170,218));
		currentFrame.getContentPane().add(v2);
        currentFrame.getContentPane().add(button,BorderLayout.SOUTH);
        //currentFrame.pack();
		//JPanel v3=new JPanel();
		//v3.setBackground(new Color(139,170,218));
		//JLabel l3=new JLabel();
		//v3.add(l3);
		//v1.add(v3);

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

				ResultSet  res = null ; 
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
				Statement stmt=con.createStatement();
				//System.out.println("inserting records");
				String sql ="select * from matiere  where id_prof="+textField1.getText();
				res = stmt.executeQuery(sql);
				table.setModel(buildTableModel(res));
				}
				catch (Exception e) {
					System.out.println(e);
				}
				//int un=user.getText();
				//String pas=pass.getText();
				//if(un.equals("admin")&&pas.equals("0000")) {
				//MyFrame frame = new MyFrame ();
				//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				//frame.setVisible(true);
				//else {
				//JOptionPane.showMessageDialog(null,"Unvalide Username or Password");
				//System.exit(0);
				//}

			}
		});

		
		
		
		
		
	}
}

