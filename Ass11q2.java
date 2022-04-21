//Design an applet to display a coloured smiley.
import java.applet.Applet;
import java.awt.*;

public class As11_Q2 extends Applet{
 public void paint(Graphics g){
 g.setColor(Color.cyan);
 g.fillOval(50,50,200,200);
 g.setColor(Color.white);
g.fillOval(100,100,25,25);
 g.fillOval(170,100,25,25);
 g.setColor(Color.black);
g.fillOval(106,106,13,13);
 g.fillOval(176,106,13,13);
g.drawArc(100,100,100,100,210,120);
 }
}
/*
<applet code="As11_Q2.class" height=500 width=500>
</applet>
*/


