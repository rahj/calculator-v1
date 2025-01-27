/**
 * This is a simple calculator in Java
 *
 * September 21, 2020
 * by Reynaldo A. Hipolito
 */
import com.rahj.Calculator;
import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                displayGUI();
            }
        });
    }

    private static void displayGUI()
    {
        Calculator calc = new Calculator();
    }
}
