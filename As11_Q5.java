/*Write an applet that places a rectangle, a rounded rectangle,
a 3D rectangle and fill rectangle of random sizes and colours 
inside the applet’s visible area.*/
import java.applet.Applet;
import java.awt.*;

public class As11_Q5 extends Applet{
  public void paint(Graphics g){
    g.drawRect(50,10,70,30);
    g.setColor(Color.green);
    g.fillRect(50,50,200,100);
    g.setColor(Color.red);
    g.fillRect(70,70,160,60);
    g.setColor(Color.yellow);
    g.fillRect(90,90,120,20);
    g.setColor(Color.black);
    g.drawRoundRect(50,200,100,50,15,15);
    g.setColor(Color.cyan);
    g.fill3DRect(50,300,100,50,true);
  }
}
/*
<applet code="As11_Q5.class" height=500 width=500>
</applet>
*/


