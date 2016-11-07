import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class AllGraphics extends JPanel implements KeyListener {
	
	//int rect1y = 250

	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.fillRect(10, 300, 20, 100);
		g.setColor(new Color(57, 255, 20));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/*private Rectangle rectp1;
	private Rectangle rectp2;*/
	
/*	public void init(){
		this.addKeyListener(this);
		rectp1 = new Rectangle(0, 0, 30, 80);
		rectp2 = new Rectangle(100, 0, 30, 80);
	}
	
	public void paint(Graphics g){
		setSize(1000, 600);
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.fillRect(10, 300, 20, 80);
		
	}

	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_S){
			rectp1.setLocation(rectp1.x, rectp1.y + 5);
		}
		else if(e.getKeyCode() == KeyEvent.VK_W){
			rectp1.setLocation(rectp1.x, rectp1.y - 5);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			rectp2.setLocation(rectp2.x, rectp2.y + 5);
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP){
			rectp2.setLocation(rectp2.x, rectp2.y + 5);
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
		
		
	}*/
	
}

