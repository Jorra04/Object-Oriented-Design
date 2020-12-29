import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BlackJackGame game = new BlackJackGame("Jorra");
				JFrame frame = new JFrame("BlackJack");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(600, 800);
				JPanel panel = new JPanel();
				
				JLabel label = new JLabel("");
				label.setBounds(250, 400, 200, 50);
				
				JLabel label2 = new JLabel("");
				label2.setBounds(250, 450, 200, 50);
				panel.add(label);
				panel.add(label2);
				

				JButton button = new JButton("Deal");
				button.setBounds(450, 700, 80, 25);
				panel.add(button);
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Card dealt = game.deal();
						if (game.getPlayerScore() == 21) {
							label.setText("Your Card: " + dealt.toString());
							label2.setText("You've Won");
							
							return;
							
						} else if (game.getPlayerScore() > 21) {
							label.setText("Your Card: " + dealt.toString());
							label2.setText("Bust! You have gone over 21!");
							return;
							
						} else {
							label.setText("Your Card: " + dealt.toString());
							label2.setText("Current Player Score: " + game.getPlayerScore());
						}
					}
				});
			
				frame.add(panel);
				panel.setLayout(null);
				frame.setVisible(true);
			}
		});
	}

}
