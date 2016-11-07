import javax.swing.*; //for JFrame and J stuff
import java.awt.*; //for pictures
import java.awt.event.*; //for events

public class FirstGui extends JFrame implements KeyListener{
	
	private JButton button1;
	private JButton button2;
	
	public FirstGui(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 100);
		this.setVisible(true);
		this.setTitle("This works!");
		this.setResizable(false);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
		
		button1 = new JButton("Play");
		add(button1);
		
		button2 = new JButton("Options");
		add(button2);
		
		//Event listener below
		event e = new event();
		button1.addActionListener(e);
	}
	
	
	//This class is for event listener
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Window2 w2 = new Window2();
		}
	}
	

	/*This below makes a window*/

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
}
