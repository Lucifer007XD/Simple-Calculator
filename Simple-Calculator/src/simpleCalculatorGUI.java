import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class simpleCalculatorGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private simpleCalculator cal=new simpleCalculator();
	private JLabel num1Label=new JLabel("Num 1:");
	private JTextField num1Field=new JTextField(7);
	private JLabel num2Label=new JLabel("Num 2:");
	private JTextField num2Field=new JTextField(7);
	private JButton sub=new JButton("-");
	private JButton multi=new JButton("*");
	private JButton div=new JButton("/");
	private JLabel result=new JLabel("Result=0");
	
	public simpleCalculatorGUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container pane=this.getContentPane();
		pane.setLayout(new BorderLayout());
		
		JPanel pane2=new JPanel();
		pane.add(pane2,BorderLayout.NORTH);
		pane2.setLayout(new FlowLayout());
		
		
		pane2.add(num1Label);
		pane2.add(num1Field);
		
		
		
		pane2.add(num2Label);
		pane2.add(num2Field);
		
		JButton add=new JButton("+");
		add.addActionListener(this);
		pane2.add(add);
		
		
		
		sub.addActionListener(this);
		pane2.add(sub);
		
		
		multi.addActionListener(this);
		pane2.add(multi);
		
		
		div.addActionListener(this);
		pane2.add(div);
		
		
		pane2.add(result);
		
		this.setSize(800,150);
		this.setVisible(true);
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		String strnum1=num1Field.getText();
		String strnum2=num2Field.getText();
		
		if(strnum1.length()<=0||strnum2.length()<=0) {
			JOptionPane.showMessageDialog(null, "Enter number First", "Message", JOptionPane.INFORMATION_MESSAGE);
			
		}else {
		double num1=Double.parseDouble(num1Field.getText());
		double num2=Double.parseDouble(num2Field.getText());
		cal.setNum1(num1);
		cal.setNum2(num2);
		JButton btn=(JButton) e.getSource();
		String txt=btn.getText();
		if (txt=="+") {
			result.setText("Result="+cal.add());
			
		}
		if(txt=="-") {
			result.setText("Result="+cal.subtract());
			
		}
		if(txt=="*") {
			result.setText("Result="+cal.multiply());
			
		}
		if(txt=="/") {
			if(num2==0) {
				JOptionPane.showMessageDialog(null, "divided by 0", "Error", JOptionPane.ERROR_MESSAGE);
				
			}else {
				result.setText("Result="+cal.divide());
			}
			
			
		}
		
		
	}
}
	

}
