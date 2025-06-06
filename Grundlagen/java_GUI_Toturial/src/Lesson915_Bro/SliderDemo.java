package Lesson915_Bro;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


import javax.swing.JFrame;

public class SliderDemo implements ChangeListener{
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);			// set (min, max, start point) value
		
		slider.setPreferredSize(new Dimension(400, 200));
		slider.setPaintTicks(true);					
		slider.setMinorTickSpacing(10);				// add small Tick Spacing: how many knodges do we want
		
		slider.setPaintTrack(true);					
		slider.setMajorTickSpacing(25);				// add small Tick Spacing: how many knodges do we want
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		slider.setOrientation(SwingConstants.VERTICAL);			// make it vertical or horizontal
		
		label.setText("°C = " + slider.getValue());
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420, 420);
		frame.setVisible(true);
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		label.setText("°C = " + slider.getValue());
		
	}

}
