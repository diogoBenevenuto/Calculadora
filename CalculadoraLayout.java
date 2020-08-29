import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Window.Type;

public class trabcalcui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trabcalcui frame = new trabcalcui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public trabcalcui() {
		setTitle("Calculadora Brabona");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 312, 85);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn7.setBounds(10, 107, 69, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn8.setBounds(89, 107, 69, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn9.setBounds(168, 107, 69, 60);
		contentPane.add(btn9);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSoma.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnSoma.setBounds(247, 107, 69, 60);
		contentPane.add(btnSoma);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn4.setBounds(10, 178, 69, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn5.setBounds(89, 178, 69, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn6.setBounds(168, 178, 69, 60);
		contentPane.add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSub.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnSub.setBounds(247, 178, 69, 60);
		contentPane.add(btnSub);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn1.setBounds(10, 249, 69, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn2.setBounds(89, 249, 69, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn3.setBounds(168, 249, 69, 60);
		contentPane.add(btn3);
		
		JButton btnX = new JButton("*");
		btnX.setVerticalAlignment(SwingConstants.TOP);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnX.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnX.setBounds(247, 249, 69, 60);
		contentPane.add(btnX);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btn0.setBounds(10, 320, 69, 60);
		contentPane.add(btn0);
		
		JButton btnPonto = new JButton(".");
		btnPonto.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPonto.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnPonto.setBounds(89, 320, 69, 60);
		contentPane.add(btnPonto);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDiv.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnDiv.setBounds(168, 320, 69, 60);
		contentPane.add(btnDiv);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setVerticalAlignment(SwingConstants.BOTTOM);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIgual.setFont(new Font("Yu Gothic UI", Font.BOLD, 50));
		btnIgual.setBounds(247, 320, 69, 60);
		contentPane.add(btnIgual);
	}
}
