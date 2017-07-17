package practice;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class Invoice extends JFrame {
	//private final String applicationTitle = "Invoice of Company ABC Ltd";
   // private JLabel title;
    JTextField retailPriceFld;
    JTextField discountFld;
    JTextField taxFld;
    float totalPrice;
   /* int retailPrice;
    int discount;
    int tax;
    */
    
    
    
	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		invoice.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		centreWindow(invoice);
		invoice.setVisible(true);
		
	}
	
	public Invoice(){ // constructor
		this.setTitle("Invoice of Company ABC Ltd");
		this.setSize(800, 320);
		initializeGUI();
	}
	private void initializeGUI() {
		addWindowListener( new ConfirmOnClose() );
		JPanel content = (JPanel)this.getContentPane();
		content.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(2,2,2,2);
		c.gridx =0;
		c.gridy =0;
		c.gridwidth =4;
		JLabel label = new JLabel("Invoice of Company ABC", SwingConstants.CENTER);
		content.add(label,c);
		
		c.gridx = 0; //0th column
		c.gridy = 1; //1st row
		c.gridwidth = 4; // Title spans four columns
		JLabel subLabel = new JLabel("Use to calculate simple total price of the item", SwingConstants.CENTER);
		content.add(subLabel, c);
		
		
		c.gridx = 0; //0th column
		c.gridy = 4; //4th row
		c.gridwidth = 1; 
		label = new JLabel("Retail Price", SwingConstants.LEFT);
		content.add(label, c);
		

		c.gridx = 1; //1st column
		c.gridy = 4; //4th row
		c.gridwidth = 1; 
		retailPriceFld = new JTextField("", 4);
		content.add(retailPriceFld, c);
		
		
		c.gridx = 0; //0th column
		c.gridy = 5; //5th row
		c.gridwidth = 1; 
		label = new JLabel("Discount", SwingConstants.LEFT);
		content.add(label, c);
		
		c.gridx = 1; 
		c.gridy = 5; 
		c.gridwidth = 1; 
		discountFld = new JTextField("", 4);
		content.add(discountFld, c);
		
		c.gridx = 0; 
		c.gridy = 6; //6th row
		c.gridwidth = 1; 
		label = new JLabel("Tax", SwingConstants.LEFT);
		content.add(label, c);
		
		c.gridx = 1; //1st column
		c.gridy = 6; //6th row
		c.gridwidth = 1; 
		taxFld = new JTextField("0.07",4);
		content.add(taxFld, c);
		
		c.gridx = 0; //0th column
		c.gridy = 8; //8th row
		c.gridwidth = 2; 
		JButton button = new JButton("Compute");
		button.setActionCommand("compute");
		button.addActionListener(new ButtonActions());
		content.add(button, c);
		
		 c.gridx = 1;    //1st Row
	     c.gridy = 2; 
	     
	     c.gridx = 0; 
	     c.gridy = 9; 
		 c.gridwidth = 4; 
		 label = new JLabel("Result", SwingConstants.LEFT);
		 content.add(label, c);
	     
		 c.gridx = 2; //1st column
		 c.gridy = 10; //6th row
		 c.gridwidth = 4; 
		 JTextField resultFld = new JTextField(String.valueOf(totalPrice),4);
		 content.add(resultFld, c);
	     
	}
	
	private static void centreWindow(Window frame) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)((dimension.getWidth()-frame.getWidth())/2);
		int y = (int)((dimension.getHeight()-frame.getHeight())/2);
		frame.setLocation(x,y);
		
	}
	
	class ConfirmOnClose extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			int confirm = JOptionPane.showConfirmDialog(e.getWindow(), "Are you sure you want to exit?");
			if (confirm ==0){
				e.getWindow().dispose();
				System.exit(0);
				
			}
		}
	}

	class ButtonActions implements ActionListener{
		public void actionPerformed(ActionEvent evt){
			if(evt.getActionCommand().equalsIgnoreCase("compute")){
				String priceTxt = retailPriceFld.getText();
				String discountTxt = discountFld.getText();
				String taxTxt = taxFld.getText();
				float retailPrice = Float.parseFloat(priceTxt);
				float discount = Float.parseFloat(discountTxt);
				//double discount1 = discount1/100;
					
				float tax = Float.parseFloat(taxTxt);
					
					
					
					/*System.out.println("Enter the total tax of item: ");
					double tax1 = s.nextDouble();*/
					//double tax1 = tax1/100;
					
					/*System.out.println("Invoice:");
		
					System.out.println("The price is:"+price);
					System.out.println("The discount is:"+discount1);
					System.out.println("The tax is:"+tax1);*/
					System.out.println("The price is:"+retailPrice);
					System.out.println("The Discount is:"+discount);
					System.out.println("The Tax is:"+tax);
					
					 totalPrice = ((retailPrice-(retailPrice*discount))+(retailPrice-(retailPrice*discount))*tax);
					
					
					System.out.println("The total price: "+ totalPrice);
				
			}
			
		}
		
		
	}

}
