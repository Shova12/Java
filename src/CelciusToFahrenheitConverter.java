import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CelciusToFahrenheitConverter extends JFrame {
	JTextField tempCFld;
    JTextField tempFFld;
    public static void main( String[] args ) {
        CelciusToFahrenheitConverter unitsConverter = new CelciusToFahrenheitConverter();
        unitsConverter.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        centreWindow( unitsConverter );
        unitsConverter.setVisible(true);
    }

    public CelciusToFahrenheitConverter() {
        this.setTitle( "Convert Celcius to Fahrenheit");
        this.setSize( 500, 400 );
        initializeGUI();
    }

    private void initializeGUI() {
        addWindowListener( new ConfirmOnClose() );
        JPanel content = (JPanel)this.getContentPane();
        content.setLayout( new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(2,2,2,2);
        c.gridx = 0;    //0th column
        c.gridy = 0;    //oth Row
        c.gridwidth = 2;
        JLabel label = new JLabel( "Celcius to Fahrenheit Converter", SwingConstants.CENTER );
        content.add( label,c );

        c.gridwidth = 1;
        c.gridx = 0;    //0th Column
        c.gridy = 1;    //1st Row
        label = new JLabel( "Enter temperature in Celcius", SwingConstants.LEFT );
        content.add( label, c );

        c.gridx = 1;    //1st Row
        c.gridy = 1;    //1st Column
        tempCFld = new JTextField( "", 4);
        content.add( tempCFld, c );

        c.gridx = 0;    //0th Column
        c.gridy = 2;    //1st Row
        label = new JLabel( "Temperature in Fahrenheit", SwingConstants.LEFT );
        content.add( label, c );

        c.gridx = 1;    //1st Row
        c.gridy = 2;    //1st Column
        tempFFld = new JTextField( "", 4);
        tempFFld.setEditable( false );
        content.add( tempFFld, c );

        c.gridx = 0;
        c.gridy = 4;
        JButton button = new JButton( "Convert to Fahrenheit" );
        button.setActionCommand( "ConvertCtoF" );
        button.addActionListener( new ButtonActions() );
        content.add( button, c );

    }

    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    class ConfirmOnClose extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            int confirm = JOptionPane.showConfirmDialog(e.getWindow(), "Are you sure you want exit?");
            if( confirm == 0 ) {
                e.getWindow().dispose();
                System.exit(0);
            }
        }
    }



    class ButtonActions implements ActionListener {
        public void actionPerformed( ActionEvent evt ){
            if ( evt.getActionCommand().equalsIgnoreCase( "ConvertCtoF" ) ){
                String strTempC = tempCFld.getText();
                Double tempC = Double.parseDouble( strTempC );
                Double tempF = tempC * 1.8 + 32;
                tempFFld.setText( Double.toString(tempF.doubleValue()) );
            }
        }
    }
}
