/* Design an applet with following components on it – Label, Textbox, Text area, Checkbox, Radio
button and Button.*/
import java.applet.*;
import java.awt.*;

public class As11_Q3 extends Applet {
 public void init(){
 Label l=new Label("This is Label");  
 add(l); 
 TextField t=new TextField("This is a TextBox");
 add(t);
 TextArea area=new TextArea("This is a Text Area");   
 add(area);
 Checkbox mycheckbox = new Checkbox("This is Checkbox");
 add(mycheckbox);
 CheckboxGroup cbg = new CheckboxGroup();
 Checkbox radiobutton = new Checkbox("This is Radio Button ", cbg, false);
 add(radiobutton);
 Button b=new Button("This is Button"); 
 add(b);
 }
}
/*
<applet code="As11_Q3.class" height=250 width=700>
</applet>
*/


