import javax.swing.*;
import java.awt.event.*;

class calculator extends WindowAdapter implements ActionListener
{
    public JFrame mainframe;
    public Calculator(int width, int height, String title)
    {
        mainframe = new JFrame(title);
        mainframe.setSize(width,height)
        mainframe.setVisible(true);
    }

    public void windoeClosing(WindowEvent obj)
    {
        
    }
}
class MarvellousCalculator
{
public static void main(String arg[])
{
    calculator obj = new Calculator(400,400,"Marvellous Calculator")
}

}