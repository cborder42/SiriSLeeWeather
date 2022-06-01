import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.*;a
import javax.swing.*;

public class DrawShapes extends JFrame {

	public DrawShapes() {

		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel p = new JPanel() {
			public void paintComponent(Graphics g) {
				Graphics2D f = (Graphics2D) g;
				Shape rect = new Rectangle(75, 10, 350, 450);
				Shape circle = new Ellipse2D.Double(200, 325, 100, 100);
				Shape roundRect = new RoundRectangle2D.Double(100, 50, 300, 400, 30, 50);
				f.draw(rect);
				f.draw(circle);
				f.draw(roundRect);
            
            JFrame e = new JFrame("Siri Weather");
   //set size and location of frame
   e.setSize(390, 300);
   e.setLocation(100, 150);
   //make sure it quits when x is clicked
   e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   //set look and feel
   e.setDefaultLookAndFeelDecorated(true);
   JLabel label = new JLabel("Enter City");
   label.setBounds(50, 50, 200, 30);
   JTextField motto1 = new JTextField();
   //set size of the text box
   motto1.setBounds(50, 100, 200, 30);
   //add elements to the frame
   e.add(label);
   e.add(motto1);
   e.setLayout(null);
   e.setVisible(true);
   
   //add a button
JButton b = new JButton("Submit");
b.setBounds(50, 150, 100, 30);
//add button to the frame
e.add(b);
    			}
		};
		setTitle("Siri Weather");
		this.getContentPane().add(p);
	}

	public static void main(String arg[]) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new DrawShapes();
			}
		});
   }
   
   

}
