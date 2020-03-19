package presentation;

import javax.swing.JFrame;


public class TierheimFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	
	public TierheimFrame() {
		setLayout(null);
		setTitle("Tierheim");
		setBounds(0,0,800, 600);
	
		TierPanel panel = new TierPanel(150, 50, 350, 300);
		add(panel);
		
		setVisible(true);
		repaint();
	}
	
	
}
