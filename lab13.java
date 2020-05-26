import java.awt.*;
import java.awt.event.*;
class lab13 extends Frame{
    lab13(String s){
        super(s);
    }
    public void paint(Graphics g){
        g.setFont(new Font("Zykov", Font.ITALIC | Font.BOLD, 30));
        g.drawString("Hello, my name is Vlad", 20, 100);
    }
    public static void main(String[] args){
        Frame f = new lab13("Здравствуй, меня зовут Влад");
        f.setSize(400, 150);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowciosing(WindowEvent ev){
                    System.exit(0);
            }
        });
    }
}