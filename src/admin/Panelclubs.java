package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class Panelclubs extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panelclubs() {
		
this.setBackground(new Color(139,170,218));
JPanel cont = new JPanel();
this.add(cont);
GridLayout g=new GridLayout(2,3);
cont.setLayout(g);

cont.setBackground(new Color(139,170,218));
g.setHgap(50);

g.setVgap(50);;
JPanel first = new JPanel();
JLabel f=new JLabel();
f.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
f.setText("MANAGE THE PING PONG CLUB");
f.setHorizontalTextPosition(JLabel.CENTER);
f.setVerticalTextPosition(JLabel.BOTTOM);
ImageIcon p=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\ping.png");
f.setIcon(p);
first.add(f,BorderLayout.CENTER);
first.setBackground(new Color(139,170,218));

cont.add(first);






JPanel second = new JPanel();
JLabel s=new JLabel();
s.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
s.setText("MANAGE THE FOOTBALL CLUB");
s.setHorizontalTextPosition(JLabel.CENTER);
s.setVerticalTextPosition(JLabel.BOTTOM);
ImageIcon foot=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\foot.png");
s.setIcon(foot);
second.add(s,BorderLayout.CENTER);
second.setBackground(new Color(139,170,218));
cont.add(second);





JPanel third = new JPanel();
JLabel t=new JLabel();
t.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
t.setText("MANAGE THE BASKETBALL CLUB");
t.setHorizontalTextPosition(JLabel.CENTER);
t.setVerticalTextPosition(JLabel.BOTTOM);
ImageIcon basket=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\basketball.png");
t.setIcon(basket);
third.add(t,BorderLayout.CENTER);
third.setBackground(new Color(139,170,218));

cont.add(third);



JPanel four = new JPanel();
JLabel f4=new JLabel();
f4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
f4.setText("    MANAGE THE THEATRE CLUB    ");
f4.setHorizontalTextPosition(JLabel.CENTER);
f4.setVerticalTextPosition(JLabel.BOTTOM);
ImageIcon fo=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\theatr.png");
f4.setIcon(fo);
four.add(f4,BorderLayout.CENTER);
four.setBackground(new Color(139,170,218));

cont.add(four);

	
JPanel five = new JPanel();
JLabel f5=new JLabel();
f5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
f5.setText("    MANAGE THE MUSIC CLUB    ");
f5.setHorizontalTextPosition(JLabel.CENTER);
f5.setVerticalTextPosition(JLabel.BOTTOM);
ImageIcon fi=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\sing.png");
f5.setIcon(fi);
five.add(f5,BorderLayout.CENTER);
five.setBackground(new Color(139,170,218));

cont.add(five);




JPanel six = new JPanel();
JLabel f6=new JLabel();
f6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
f6.setText("    MANAGE THE SCIENCE CLUB    ");
f6.setHorizontalTextPosition(JLabel.CENTER);
f6.setVerticalTextPosition(JLabel.BOTTOM);
ImageIcon si=new ImageIcon ("C:\\Users\\USER\\Desktop\\admin\\science.png");
f6.setIcon(si);
six.add(f6,BorderLayout.CENTER);
six.setBackground(new Color(139,170,218));

cont.add(six);


		
	}

}
