/* Implement an applet which consists of two buttons named as RED and BLUE. When the user
clicks RED button, a message "you have passed RED" will be displayed in the applet window.
Similarly, when the user clicks BLUE button, a message "you have pressed BLUE" will be displayed in
the applet window.*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class As11_Q7 extends Applet implements ActionListener {
TextField output;
 Button Red, Blue;

public void init() {
Red = new Button("RED");
Blue = new Button("BLUE");
output = new TextField(20);
output.setBackground(Color.white);
add(output);
add(Red);
add(Blue);
output.setText("");
output.setEditable(false);
output.addActionListener(this);
Red.addActionListener(this);
Blue.addActionListener(this);
 }

public void actionPerformed(ActionEvent ae) {
String str = ae.getActionCommand();
if (str.equals("RED")) {
  output.setText("You have passed RED");
 } else {
  output.setText("You have pressed BLUE");
 }
 repaint();
 }
}
/*
 * <applet code="As11_Q7.class" height=100 width=250>
 * </applet>
 */

