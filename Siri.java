import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class Siri extends JFrame {

	public Siri() {

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
   
    			}
		};
		setTitle("Siri Weather");
		this.getContentPane().add(p);
	}

	public static void main(String arg[]) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new Siri();
			}
		});
   }
   


}