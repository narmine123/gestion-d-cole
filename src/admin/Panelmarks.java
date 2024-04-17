package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Panelmarks extends JPanel {
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

		return new DefaultTableModel(data, columnNames);}
		public Panelmarks() throws SQLException {

			BorderLayout bl1=new BorderLayout();
			bl1.setHgap(150);
			this.setLayout(bl1);
			this.setVisible(true);
			this.setBackground(new Color(139,170,218));
			JPanel pd1 = new JPanel();
			ResultSet  res = null ; 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
				Statement stmt=con.createStatement();
				System.out.println("inserting records");
				String sql ="select * from note ";
				res = stmt.executeQuery(sql);


			}
			catch (Exception e) {
				System.out.println(e);
			}	


			pd1.setLayout(new BorderLayout());
			JTable table3 = new JTable(buildTableModel(res));
			Font font = new Font("Verdana", Font.PLAIN, 12);
			table3.setFont(font);
			table3.setRowHeight(70);

			pd1.setBackground(new Color(139,170,218));
			//fixer la largeur de la première colonne à 200 pixels

			TableColumn col1 = table3.getColumnModel().getColumn(0);
			col1.setMaxWidth(250);

			//fixer la largeur de la troisième colonne à 25 pixels


			TableColumn col2 = table3.getColumnModel().getColumn(1);
			col2.setMaxWidth(250);
			JScrollPane scrollPane = new JScrollPane(table3);
			scrollPane.setHorizontalScrollBarPolicy(
					JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scrollPane.setVerticalScrollBarPolicy(
					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.getHorizontalScrollBar().setBackground(new Color(139,170,218));
			scrollPane.getVerticalScrollBar().setBackground(new Color(139,170,218));
			pd1.add(scrollPane,BorderLayout.CENTER);
			table3.setBackground(new Color(244,254,254));
			this.add(pd1);


			pd1.setBackground(new Color(139,170,218));

			JPanel pg1 = new JPanel();
	
			pg1.setBackground(new Color(139,170,218));

			this.add(pg1,BorderLayout.WEST);
			ImageIcon i4=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\result.png");
			JLabel j4 = new JLabel();
			j4.setText("ADD MARKS");
			j4.setFont(new Font( "MV Boli", Font.PLAIN,25));
			j4.setIcon(i4);
			j4.setHorizontalTextPosition(JLabel.CENTER);
			j4.setVerticalTextPosition(JLabel.BOTTOM);
			j4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			j4.addMouseListener(new MouseAdapter() {
				   public void mouseEntered(MouseEvent e) {
				        j4.setBackground(Color.black);
				        j4.setForeground(Color.white);
				    }

				    public void mouseExited(MouseEvent e) {
				        j4.setBackground(Color.white);
				        j4.setForeground(Color.black);
				    }
					
			    public void mouseClicked(MouseEvent e) {
			    	Addmark Addmark=new Addmark(); 
			    	Addmark.setVisible(true);
			     
			    }


			});
			pg1.add(j4);


		}

	}
