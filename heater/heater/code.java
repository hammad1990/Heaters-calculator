package heater;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Spring;


public class code {
	
	//JFrame frame;
	private static JTextField txtKW;
	private static JTextField txtstage10;
	private static JTextField txtstage11;
	private static JTextField txtstage20;
	private static JTextField txtstage21;
	private static JTextField txtstage30;
	private static JTextField txtstage31;
	private static JTextField txtstage40;
	private static JTextField txtstage41;
	private static JTextField txtstage50;
	private static JTextField txtstage51;
	private static JTextField txtstage60;
	private static JTextField txtstage61;
	private static JTextField txttotalKW;
	public static int volt;
	public static String stages;
	public static double eh=0;
	public static double eh1=0;
	public static double eh2=0;
	public static double eh3=0;
	public static double eh4=0;
	public static  double eh5=0;
	public static  double eh6=0;
	public static double eht,ehn;
	 @SuppressWarnings("rawtypes")
	static String [] stagess= {"0","1","2","3","4","5","6"};
	 public static JTextField txtmaxheater;
	 public static JTextField txtsumstage1;
	 public  static JTextField txtsumstages2;
	 public  static JTextField txtsumstages3;
	 public static  JTextField txtsumstages4;
	 public static JTextField txtsumstages5;
	 public static JTextField txtsumstages6;
	 public  double [] v1= {0,1,1.5,2,2.5,3,4,5,6};
	 public double [] v2= {0,1,2,3,4,5,6};
	 public  static JTextField txttitle;
	/**
	 * @wbp.parser.entryPoint
	 */
	
	 
	/**
	 * @wbp.parser.entryPoint
	 */
	public void code() {
		
		double []st1= {0,0};
		double []st2= {0,0};
		double []st3= {0,0};
		double []st4= {0,0};
		double []st5= {0,0};
		double []st6= {0,0};
		
///////////////////jframe workkk////////////////
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(671, 498);
		frame.setLocation(200, 100);
		frame.setVisible(true);
			
		 
		
		
		JRadioButton radio230 = new JRadioButton("208/230/380/400/415");
		radio230.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radio230.isSelected()) {
					volt=230;
					
				}
			
			}
		});
		radio230.setBounds(28, 59, 145, 24);
		frame.getContentPane().add(radio230);
		
		JRadioButton radio270 = new JRadioButton("440/460/480");
		radio270.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio270.isSelected()) {
					volt=270;
				
				}
			}
		});
		radio270.setBounds(28, 98, 121, 24);
		frame.getContentPane().add(radio270);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(radio230);
		bg.add(radio270);
		
		JLabel lblVolt = new JLabel("Select Volt:");
		lblVolt.setFont(new Font("Dialog", Font.BOLD, 14));
		lblVolt.setForeground(Color.BLACK);
		lblVolt.setBackground(Color.WHITE);
		lblVolt.setBounds(12, 35, 80, 16);
		frame.getContentPane().add(lblVolt);
		
		JLabel lblStages = new JLabel("Select No. of Stages:");
		lblStages.setForeground(Color.BLACK);
		lblStages.setFont(new Font("Dialog", Font.BOLD, 14));
		lblStages.setBackground(Color.WHITE);
		lblStages.setBounds(12, 159, 161, 16);
		frame.getContentPane().add(lblStages);
		
		@SuppressWarnings("rawtypes")
		JComboBox combostages = new JComboBox(stagess);
		combostages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stages=(String)combostages.getSelectedItem();
			}
		});
		combostages.setBounds(12, 187, 59, 25);
		frame.getContentPane().add(combostages);
		
		JLabel lblHeatersKw = new JLabel("Enter Heaters Capacity (MAX 216KW)");
		lblHeatersKw.setForeground(Color.BLACK);
		lblHeatersKw.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHeatersKw.setBackground(Color.WHITE);
		lblHeatersKw.setBounds(12, 273, 263, 60);
		frame.getContentPane().add(lblHeatersKw);
		
		txtKW = new JTextField();
		txtKW.setBounds(22, 328, 86, 24);
		frame.getContentPane().add(txtKW);
		txtKW.setColumns(10);
		
		JLabel lblStage = new JLabel("STAGE 1");
		lblStage.setBounds(362, 63, 55, 16);
		frame.getContentPane().add(lblStage);
		
		txtstage10 = new JTextField();
		txtstage10.setForeground(Color.BLACK);
		txtstage10.setEditable(false);
		txtstage10.setBounds(427, 59, 37, 22);
		frame.getContentPane().add(txtstage10);
		txtstage10.setColumns(10);
		
		JLabel label = new JLabel("  +");
		label.setBounds(474, 63, 27, 20);
		frame.getContentPane().add(label);
		
		txtstage11 = new JTextField();
		txtstage11.setForeground(Color.BLACK);
		txtstage11.setEditable(false);
		txtstage11.setColumns(10);
		txtstage11.setBounds(511, 59, 37, 22);
		frame.getContentPane().add(txtstage11);
		
		JLabel lblStage_1 = new JLabel("STAGE 2");
		lblStage_1.setBounds(362, 102, 55, 16);
		frame.getContentPane().add(lblStage_1);
		
		txtstage20 = new JTextField();
		txtstage20.setForeground(Color.BLACK);
		txtstage20.setEditable(false);
		txtstage20.setColumns(10);
		txtstage20.setBounds(427, 98, 37, 22);
		frame.getContentPane().add(txtstage20);
		
		JLabel label_2 = new JLabel("  +");
		label_2.setBounds(474, 98, 27, 20);
		frame.getContentPane().add(label_2);
		
		txtstage21 = new JTextField();
		txtstage21.setForeground(Color.BLACK);
		txtstage21.setEditable(false);
		txtstage21.setColumns(10);
		txtstage21.setBounds(511, 98, 37, 22);
		frame.getContentPane().add(txtstage21);
		
		JLabel lblStage_2 = new JLabel("STAGE 3");
		lblStage_2.setBounds(362, 140, 55, 16);
		frame.getContentPane().add(lblStage_2);
		
		txtstage30 = new JTextField();
		txtstage30.setForeground(Color.BLACK);
		txtstage30.setEditable(false);
		txtstage30.setColumns(10);
		txtstage30.setBounds(427, 137, 37, 22);
		frame.getContentPane().add(txtstage30);
		
		JLabel label_4 = new JLabel("  +");
		label_4.setBounds(474, 132, 27, 20);
		frame.getContentPane().add(label_4);
		
		txtstage31 = new JTextField();
		txtstage31.setForeground(Color.BLACK);
		txtstage31.setEditable(false);
		txtstage31.setColumns(10);
		txtstage31.setBounds(511, 137, 37, 22);
		frame.getContentPane().add(txtstage31);
		
		JLabel lblStage_3 = new JLabel("STAGE 4");
		lblStage_3.setBounds(362, 177, 55, 16);
		frame.getContentPane().add(lblStage_3);
		
		txtstage40 = new JTextField();
		txtstage40.setForeground(Color.BLACK);
		txtstage40.setEditable(false);
		txtstage40.setColumns(10);
		txtstage40.setBounds(427, 174, 37, 22);
		frame.getContentPane().add(txtstage40);
		
		JLabel label_3 = new JLabel("  +");
		label_3.setBounds(474, 172, 27, 20);
		frame.getContentPane().add(label_3);
		
		txtstage41 = new JTextField();
		txtstage41.setForeground(Color.BLACK);
		txtstage41.setEditable(false);
		txtstage41.setColumns(10);
		txtstage41.setBounds(511, 174, 37, 22);
		frame.getContentPane().add(txtstage41);
		
		JLabel lblStage_4 = new JLabel("STAGE 5");
		lblStage_4.setBounds(362, 216, 55, 16);
		frame.getContentPane().add(lblStage_4);
		
		txtstage50 = new JTextField();
		txtstage50.setForeground(Color.BLACK);
		txtstage50.setEditable(false);
		txtstage50.setColumns(10);
		txtstage50.setBounds(427, 213, 37, 22);
		frame.getContentPane().add(txtstage50);
		
		JLabel label_6 = new JLabel("  +");
		label_6.setBounds(474, 207, 27, 20);
		frame.getContentPane().add(label_6);
		
		txtstage51 = new JTextField();
		txtstage51.setForeground(Color.BLACK);
		txtstage51.setEditable(false);
		txtstage51.setColumns(10);
		txtstage51.setBounds(511, 211, 37, 22);
		frame.getContentPane().add(txtstage51);
		
		JLabel lblStage_5 = new JLabel("STAGE 6");
		lblStage_5.setBounds(362, 259, 55, 16);
		frame.getContentPane().add(lblStage_5);
		
		txtstage60 = new JTextField();
		txtstage60.setForeground(Color.BLACK);
		txtstage60.setEditable(false);
		txtstage60.setColumns(10);
		txtstage60.setBounds(427, 256, 37, 22);
		frame.getContentPane().add(txtstage60);
		
		txttitle = new JTextField();
		txttitle.setForeground(Color.BLACK);
		txttitle.setBounds(160, 11, 263, 20);
		frame.getContentPane().add(txttitle);
		txttitle.setColumns(10);
		
		JLabel lblProjectName = new JLabel("Project name");
		lblProjectName.setForeground(Color.BLACK);
		lblProjectName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblProjectName.setBackground(Color.BLACK);
		lblProjectName.setBounds(57, 14, 116, 16);
		frame.getContentPane().add(lblProjectName);
		frame.setVisible(true);

		JLabel label_8 = new JLabel("  +");
		label_8.setBounds(474, 248, 27, 20);
		frame.getContentPane().add(label_8);
		
		txtstage61 = new JTextField();
		txtstage61.setForeground(Color.BLACK);
		txtstage61.setEditable(false);
		txtstage61.setColumns(10);
		txtstage61.setBounds(511, 256, 37, 22);
		frame.getContentPane().add(txtstage61);
		
		JLabel lblTotalKw = new JLabel("Applicable Heater");
		lblTotalKw.setForeground(Color.BLACK);
		lblTotalKw.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalKw.setBackground(Color.WHITE);
		lblTotalKw.setBounds(342, 313, 114, 28);
		frame.getContentPane().add(lblTotalKw);
		
		txttotalKW = new JTextField();
		txttotalKW.setForeground(Color.BLACK);
		txttotalKW.setEditable(false);
		txttotalKW.setColumns(10);
		txttotalKW.setBounds(474, 315, 105, 25);
		frame.getContentPane().add(txttotalKW);
		
		JLabel lblDesignedByEngmhammad = new JLabel("Designed by Eng.M.hammad");
		lblDesignedByEngmhammad.setFont(new Font("Dialog", Font.BOLD, 9));
		lblDesignedByEngmhammad.setBounds(508, 394, 135, 37);
		frame.getContentPane().add(lblDesignedByEngmhammad);
		
		
		/////start run////////////////////
		
		JButton btnRUN = new JButton("RUN");
		btnRUN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				eh=Double.parseDouble(txtKW.getText());	
				eht=Math.round(eh);
				if (eh>eht) {
					eht+=0.5;
				}
				

				switch (stages) {
				case "1":
					eh1=eht;
					txtmaxheater.setText("max 36kw");
					
					break;
				case "2":
					eh1=eht/2;
					eh1=Math.round(eh1);
					//eh2=eh1;
					txtmaxheater.setText("max 72kw");
					
					break;
				case "3":
					eh1=eh/3;
					eh1=Math.round(eh1);
					eh2=eh1;
					txtmaxheater.setText("max 108kw");
					
					break;
				case "4":
					eh1=eh/4;
					eh1=Math.round(eh1);
					eh2=eh1;
					eh3=eh1;
					txtmaxheater.setText("max 144kw");
					
					break;	
				case "5":
					eh1=eh/5;
					eh1=Math.round(eh1);
					eh2=eh1;
					eh3=eh1;
					eh4=eh1;
					txtmaxheater.setText("max 180kw");
					
					break;
				case "6":
					eh1=eh/6;
					eh1=Math.round(eh1);
					eh2=eh1;
					eh3=eh1;
					eh4=eh1;
					eh5=eh1;
					txtmaxheater.setText("max 216kw");
					
					break;
				}
				
				
				
				////////////// START 1 stage//////////
				if (stages.equals("1")&&volt==230) {
					if (eh<=36) {
						
					
					while (st1[0]==0&&st1[1]==0) {
					 for (int i = 0; i < v1.length; i++) {
					  for (int j = 0; j < v1.length; j++) {

					  		if ((v1[j]+v1[i])*3==eh1) {
					  		st1[0]=v1[i];
					  		st1[1]=v1[j];
					  		i=v1.length;
					  		j=v1.length;

					  		}
					  		}
					}
					if (st1[0]==0&&st1[1]==0) {
						eh1+=0.5;
					} 
				}
					
				}
					else {
						txtmaxheater.setText("max 36kw");
					}
				}
				////////////// end 1 stage//////////
				
				////////////// START 2 stage//////////
				
				if (stages.equals("2")&&volt==230) {
					if (eh<=72) {
						
					
					while (st1[0]==0&&st1[1]==0) {
					 for (int i = 0; i < v1.length; i++) {
					  for (int j = 0; j < v1.length; j++) {

					  		if ((v1[j]+v1[i])*3==eh1) {
					  		st1[0]=v1[i];
					  		st1[1]=v1[j];
					  		i=v1.length;
					  		j=v1.length;
					  		}
					  		}
					}
					if (st1[0]==0&&st1[1]==0) {
						eh1+=0.5;
					} 
				}
					
					eh2=eht-eh1;
					while (st2[0]==0&&st2[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh2) {
						  		st2[0]=v1[i];
						  		st2[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st2[0]==0&&st2[1]==0) {
							eh2+=0.5;
						} 
					}
					
				}
					else {
						txtmaxheater.setText("max 72kw");
						
					}
					
				}
				
				////////////// END 2 stage//////////
				
		//////////////START 3 stage//////////
				
				if (stages.equals("3")&&volt==230) {
					
					if (eh<=108) {
						
					
					while (st1[0]==0&&st1[1]==0) {
					 for (int i = 0; i < v1.length; i++) {
					  for (int j = 0; j < v1.length; j++) {

					  		if ((v1[j]+v1[i])*3==eh1) {
					  		st1[0]=v1[i];
					  		st1[1]=v1[j];
					  		i=v1.length;
					  		j=v1.length;
					  		}
					  		}
					}
					if (st1[0]==0&&st1[1]==0) {
						eh1+=0.5;
					} 
				}
					
					
					while (st2[0]==0&&st2[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh2) {
						  		st2[0]=v1[i];
						  		st2[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st2[0]==0&&st2[1]==0) {
							eh2+=0.5;
						} 
					}
					eh3=eht-(eh1+eh2);
					

					while (st3[0]==0&&st3[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh3) {
						  		st3[0]=v1[i];
						  		st3[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st3[0]==0&&st3[1]==0) {
							eh3+=0.5;
						} 
					}
					}
					else {
						txtmaxheater.setText("max 108kw");
						
					}
				}
				
				
				
		//////////////end 3 stage//////////
				
		//////////////START 4 stage//////////
				
				if (stages.equals("4")&&volt==230) {
					if (eh<=144) {
						
					
					while (st1[0]==0&&st1[1]==0) {
					 for (int i = 0; i < v1.length; i++) {
					  for (int j = 0; j < v1.length; j++) {

					  		if ((v1[j]+v1[i])*3==eh1) {
					  		st1[0]=v1[i];
					  		st1[1]=v1[j];
					  		i=v1.length;
					  		j=v1.length;
					  		}
					  		}
					}
					if (st1[0]==0&&st1[1]==0) {
						eh1+=0.5;
					} 
				}
					
					
					while (st2[0]==0&&st2[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh2) {
						  		st2[0]=v1[i];
						  		st2[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st2[0]==0&&st2[1]==0) {
							eh2+=0.5;
						} 
					}
					
					
					

					while (st3[0]==0&&st3[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh3) {
						  		st3[0]=v1[i];
						  		st3[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st3[0]==0&&st3[1]==0) {
							eh3+=0.5;
						} 
					}
					
					eh4=eht-(eh1+eh2+eh3);
					while (st4[0]==0&&st4[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh4) {
						  		st4[0]=v1[i];
						  		st4[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st4[0]==0&&st4[1]==0) {
							eh4+=0.5;
						} 
					}
					}
					else {
						txtmaxheater.setText("max 144kw");
					}
				}
				
				
		//////////////end 4 stage//////////
		//////////////start 5 stage//////////
				if (stages.equals("5")&&volt==230) {
					if (eh<180) {
						
					
					while (st1[0]==0&&st1[1]==0) {
					 for (int i = 0; i < v1.length; i++) {
					  for (int j = 0; j < v1.length; j++) {

					  		if ((v1[j]+v1[i])*3==eh1) {
					  		st1[0]=v1[i];
					  		st1[1]=v1[j];
					  		i=v1.length;
					  		j=v1.length;
					  		}
					  		}
					}
					if (st1[0]==0&&st1[1]==0) {
						eh1+=0.5;
					} 
				}
					
					
					while (st2[0]==0&&st2[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh2) {
						  		st2[0]=v1[i];
						  		st2[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st2[0]==0&&st2[1]==0) {
							eh2+=0.5;
						} 
					}
					
					

					while (st3[0]==0&&st3[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh3) {
						  		st3[0]=v1[i];
						  		st3[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st3[0]==0&&st3[1]==0) {
							eh3+=0.5;
						} 
					}
					
					
					while (st4[0]==0&&st4[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh4) {
						  		st4[0]=v1[i];
						  		st4[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st4[0]==0&&st4[1]==0) {
							eh4+=0.5;
						} 
					}
					
					eh5=eht-(eh1+eh2+eh3+eh3);
					
					while (st5[0]==0&&st5[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh5) {
						  		st5[0]=v1[i];
						  		st5[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st5[0]==0&&st5[1]==0) {
							eh5+=0.5;
						} 
					}
					}
					else {
						txtmaxheater.setText("max 180kw");
					}
				}
					
		////////////end 5 stage//////////	
					
		//////////////start 6 stage//////////
					
					if (stages.equals("6")&&volt==230) {
						if (eh<=216) {
							
						
						while (st1[0]==0&&st1[1]==0) {
						 for (int i = 0; i < v1.length; i++) {
						  for (int j = 0; j < v1.length; j++) {

						  		if ((v1[j]+v1[i])*3==eh1) {
						  		st1[0]=v1[i];
						  		st1[1]=v1[j];
						  		i=v1.length;
						  		j=v1.length;
						  		}
						  		}
						}
						if (st1[0]==0&&st1[1]==0) {
							eh1+=0.5;
						} 
					}
						
						
						while (st2[0]==0&&st2[1]==0) {
							 for (int i = 0; i < v1.length; i++) {
							  for (int j = 0; j < v1.length; j++) {

							  		if ((v1[j]+v1[i])*3==eh2) {
							  		st2[0]=v1[i];
							  		st2[1]=v1[j];
							  		i=v1.length;
							  		j=v1.length;
							  		}
							  		}
							}
							if (st2[0]==0&&st2[1]==0) {
								eh2+=0.5;
							} 
						}
						
						

						while (st3[0]==0&&st3[1]==0) {
							 for (int i = 0; i < v1.length; i++) {
							  for (int j = 0; j < v1.length; j++) {

							  		if ((v1[j]+v1[i])*3==eh3) {
							  		st3[0]=v1[i];
							  		st3[1]=v1[j];
							  		i=v1.length;
							  		j=v1.length;
							  		}
							  		}
							}
							if (st3[0]==0&&st3[1]==0) {
								eh3+=0.5;
							} 
						}
						
						
						while (st4[0]==0&&st4[1]==0) {
							 for (int i = 0; i < v1.length; i++) {
							  for (int j = 0; j < v1.length; j++) {

							  		if ((v1[j]+v1[i])*3==eh4) {
							  		st4[0]=v1[i];
							  		st4[1]=v1[j];
							  		i=v1.length;
							  		j=v1.length;
							  		}
							  		}
							}
							if (st4[0]==0&&st4[1]==0) {
								eh4+=0.5;
							} 
						}
						
						
						
						while (st5[0]==0&&st5[1]==0) {
							 for (int i = 0; i < v1.length; i++) {
							  for (int j = 0; j < v1.length; j++) {

							  		if ((v1[j]+v1[i])*3==eh5) {
							  		st5[0]=v1[i];
							  		st5[1]=v1[j];
							  		i=v1.length;
							  		j=v1.length;
							  		}
							  		}
							}
							if (st5[0]==0&&st5[1]==0) {
								eh5+=0.5;
							} 
						}
						
						eh6=eht-(eh1+eh2+eh3+eh4+eh5);
						while (st6[0]==0&&st6[1]==0) {
							 for (int i = 0; i < v1.length; i++) {
							  for (int j = 0; j < v1.length; j++) {

							  		if ((v1[j]+v1[i])*3==eh6) {
							  		st6[0]=v1[i];
							  		st6[1]=v1[j];
							  		i=v1.length;
							  		j=v1.length;
							  		}
							  		}
							}
							if (st6[0]==0&&st6[1]==0) {
								eh6+=0.5;
							} 
						}
						}
						else {
							txtmaxheater.setText("max 216kw");
						}
					}
						
		////////////end 6 stage//////////
		////////////// START 1/270 stage//////////
					if (stages.equals("1")&&volt==270) {
						if (eh<=36) {
							
						
						while (st1[0]==0&&st1[1]==0) {
						 for (int i = 0; i < v2.length; i++) {
						  for (int j = 0; j < v2.length; j++) {

						  		if ((v2[j]+v2[i])*3==eh1) {
						  		st1[0]=v2[i];
						  		st1[1]=v2[j];
						  		i=v2.length;
						  		j=v2.length;
						  		}
						  		}
						}
						if (st1[0]==0&&st1[1]==0) {
							eh1+=0.5;
						} 
					}
						}
						else {
							txtmaxheater.setText("max 36kw");
						}
					}
					////////////// end 1 stage//////////
					
					////////////// START 2/270 stage//////////
					
					if (stages.equals("2")&&volt==270) {
						if (eh<=72) {
							
						
						while (st1[0]==0&&st1[1]==0) {
						 for (int i = 0; i < v2.length; i++) {
						  for (int j = 0; j < v2.length; j++) {

						  		if ((v2[j]+v2[i])*3==eh1) {
						  		st1[0]=v2[i];
						  		st1[1]=v2[j];
						  		i=v2.length;
						  		j=v2.length;
						  		}
						  		}
						}
						if (st1[0]==0&&st1[1]==0) {
							eh1+=0.5;
						} 
						
					}
						
						eh2=eht-eh1;
						while (st2[0]==0&&st2[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh2) {
							  		st2[0]=v2[i];
							  		st2[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st2[0]==0&&st2[1]==0) {
								eh2+=0.5;
							} 
						}
						}
						else {
							txtmaxheater.setText("max 72kw");
						}
						
					}
					
					////////////// END 2/270 stage//////////
					
			//////////////START 3/270 stage//////////
					
					if (stages.equals("3")&&volt==270) {
						if (eh<=108) {
							
						
						while (st1[0]==0&&st1[1]==0) {
						 for (int i = 0; i < v2.length; i++) {
						  for (int j = 0; j < v2.length; j++) {

						  		if ((v2[j]+v2[i])*3==eh1) {
						  		st1[0]=v2[i];
						  		st1[1]=v2[j];
						  		i=v2.length;
						  		j=v2.length;
						  		}
						  		}
						}
						if (st1[0]==0&&st1[1]==0) {
							eh1+=0.5;
						} 
					}
						
						ehn=eht-eh1;
						eh2=ehn/2;
						eh2=Math.round(eh2);
						while (st2[0]==0&&st2[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh2) {
							  		st2[0]=v2[i];
							  		st2[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st2[0]==0&&st2[1]==0) {
								eh2+=0.5;
							} 
						}
						eh3=eht-(eh1+eh2);
						

						while (st3[0]==0&&st3[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh3) {
							  		st3[0]=v2[i];
							  		st3[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st3[0]==0&&st3[1]==0) {
								eh3+=0.5;
							} 
						}
						}
						else {
							txtmaxheater.setText("max 108kw");
						}
					}
					
					
					
			//////////////end 3/270 stage//////////
					
			//////////////START 4/270 stage//////////
					
					if (stages.equals("4")&&volt==270) {
                         if (eh<=144) {
	

						while (st1[0]==0&&st1[1]==0) {
						 for (int i = 0; i < v2.length; i++) {
						  for (int j = 0; j < v2.length; j++) {

						  		if ((v2[j]+v2[i])*3==eh1) {
						  		st1[0]=v2[i];
						  		st1[1]=v2[j];
						  		i=v2.length;
						  		j=v2.length;
						  		}
						  		}
						}
						if (st1[0]==0&&st1[1]==0) {
							eh1+=0.5;
						} 
					}
						/*ehn=eht-eh1;
						eh2=ehn/3;
						eh3=ehn/3;
						eh2=Math.round(eh2);
						eh3=Math.round(eh3);*/
						
						while (st2[0]==0&&st2[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh2) {
							  		st2[0]=v2[i];
							  		st2[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st2[0]==0&&st2[1]==0) {
								eh2+=0.5;
							} 
						}
						
						
						

						while (st3[0]==0&&st3[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh3) {
							  		st3[0]=v2[i];
							  		st3[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st3[0]==0&&st3[1]==0) {
								eh3+=0.5;
							} 
						}
						
						eh4=eht-(eh1+eh2+eh3);
						while (st4[0]==0&&st4[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh4) {
							  		st4[0]=v2[i];
							  		st4[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st4[0]==0&&st4[1]==0) {
								eh4+=0.5;
							} 
						}
                         }
                         else {
                        	 txtmaxheater.setText("max 144kw");
                         }
					}
					
					
			//////////////end 4/270 stage//////////
			//////////////start 5/270 stage//////////
					if (stages.equals("5")&&volt==270) {
						if (eh<=180) {
							
						
						while (st1[0]==0&&st1[1]==0) {
						 for (int i = 0; i < v2.length; i++) {
						  for (int j = 0; j < v2.length; j++) {

						  		if ((v2[j]+v2[i])*3==eh1) {
						  		st1[0]=v2[i];
						  		st1[1]=v2[j];
						  		i=v2.length;
						  		j=v2.length;
						  		}
						  		}
						}
						if (st1[0]==0&&st1[1]==0) {
							eh1+=0.5;
						} 
					}
						
					/*	ehn=eht-eh1;
						eh2=ehn/3;
						eh3=ehn/3;
						eh4=ehn/3;
						
						eh2=Math.round(eh2);
						eh3=Math.round(eh3);
						eh4=Math.round(eh4);*/
						
						while (st2[0]==0&&st2[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh2) {
							  		st2[0]=v2[i];
							  		st2[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st2[0]==0&&st2[1]==0) {
								eh2+=0.5;
							} 
						}
						
						

						while (st3[0]==0&&st3[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh3) {
							  		st3[0]=v2[i];
							  		st3[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st3[0]==0&&st3[1]==0) {
								eh3+=0.5;
							} 
						}
						
						
						while (st4[0]==0&&st4[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh4) {
							  		st4[0]=v2[i];
							  		st4[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st4[0]==0&&st4[1]==0) {
								eh4+=0.5;
							} 
						}
						
						eh5=eht-(eh1+eh2+eh3+eh3);
						
						while (st5[0]==0&&st5[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh5) {
							  		st5[0]=v2[i];
							  		st5[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st5[0]==0&&st5[1]==0) {
								eh5+=0.5;
							} 
						}
						}
						else {
							txtmaxheater.setText("max 180kw");
						}
					}
						
			////////////end 5/270 stage//////////	
						
			//////////////start 6/270 stage//////////
						
						if (stages.equals("6")&&volt==270) {
							if (eh<=216) {
								
							
							while (st1[0]==0&&st1[1]==0) {
							 for (int i = 0; i < v2.length; i++) {
							  for (int j = 0; j < v2.length; j++) {

							  		if ((v2[j]+v2[i])*3==eh1) {
							  		st1[0]=v2[i];
							  		st1[1]=v2[j];
							  		i=v2.length;
							  		j=v2.length;
							  		}
							  		}
							}
							if (st1[0]==0&&st1[1]==0) {
								eh1+=0.5;
							} 
						}
							
							
							/*ehn=eht-eh1;
							eh2=ehn/3;
							eh3=ehn/3;
							eh4=ehn/3;
							eh5=ehn/3;
							
							eh2=Math.round(eh2);
							eh3=Math.round(eh3);
							eh4=Math.round(eh4);
							eh5=Math.round(eh5);*/
							
							while (st2[0]==0&&st2[1]==0) {
								 for (int i = 0; i < v2.length; i++) {
								  for (int j = 0; j < v2.length; j++) {

								  		if ((v2[j]+v2[i])*3==eh2) {
								  		st2[0]=v2[i];
								  		st2[1]=v2[j];
								  		i=v2.length;
								  		j=v2.length;
								  		}
								  		}
								}
								if (st2[0]==0&&st2[1]==0) {
									eh2+=0.5;
								} 
							}
							
							

							while (st3[0]==0&&st3[1]==0) {
								 for (int i = 0; i < v2.length; i++) {
								  for (int j = 0; j < v2.length; j++) {

								  		if ((v2[j]+v2[i])*3==eh3) {
								  		st3[0]=v2[i];
								  		st3[1]=v2[j];
								  		i=v2.length;
								  		j=v2.length;
								  		}
								  		}
								}
								if (st3[0]==0&&st3[1]==0) {
									eh3+=0.5;
								} 
							}
							
							
							while (st4[0]==0&&st4[1]==0) {
								 for (int i = 0; i < v2.length; i++) {
								  for (int j = 0; j < v2.length; j++) {

								  		if ((v2[j]+v2[i])*3==eh4) {
								  		st4[0]=v2[i];
								  		st4[1]=v2[j];
								  		i=v2.length;
								  		j=v2.length;
								  		}
								  		}
								}
								if (st4[0]==0&&st4[1]==0) {
									eh4+=0.5;
								} 
							}
							
							
							
							while (st5[0]==0&&st5[1]==0) {
								 for (int i = 0; i < v2.length; i++) {
								  for (int j = 0; j < v2.length; j++) {

								  		if ((v2[j]+v2[i])*3==eh5) {
								  		st5[0]=v2[i];
								  		st5[1]=v2[j];
								  		i=v2.length;
								  		j=v2.length;
								  		}
								  		}
								}
								if (st5[0]==0&&st5[1]==0) {
									eh5+=0.5;
								} 
							}
							
							eh6=eht-(eh1+eh2+eh3+eh4+eh5);
							while (st6[0]==0&&st6[1]==0) {
								 for (int i = 0; i < v2.length; i++) {
								  for (int j = 0; j < v2.length; j++) {

								  		if ((v2[j]+v2[i])*3==eh6) {
								  		st6[0]=v2[i];
								  		st6[1]=v2[j];
								  		i=v2.length;
								  		j=v2.length;
								  		}
								  		}
								}
								if (st6[0]==0&&st6[1]==0) {
									eh6+=0.5;
								} 
							}
							}
							else {
								txtmaxheater.setText("max 216kw");
							}
						}
							
			////////////end 6/270 stage//////////
			 eh=(st1[0]+st1[1])*3+(st2[0]+st2[1])*3+(st3[0]+st3[1])*3+(st4[0]+st4[1])*3+(st5[0]+st5[1])*3+(st6[0]+st6[1])*3;
			 txtstage10.setText(String.valueOf(st1[0]));
			 txtstage11.setText(String.valueOf(st1[1]));
			 txtstage20.setText(String.valueOf(st2[0]));
			 txtstage21.setText(String.valueOf(st2[1]));
			 txtstage30.setText(String.valueOf(st3[0]));
			 txtstage31.setText(String.valueOf(st3[1]));
			 txtstage40.setText(String.valueOf(st4[0]));
			 txtstage41.setText(String.valueOf(st4[1]));
			 txtstage50.setText(String.valueOf(st5[0]));
			 txtstage51.setText(String.valueOf(st5[1]));
			 txtstage60.setText(String.valueOf(st6[0]));
			 txtstage61.setText(String.valueOf(st6[1]));
			 
			 txttotalKW.setText(String.valueOf(eh));
			 double sumstage1 = (st1[0]+st1[1])*3;
			 txtsumstage1.setText(String.valueOf(sumstage1));
			 double sumstage2 = (st2[0]+st2[1])*3;
			 txtsumstages2.setText(String.valueOf(sumstage2));
				
			 double sumstage3 = (st3[0]+st3[1])*3;
			txtsumstages3.setText(String.valueOf(sumstage3));
				
			 double sumstage4 = (st4[0]+st4[1])*3;
			 txtsumstages4.setText(String.valueOf(sumstage4));
				
			 double sumstage5 = (st5[0]+st5[1])*3;
			 txtsumstages5.setText(String.valueOf(sumstage5));
				
			 double sumstage6 = (st6[0]+st6[1])*3;
			 txtsumstages6.setText(String.valueOf(sumstage6));
			 
	         generate_excel gn=new generate_excel();
	          gn.gen();
				
				
			}
		});
		btnRUN.setBackground(Color.YELLOW);
		btnRUN.setForeground(Color.BLUE);
		btnRUN.setBounds(272, 406, 98, 26);
		frame.getContentPane().add(btnRUN);
		
		///////////END RUN//////////////////
		
		txtmaxheater = new JTextField();
		txtmaxheater.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtmaxheater.setForeground(Color.RED);
		txtmaxheater.setEditable(false);
		
		txtmaxheater.setBounds(185, 237, 121, 24);
		frame.getContentPane().add(txtmaxheater);
		txtmaxheater.setColumns(10);
		
		JButton btnmaxkw = new JButton("How much max KW?");
		btnmaxkw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch (stages) {
				case "1":
					
					txtmaxheater.setText("max 36kw");
					
					break;
				case "2":
				
					
					txtmaxheater.setText("max 72kw");
					
					break;
				case "3":
					
					txtmaxheater.setText("max 108kw");
					
					break;
				case "4":
					
					txtmaxheater.setText("max 144kw");
					
					break;	
				case "5":
					
					txtmaxheater.setText("max 180kw");
					
					break;
				case "6":
					
					txtmaxheater.setText("max 216kw");
					
					break;
				}
				
			}
		});
		btnmaxkw.setBounds(12, 231, 161, 37);
		frame.getContentPane().add(btnmaxkw);
		
		JLabel lblCapacitykw = new JLabel("Capacity(KW)");
		lblCapacitykw.setForeground(Color.BLACK);
		lblCapacitykw.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCapacitykw.setBackground(Color.WHITE);
		lblCapacitykw.setBounds(342, 333, 105, 15);
		frame.getContentPane().add(lblCapacitykw);
		
		JLabel label_1 = new JLabel("20/7/2019");
		label_1.setFont(new Font("Dialog", Font.BOLD, 9));
		label_1.setBounds(574, 424, 48, 24);
		frame.getContentPane().add(label_1);
		
		JButton btnback = new JButton("Back");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Welcome_page wc =new Welcome_page();
				wc.welc();
				
			}
		});
		btnback.setForeground(Color.BLUE);
		btnback.setBackground(Color.YELLOW);
		btnback.setBounds(12, 405, 98, 26);
		frame.getContentPane().add(btnback);
		
		JLabel lblSum = new JLabel("SUM");
		lblSum.setBounds(606, 38, 46, 14);
		frame.getContentPane().add(lblSum);
		
		txtsumstage1 = new JTextField();
		txtsumstage1.setForeground(Color.BLACK);
		txtsumstage1.setEditable(false);
		txtsumstage1.setColumns(10);
		txtsumstage1.setBounds(606, 61, 37, 22);
		frame.getContentPane().add(txtsumstage1);
		
		txtsumstages2 = new JTextField();
		txtsumstages2.setForeground(Color.BLACK);
		txtsumstages2.setEditable(false);
		txtsumstages2.setColumns(10);
		txtsumstages2.setBounds(606, 100, 37, 22);
		frame.getContentPane().add(txtsumstages2);
		
		txtsumstages3 = new JTextField();
		txtsumstages3.setForeground(Color.BLACK);
		txtsumstages3.setEditable(false);
		txtsumstages3.setColumns(10);
		txtsumstages3.setBounds(606, 138, 37, 22);
		frame.getContentPane().add(txtsumstages3);
		
		txtsumstages4 = new JTextField();
		txtsumstages4.setForeground(Color.BLACK);
		txtsumstages4.setEditable(false);
		txtsumstages4.setColumns(10);
		txtsumstages4.setBounds(606, 175, 37, 22);
		frame.getContentPane().add(txtsumstages4);
		
		txtsumstages5 = new JTextField();
		txtsumstages5.setForeground(Color.BLACK);
		txtsumstages5.setEditable(false);
		txtsumstages5.setColumns(10);
		txtsumstages5.setBounds(606, 214, 37, 22);
		frame.getContentPane().add(txtsumstages5);
		
		txtsumstages6 = new JTextField();
		txtsumstages6.setForeground(Color.BLACK);
		txtsumstages6.setEditable(false);
		txtsumstages6.setColumns(10);
		txtsumstages6.setBounds(606, 257, 37, 22);
		frame.getContentPane().add(txtsumstages6);
		
		////////////reset///////////////
		
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnreset.isEnabled()) {
				bg.clearSelection();
				combostages.setSelectedIndex(0);
				txtmaxheater.setText("0");
				txtKW.setText("0");
				txtstage10.setText("0");
				txtstage11.setText("0");
				txtstage20.setText("0");
				txtstage21.setText("0");
				txtstage30.setText("0");
				txtstage31.setText("0");
				txtstage40.setText("0");
				txtstage41.setText("0");
				txtstage50.setText("0");
				txtstage51.setText("0");
				txtstage60.setText("0");
				txtstage61.setText("0");
				txtsumstage1.setText("0");
				txtsumstages2.setText("0");
				txtsumstages3.setText("0");
				txtsumstages4.setText("0");
				txtsumstages5.setText("0");
				txtsumstages6.setText("0");
				txttotalKW.setText("0");
				txttitle.setText("");
				st1[0]=0;
				st1[1]=0;
				
				st2[0]=0;
				st2[1]=0;
				
				st3[0]=0;
				st3[1]=0;
				
				st4[0]=0;
				st4[1]=0;
				
				st5[0]=0;
				st5[1]=0;
				
				st6[0]=0;
				st6[1]=0;
				}
				
				
			}
		});
		
		//////////end reset/////////////
		btnreset.setForeground(Color.BLUE);
		btnreset.setBackground(Color.YELLOW);
		btnreset.setBounds(145, 408, 98, 26);
		frame.getContentPane().add(btnreset);
		
	
		
		
		
///////////////////end jframe workkk////////////////		
	

					  	
		
	
		

      eh=(st1[0]+st1[1])*3+(st2[0]+st2[1])*3+(st3[0]+st3[1])*3+(st4[0]+st4[1])*3+(st5[0]+st5[1])*3+(st6[0]+st6[1])*3;
		
	}
	}


