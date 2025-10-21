import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator Using Swing");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(10, 10, 10, 11));
        
        Color frameColor = new Color(173, 216, 230);
        Color buttonColor = new Color(255, 182, 193);

		frame.getContentPane().setBackground(frameColor);
		
        final JLabel label1 = new JLabel("Enter First Number:");
        final JTextField text1 = new JTextField();
        label1.setHorizontalAlignment(JLabel.CENTER);
        text1.setHorizontalAlignment(JTextField.CENTER);

        JLabel label2 = new JLabel("Enter Second Number:");
        final JTextField text2 = new JTextField();
        label2.setHorizontalAlignment(JLabel.CENTER);
        text2.setHorizontalAlignment(JTextField.CENTER);

        JLabel label3 = new JLabel("Result:");
        final JTextField resultField = new JTextField();
        label3.setHorizontalAlignment(JLabel.CENTER);
        resultField.setHorizontalAlignment(JTextField.CENTER);
        resultField.setEditable(false);
        resultField.setFont(new Font("Arial", Font.BOLD, 16));

        JButton addButton = new JButton("Add");
        JButton exitButton = new JButton("Exit");
		JButton subtractButton = new JButton("Subtract");
		JButton multiplyButton = new JButton ("Multiply");
		JButton divideButton = new JButton ("Divide");

        JButton[] buttons = {addButton, subtractButton, multiplyButton, divideButton, exitButton};
        for (JButton btn : buttons) {
            btn.setBackground(buttonColor);
            btn.setForeground(Color.BLACK);
            btn.setFocusPainted(false); // cleaner look
        }
        

        // ActionListener for Add button (Java 7 style)
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int sum = num1 + num2;
                    resultField.setText(String.valueOf(sum));
					JOptionPane.showMessageDialog(frame, "Addition has been done! Result:"+sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers");
                }
            }
        });
        // ActionListener for Subtract button 
		subtractButton.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				try {
					double num1 =  Integer.parseInt (text1.getText());
					double num2 =  Integer.parseInt (text2.getText());
					double result = num1 - num2;
					resultField.setText(String.valueOf(result));
					JOptionPane.showMessageDialog(frame, "Subtraction has been done! Result: " + result);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Please enter valid numbers");
				}
			}
	    });
		 // ActionListener for Multiply button 
		multiplyButton.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				try {
					int num1 =  Integer.parseInt (text1.getText());
					int num2 =  Integer.parseInt (text2.getText());
					int result = num1 * num2;
					resultField.setText(String.valueOf(result));
					JOptionPane.showMessageDialog(frame, "Multiplication has been done! Result: " + result);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Please enter valid numbers");
				}
			}
	    });
		// ActionListener for Divide button 
		divideButton.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				try {
					int num1 =  Integer.parseInt (text1.getText());
					int num2 =  Integer.parseInt (text2.getText());
					int result = num1 / num2;
					 resultField.setText(String.valueOf(result));
					 JOptionPane.showMessageDialog(frame, "Division has been done! Result: " + result);
                } catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Please enter valid numbers");
				}
			}
	    });
        // ActionListener for Exit button
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(label3);
        frame.add(resultField);
        frame.add(addButton);
		frame.add(subtractButton);
		frame.add(multiplyButton);
		frame.add(divideButton);
        frame.add(exitButton);

        // Show frame
        frame.setVisible(true);
    }
}