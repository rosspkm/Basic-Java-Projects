import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

class CoordinatesPanel extends JPanel{
	   private final int SIZE=6;
	   int x=50;
	   int y=50;
	   String currentMessage;
	   public CoordinatesPanel() {
	       addMouseListener(new CoordinatesListener());
	       setBackground(Color.black);
	       setPreferredSize(new Dimension(300,200));
	   }
	   public void paintComponent(Graphics page) {
	       super.paintComponent(page);
	       page.setColor(Color.green);
	       page.fillOval(x, y, SIZE, SIZE);
	       page.drawString("Coordinates: ("+ x+","+y+")",5,15);
	       page.drawString(currentMessage,30,30);
	      
	   }
	   private class CoordinatesListener implements MouseListener {

	       public CoordinatesListener() {
	       }

	       @Override
	       public void mouseClicked(MouseEvent aArg0) {
	           currentMessage="Mouse clicked";
	           repaint();
	       }

	       @Override
	       public void mouseEntered(MouseEvent aArg0) {
	           currentMessage="Mouse Entered";
	           repaint();

	       }

	       @Override
	       public void mouseExited(MouseEvent aArg0) {
	           currentMessage="Mouse Exited";
	           repaint();
	       }

	       @Override
	       public void mousePressed(MouseEvent event) {
	           x=event.getX();
	           y=event.getY();
	       }

	       @Override
	       public void mouseReleased(MouseEvent aArg0) {
	           currentMessage="Mouse Released";
	           repaint();

	       }

	   }

	}