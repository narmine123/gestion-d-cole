package student;

import java.awt.EventQueue;

import javax.swing.JFrame;

import accueil.Accueil;

public class Studentmain {
	public static void main(String[] args) {
		Student student = new Student();
		student.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		student.setVisible(true);
		
	}
}
