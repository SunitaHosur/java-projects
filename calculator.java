import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField display;
      double num1;
      double num2;
      double res;
      String op;
      
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		frame.getContentPane().setBackground(new Color(106, 90, 205));
		frame.setBounds(100, 100, 627, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		display.setBackground(new Color(240, 248, 255));
		display.setBounds(12, 13, 559, 83);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton one = new JButton("1");
		one.setForeground(new Color(255, 255, 255));
		one.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		one.setBackground(new Color(0, 0, 0));
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"1";
				display.setText(num);
			}
		});
		one.setBounds(12, 122, 113, 54);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.setBackground(new Color(0, 0, 0));
		two.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		two.setForeground(new Color(255, 255, 255));
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"2";
				display.setText(num);
			}
		});
		two.setBounds(155, 122, 113, 54);
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.setForeground(new Color(255, 255, 255));
		three.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		three.setBackground(new Color(0, 0, 0));
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"3";
				display.setText(num);	
			}
		});
		three.setBounds(296, 122, 113, 54);
		frame.getContentPane().add(three);
		
		JButton four = new JButton("4");
		four.setForeground(new Color(255, 255, 255));
		four.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		four.setBackground(new Color(0, 0, 0));
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"4";
				display.setText(num);
			}
		});
		four.setBounds(12, 207, 113, 54);
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.setForeground(new Color(255, 255, 255));
		five.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		five.setBackground(new Color(0, 0, 0));
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"5";
				display.setText(num);
			}
		});
		five.setBounds(155, 207, 113, 54);
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.setForeground(new Color(255, 255, 255));
		six.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		six.setBackground(new Color(0, 0, 0));
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"6";
				display.setText(num);
			}
		});
		six.setBounds(296, 207, 113, 54);
		frame.getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.setForeground(new Color(255, 255, 255));
		seven.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		seven.setBackground(new Color(0, 0, 0));
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"7";
				display.setText(num);
			}
		});
		seven.setBounds(12, 296, 113, 54);
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.setForeground(new Color(255, 255, 255));
		eight.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		eight.setBackground(new Color(0, 0, 0));
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"8";
				display.setText(num);
			}
		});
		eight.setBounds(155, 296, 113, 54);
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.setForeground(new Color(255, 255, 255));
		nine.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		nine.setBackground(new Color(0, 0, 0));
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"9";
				display.setText(num);
			}
		});
		nine.setBounds(296, 296, 113, 54);
		frame.getContentPane().add(nine);
		
		JButton dot = new JButton(".");
		dot.setForeground(new Color(255, 255, 255));
		dot.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		dot.setBackground(new Color(0, 0, 0));
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+".";
				display.setText(num);
			}
		});
		dot.setBounds(12, 383, 113, 54);
		frame.getContentPane().add(dot);
		
		JButton zero = new JButton("0");
		zero.setForeground(new Color(255, 255, 255));
		zero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		zero.setBackground(new Color(0, 0, 0));
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"0";
				display.setText(num);
			}
		});
		zero.setBounds(155, 383, 113, 54);
		frame.getContentPane().add(zero);
		
		JButton clear = new JButton("C");
		clear.setForeground(new Color(0, 0, 0));
		clear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		clear.setBackground(new Color(255, 0, 0));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
			}
		});
		clear.setBounds(296, 383, 113, 54);
		frame.getContentPane().add(clear);
		
		JButton add = new JButton("+");
		add.setFont(new Font("Tahoma", Font.BOLD, 20));
		add.setBackground(new Color(255, 0, 0));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="+";
			}
		});
		add.setBounds(450, 122, 121, 54);
		frame.getContentPane().add(add);
		
		JButton substract = new JButton("-");
		substract.setFont(new Font("Tahoma", Font.BOLD, 20));
		substract.setBackground(new Color(255, 0, 0));
		substract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="-";
			}
		});
		substract.setBounds(450, 207, 121, 54);
		frame.getContentPane().add(substract);
		
		JButton multiply = new JButton("*");
		multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		multiply.setBackground(new Color(255, 0, 0));
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="*";
			}
		});
		multiply.setBounds(450, 296, 121, 54);
		frame.getContentPane().add(multiply);
		
		JButton divide = new JButton("/");
		divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		divide.setBackground(new Color(255, 0, 0));
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="/";
			}
		});
		divide.setBounds(450, 383, 121, 54);
		frame.getContentPane().add(divide);
		
		JButton result = new JButton("=");
		result.setFont(new Font("Tahoma", Font.BOLD, 20));
		result.setBackground(new Color(64, 224, 208));
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2=Double.parseDouble(display.getText());
				if(op.equals("+")){
					res=num1+num2;
				}
				else if(op.equals("-")){
					res=num1=num2;
				}
				else if(op.equals("*")){
					res=num1*num2;
				}
				else if(op.equals("/")){
					res=num1/num2;
				}
				display.setText(res+"");
			}
		});
		result.setBounds(12, 457, 559, 59);
		frame.getContentPane().add(result);
	}
}
