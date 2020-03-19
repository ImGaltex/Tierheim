package presentation;

import java.awt.Color;
import javax.swing.JPanel;

import business.TierDataManager;

public class TierPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	TierDataManager tiermanager;
	int x, y, width, height;
	
	public TierPanel(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		DataLabel data1 = new DataLabel(20, 20, 50, 20);
		DataLabel data2 = new DataLabel(80, 20, 50, 20);
		DataLabel data3 = new DataLabel(140, 20, 50, 20);
		DataLabel data4 = new DataLabel(200, 20, 50, 20);
		DataLabel data5 = new DataLabel(260, 20, 50, 20);
		DataLabel data6 = new DataLabel(20, 60, 50, 20);
		DataLabel data7 = new DataLabel(80, 60, 50, 20);
		DataLabel data8 = new DataLabel(140, 60, 50, 20);
		DataLabel data9 = new DataLabel(200, 60, 50, 20);
		DataLabel data10 = new DataLabel(260, 60, 50, 20);
		
		
		add(data1);
		add(data2);
		add(data3);
		add(data4);
		add(data5);
		add(data6);
		add(data7);
		add(data8);
		add(data9);
		add(data10);
		
		
		setLayout(null);
		setBounds(x, y, width, height);
		setBackground(new Color(255, 255,0));
	}
}

