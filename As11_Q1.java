/*Design an applet to display the user information such as Roll No., Name, Branch and Section in
separate lines.*/
import java.applet.Applet;
import java.awt.*;

public class As11_Q1 extends Applet{
 public void paint(Graphics g){
 g.drawString("Roll - 2005585",50,50);
 g.drawString("Name - Kunal Patel",50,75);
 g.drawString("Branch - CSE",50,100);
 g.drawString("Section - CSE2",50,125);

}
}

/*
<applet code="As11_Q1.class" height=500 width=500>
</applet>
*/



