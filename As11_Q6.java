/* Write a program in Java to design an applet with three text boxes - input1, input2, result and
two buttons - Add, Sub. On clicking of any of these buttons, the corresponding operation should be
performed with input1 and input2 and the result should be displayed in the result box.*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class As11_Q6 extends Applet implements ActionListener {
  TextField input1, input2, output;
  Button Add, Sub;

  public void init() {
    Add = new Button("ADD");
    Sub = new Button("SUB");
    Label inp1 = new Label("Enter 1st number :", Label.RIGHT);
    Label inp2 = new Label("Enter 2nd number :", Label.RIGHT);
    Label opt = new Label("The Result is : ", Label.RIGHT);
    input1 = new TextField(5);
    input2 = new TextField(5);
    output = new TextField(10);
    input1.setBackground(Color.white);
    input2.setBackground(Color.white);
    output.setBackground(Color.white);
    add(inp1);
    add(input1);
    add(inp2);
    add(input2);
    add(opt);
    add(output);
    add(Add);
    add(Sub);
    output.setText("0");
    output.setEditable(false);
    input1.addActionListener(this);
    input2.addActionListener(this);
    output.addActionListener(this);
    Add.addActionListener(this);
    Sub.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    if (str.equals("ADD")) {
      if (input1.getText() != null && !input1.getText().isEmpty()
          && input2.getText() != null && !input2.getText().isEmpty()) {
        int n1 = Integer.parseInt(input1.getText());
        int n2 = Integer.parseInt(input2.getText());
        int sum = n1 + n2;
        output.setText(String.valueOf(sum));
      } else {
        output.setText("0");
      }
    }
    if (str.equals("SUB")) {
      if (input1.getText() != null && !input1.getText().isEmpty()
          && input2.getText() != null && !input2.getText().isEmpty()) {
        int n1 = Integer.parseInt(input1.getText());
        int n2 = Integer.parseInt(input2.getText());
        int diff = n1 - n2;
        output.setText(String.valueOf(diff));
      } else {
        output.setText("0");
      }
    }
    repaint();
  }
}
/*
* <applet code="As11_Q6.class" height=100 width=450 >
* </applet>
*/

