import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Demo extends Frame
{
	int x=0, y=0, z=0;
	Label red, blue, green, redInt, blueInt, greenInt;
	Scrollbar redScrollBar, blueScrollBar, greenScrollBar;
	Panel color;

	Demo()
	{
		

		setSize(600,600);
		setLocation(100,100);
		setLayout(null);

		red = new Label("  Red");
		blue = new Label("  Blue");
		green = new Label(" Green");
		redInt = new Label("0");
		blueInt = new Label("0");
		greenInt = new Label("0");
		redScrollBar = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		blueScrollBar = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		greenScrollBar = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		color = new Panel();

		red.setBounds(20,80,50,30);
		blue.setBounds(20,180,50,30);
		green.setBounds(20,280,50,30);
		redInt.setBounds(550,80,30,30);
		blueInt.setBounds(550,180,30,30);
		greenInt.setBounds(550,280,30,30);
		redScrollBar.setBounds(80,80,460,30);
		blueScrollBar.setBounds(80,180,460,30);
		greenScrollBar.setBounds(80,280,460,30);
		color.setBounds(200,400,200,100);

		red.setForeground(Color.RED);
		blue.setForeground(Color.BLUE);
		green.setForeground(Color.GREEN);
		redInt.setForeground(Color.RED);
		blueInt.setForeground(Color.BLUE);
		greenInt.setForeground(Color.GREEN);
		redScrollBar.setForeground(Color.RED);
		blueScrollBar.setForeground(Color.BLUE);
		greenScrollBar.setForeground(Color.GREEN);
		red.setBackground(Color.LIGHT_GRAY);
		blue.setBackground(Color.LIGHT_GRAY);
		green.setBackground(Color.LIGHT_GRAY);
		redInt.setBackground(Color.LIGHT_GRAY);
		blueInt.setBackground(Color.LIGHT_GRAY);
		greenInt.setBackground(Color.LIGHT_GRAY);
		
		add(red);
		add(blue);
		add(green);
		add(redInt);
		add(blueInt);
		add(greenInt);
		add(redScrollBar);
		add(blueScrollBar);
		add(greenScrollBar);
		add(color);

		redScrollBar.addAdjustmentListener(new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent e)
			{
				x = redScrollBar.getValue();
				redInt.setText(Integer.toString(x));
				Color c = new Color(x,y,z);
				color.setBackground(c);
			}
		});

		blueScrollBar.addAdjustmentListener(new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent e)
			{
				y = blueScrollBar.getValue();
				blueInt.setText(Integer.toString(y));
				Color c = new Color(x,y,z);
				color.setBackground(c);
			}
		});

		greenScrollBar.addAdjustmentListener(new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent e)
			{
				z = greenScrollBar.getValue();
				greenInt.setText(Integer.toString(z));
				Color c = new Color(x,y,z);
				color.setBackground(c);
			}
		});


		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Demo();	
	}

}