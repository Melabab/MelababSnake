import javax.swing.JFrame;

public class Window2 extends JFrame {
	public Window2()
	{
		AllGraphics a = new AllGraphics();
		this.add(a);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,600);
		this.setVisible(true);
		this.setTitle("Luke's Pong");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
}
