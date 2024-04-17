package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.sql.*;

public class Courses extends JPanel {

	/**
	 * Create the panel.
	 */
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
	public Courses() throws SQLException {
		BorderLayout bl2=new BorderLayout();
		bl2.setHgap(150);
		this.setLayout(bl2);
		this.setVisible(true);
		JPanel currentPanel=this;
this.setBackground(new Color(139,170,218));
JPanel pd2 = new JPanel();
ResultSet  res = null ; 
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
Statement stmt=con.createStatement();
System.out.println("inserting records");
String sql ="select * from matiere  ";
res = stmt.executeQuery(sql);


}
catch (Exception e) {
	System.out.println(e);
}


pd2.setLayout(new BorderLayout());
JTable table2 = new JTable(buildTableModel(res));
Font font = new Font("Verdana", Font.PLAIN, 12);
table2.setFont(font);
table2.setRowHeight(70);

pd2.setBackground(new Color(139,170,218));
//fixer la largeur de la première colonne à 200 pixels

TableColumn col1 = table2.getColumnModel().getColumn(0);
col1.setMaxWidth(250);

//fixer la largeur de la troisième colonne à 25 pixels


TableColumn col2 = table2.getColumnModel().getColumn(1);
col2.setMaxWidth(250);
JScrollPane scrollPane = new JScrollPane(table2);
scrollPane.setHorizontalScrollBarPolicy(
 JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
scrollPane.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
scrollPane.getHorizontalScrollBar().setBackground(new Color(139,170,218));
scrollPane.getVerticalScrollBar().setBackground(new Color(139,170,218));
pd2.add(scrollPane,BorderLayout.CENTER);
table2.setBackground(new Color(244,254,254));
this.add(pd2);

JPanel pg2 = new JPanel();
pg2.setLayout(new GridLayout(3,1));	
pg2.setBackground(new Color(139,170,218));
ImageIcon i7=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\addfile.png");
JLabel j7 = new JLabel();
j7.setText("ADD SUBJECT");
j7.setIcon(i7);
j7.setHorizontalTextPosition(JLabel.CENTER);
j7.setVerticalTextPosition(JLabel.BOTTOM);
pg2.add(j7);





j7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
j7.addMouseListener(new MouseAdapter() {
	   public void mouseEntered(MouseEvent e) {
	        j7.setBackground(Color.black);
	        j7.setForeground(Color.white);
	    }

	    public void mouseExited(MouseEvent e) {
	        j7.setBackground(Color.white);
	        j7.setForeground(Color.black);
	    }
		
    public void mouseClicked(MouseEvent e) {
    	Addmatiere Addmatiere=new Addmatiere(); 
    	Addmatiere.setVisible(true);
     
    }


});















ImageIcon i8=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\addition.png");
JLabel j8 = new JLabel();
j8.setText("EDIT SUBJECT");
j8.setIcon(i8);
j8.setHorizontalTextPosition(JLabel.CENTER);
j8.setVerticalTextPosition(JLabel.BOTTOM);
j8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
j8.addMouseListener(new MouseAdapter() {
	   public void mouseEntered(MouseEvent e) {
	        j8.setBackground(Color.black);
	        j8.setForeground(Color.white);
	    }

	    public void mouseExited(MouseEvent e) {
	        j8.setBackground(Color.white);
	        j8.setForeground(Color.black);
	    }
		
    public void mouseClicked(MouseEvent e) {
    	EditMat Editmat =new EditMat(); 
    	Editmat.setVisible(true);
     
    }


});

pg2.add(j8);


ImageIcon i9=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\trash.png");
JLabel j9 = new JLabel();
j9.setText("DELETE SUBJECT");
j9.setIcon(i9);
j9.setHorizontalTextPosition(JLabel.CENTER);
j9.setVerticalTextPosition(JLabel.BOTTOM);
pg2.add(j9);
j9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
j9.addMouseListener(new MouseAdapter() {
	   public void mouseEntered(MouseEvent e) {
	        j9.setBackground(Color.black);
	        j9.setForeground(Color.white);
	    }

	    public void mouseExited(MouseEvent e) {
	        j9.setBackground(Color.white);
	        j9.setForeground(Color.black);
	    }
		
    public void mouseClicked(MouseEvent e) {
    	Deletemat Deletemat=new Deletemat(); 
    	Deletemat.setVisible(true);
     
    }


});
JPanel rech=new JPanel();
JLabel imr=new JLabel();
ImageIcon ir=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\loupe.png");
imr.setIcon(ir);
rech.add(imr);
rech.setBackground(new Color(139,170,218));



imr.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
imr.addMouseListener(new MouseAdapter() {
	   public void mouseEntered(MouseEvent e) {
	        imr.setBackground(Color.black);
	        imr.setForeground(Color.white);
	    }

	    public void mouseExited(MouseEvent e) {
	        imr.setBackground(Color.white);
	        imr.setForeground(Color.black);
	    }
		
    public void mouseClicked(MouseEvent e) {
    	Recherchecourse Recherchecourse;
		try {
			Recherchecourse = new Recherchecourse();
			Recherchecourse.setVisible(true);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
    	
     
    }


});
this.add(rech,BorderLayout.EAST);
this.add(pg2,BorderLayout.WEST);
	}

}
