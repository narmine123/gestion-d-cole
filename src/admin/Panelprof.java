package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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

public class Panelprof extends JPanel {
	
	
	
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
	public Panelprof()throws SQLException {
		BorderLayout bl=new BorderLayout();
		bl.setHgap(150);
		this.setLayout(bl);
		this.setVisible(true);
this.setBackground(new Color(139,170,218));
JPanel pd = new JPanel();



pd.setLayout(new BorderLayout());

ResultSet  res = null ; 
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root","root");
Statement stmt=con.createStatement();
System.out.println("inserting records");
String sql ="select * from professeur ";
res = stmt.executeQuery(sql);


}
catch (Exception e) {
	System.out.println(e);
}


pd.setBackground(new Color(139,170,218));
JTable table = new JTable(buildTableModel(res));
Font font = new Font("Verdana", Font.PLAIN, 12);
table.setFont(font);
table.setRowHeight(70);

pd.setBackground(new Color(139,170,218));
//fixer la largeur de la première colonne à 200 pixels

TableColumn col1 = table.getColumnModel().getColumn(0);
col1.setMaxWidth(250);

//fixer la largeur de la troisième colonne à 25 pixels


TableColumn col2 = table.getColumnModel().getColumn(1);
col2.setMaxWidth(250);
JScrollPane scrollPane = new JScrollPane(table);
scrollPane.setHorizontalScrollBarPolicy(
 JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
scrollPane.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
scrollPane.getHorizontalScrollBar().setBackground(new Color(139,170,218));
scrollPane.getVerticalScrollBar().setBackground(new Color(139,170,218));
pd.add(scrollPane,BorderLayout.CENTER);
table.setBackground(new Color(244,254,254));
this.add(pd);


JPanel pg1 = new JPanel();
pg1.setLayout(new GridLayout(3,1));
pg1.setBackground(new Color(139,170,218));

JPanel pg = new JPanel();
pg.setLayout(new GridLayout(3,1));
pg.setBackground(new Color(139,170,218));
ImageIcon i1=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\ad1.png");
JLabel j1 = new JLabel();
j1.setText("ADD PROFESSOR");
j1.setFont(new Font( "MV Boli", Font.PLAIN,25));
j1.setIcon(i1);
j1.setHorizontalTextPosition(JLabel.CENTER);
j1.setVerticalTextPosition(JLabel.BOTTOM);
j1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
j1.addMouseListener(new MouseAdapter() {
	   public void mouseEntered(MouseEvent e) {
	        j1.setBackground(Color.black);
	        j1.setForeground(Color.white);
	    }

	    public void mouseExited(MouseEvent e) {
	        j1.setBackground(Color.white);
	        j1.setForeground(Color.black);
	    }
		
    public void mouseClicked(MouseEvent e) {
    	Addpro Addpro=new Addpro(); 
    	Addpro.setVisible(true);
     
    }


});

pg.add(j1);




ImageIcon i2=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\edit.png");
JLabel j2 = new JLabel();
j2.setText("EDIT PROFESSOR");
j2.setFont(new Font( "MV Boli", Font.PLAIN,25));
j2.setIcon(i2);
j2.setHorizontalTextPosition(JLabel.CENTER);
j2.setVerticalTextPosition(JLabel.BOTTOM);

pg.add(j2);


ImageIcon i3=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\del.png");
JLabel j3 = new JLabel();
j3.setText("DELETE PROFESSOR");
j3.setIcon(i3);
j3.setFont(new Font( "MV Boli", Font.PLAIN,25));
j3.setHorizontalTextPosition(JLabel.CENTER);
j3.setVerticalTextPosition(JLabel.BOTTOM);
j3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
j3.addMouseListener(new MouseAdapter() {
	   public void mouseEntered(MouseEvent e) {
	        j3.setBackground(Color.black);
	        j3.setForeground(Color.white);
	    }

	    public void mouseExited(MouseEvent e) {
	        j3.setBackground(Color.white);
	        j3.setForeground(Color.black);
	    }
		
    public void mouseClicked(MouseEvent e) {
    	Deletepro Deletepro=new Deletepro(); 
    	Deletepro.setVisible(true);
     
    }


});
pg.add(j3);

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
    	Rechercheprof Rechercheprof=new Rechercheprof(); 
    	Rechercheprof.setVisible(true);
     
    }


});



this.add(rech,BorderLayout.EAST);
this.add(pg,BorderLayout.WEST);


	}

}
