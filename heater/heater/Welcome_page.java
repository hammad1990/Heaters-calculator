package heater;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome_page {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void welc() {
		JFrame frame = new JFrame();
    	frame.setSize(671, 498);
    	frame.setLocation(200, 100);
    	frame.getContentPane().setLayout(null);
    	frame.setVisible(true);
    	
    	
    	JLabel lblElectricHeatersCapacities = new JLabel("Electric heaters capacities identifier");
    	lblElectricHeatersCapacities.setForeground(Color.BLUE);
    	lblElectricHeatersCapacities.setFont(new Font("Tahoma", Font.BOLD, 16));
    	lblElectricHeatersCapacities.setBounds(166, 80, 353, 134);
    	frame.getContentPane().add(lblElectricHeatersCapacities);
    	
    	JButton btnStart = new JButton("Start");
    	btnStart.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			if(btnStart.isEnabled()) {
    				frame.setVisible(false);
    				code cd=new code();
    				cd.code();
    				
    			
    			
    			}
    		
    			
    		}
    	});
    	btnStart.setBounds(266, 307, 89, 23);
    	frame.getContentPane().add(btnStart);

    }

   
		
		
	}