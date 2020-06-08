import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

class CoordinatesPanel extends JPanel

{

    private final int SIZE = 6; // diameter of dot

    private int x = 50, y = 50; // coordinates of mouse press
    
    private String msg = "";

    // -----------------------------------------------------------------

    // Constructor: Sets up this panel to listen for mouse events.

    // -----------------------------------------------------------------

    public CoordinatesPanel()

    {

        addMouseListener(new CoordinatesListener());

        setBackground(Color.black);

        setPreferredSize(new Dimension(300, 200));

    }

    // -----------------------------------------------------------------

    // Draws all of the dots stored in the list.

    // -----------------------------------------------------------------

    public void paintComponent(Graphics page)

    {

        super.paintComponent(page);

        page.setColor(Color.green);

        page.fillOval(x, y, SIZE, SIZE);

        page.drawString("Coordinates: (" + x + ", " + y + ")", 5, 15);
        page.drawString(msg, 5, 35);
    }

    // *****************************************************************

    // Represents the listener for mouse events.

    // *****************************************************************

    private class CoordinatesListener implements MouseListener

    {

        // --------------------------------------------------------------

        // Adds the current point to the list of points and redraws

        // the panel whenever the mouse button is pressed.

        // --------------------------------------------------------------

        public void mousePressed(MouseEvent event)

        {

            x = event.getX();

            y = event.getY();

            repaint();

        }

        // --------------------------------------------------------------

        // Provide empty definitions for unused event methods.

        // --------------------------------------------------------------

        public void mouseClicked(MouseEvent event) {
            msg = ("Mouse clicked");
            repaint();
        }

        public void mouseReleased(MouseEvent event) {
            msg = ("Mouse released");
            repaint();
        }

        public void mouseEntered(MouseEvent event) {
            msg = ("Mouse entered");
            repaint();
        }

        public void mouseExited(MouseEvent event) {
            msg = ("Mouse exited");
            repaint();
        }

    }

}