import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

//DRAWS AN ALIEN FACE

public class FaceComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Casts the graphics screen as 2D, as it could handle 3D as well
        Graphics2D g2 = (Graphics2D) g;
        
        //Drawing the head
        Ellipse2D.Double head = new Ellipse2D.Double(5,10,100,150);
        g2.draw(head);
        
        //Draws the eyes
        g2.setColor(Color.GREEN);
        Rectangle eye = new Rectangle(25,70,15,15);
        g2.fill(eye);
        eye.translate(50,0);
        g2.fill(eye);
        
        //Draw the mouth
        Line2D.Double mouth = new Line2D.Double(30,100,80,100);
        g2.setColor(Color.RED);
        g2.draw(mouth);
        
        //Draws the greeting
        g2.setColor(Color.BLUE);
        g2.drawString("Hello World", 5, 175);
    }
}
