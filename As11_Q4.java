/* Design an applet with one label, one text field and one button so that on clicking the button it
will check and display in the applet whether the value entered in the text field is even or odd or
blank.*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class As11_Q4 extends Applet implements ActionListener {
  TextField in, out;

  public void init() {
    Button compute = new Button("Compute");
    Label inp = new Label("Enter any number :", Label.RIGHT);
    Label opt = new Label("The Entered number is : ", Label.RIGHT);
    in = new TextField(5);
    out = new TextField(10);
    in.setBackground(Color.white);
    out.setBackground(Color.white);
    add(inp);
    add(in);
    add(opt);
    add(out);
    add(compute);
    out.setText("Blank");
    out.setEditable(false);
    in.addActionListener(this);
    out.addActionListener(this);
    compute.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    if (str.equals("Compute")) {
      if (in.getText() != null && !in.getText().isEmpty()) {
        int n = Integer.parseInt(in.getText());
        if (n % 2 == 0)
          out.setText("Even");
        else
          out.setText("Odd");
      } else
        out.setText("Blank");
    }
    repaint();
  }
}
/*
* <applet code="As11_Q4.class" height=100 width=300>
* </applet>
*/


