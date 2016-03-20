package frentalie.me.exploration;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import frentalie.me.MainMenu;

public class PrepareExploration implements ActionListener {
	private JButton BringStuff;
	private JButton Cancel;
	private JButton Ready;
	private JButton Companion;
	private JLabel Explorepic;
	private JPanel pan = new JPanel();

	public void ChoosingMenu() {

		MainMenu.removecom(null, true);

		BringStuff = new JButton("Bring Resources!");
		BringStuff.addActionListener(this);
		BringStuff.setFont(new Font("Arial", Font.PLAIN, 13));
		MainMenu.conPanel.add(BringStuff, BorderLayout.WEST);

		Cancel = new JButton("Cancel");
		Cancel.addActionListener(this);
		Cancel.setFont(new Font("Arial", Font.PLAIN, 13));
		MainMenu.conPanel.add(Cancel, BorderLayout.SOUTH);

		Ready = new JButton("All Ready!");
		Ready.addActionListener(this);
		Ready.setFont(new Font("Arial", Font.BOLD, 13));
		MainMenu.conPanel.add(Ready, BorderLayout.NORTH);

		Companion = new JButton("Companions");
		Companion.addActionListener(this);
		Ready.setFont(new Font("Arial", Font.BOLD, 13));
		MainMenu.conPanel.add(Companion, BorderLayout.EAST);

		MainMenu.frame.add(pan);
		pan.setLayout(null);
		Explorepic = new JLabel();
		Explorepic.setIcon(new ImageIcon(this.getClass().getResource("/Explore/Explorepic.png")));
		Explorepic.setBounds(41, 35, 300, 250);
		pan.setBackground(MainMenu.EXPLORATION_BLUE);
		pan.add(Explorepic);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BringStuff) {

		} else if (e.getSource() == Cancel) {
			MainMenu.frame.dispose();
			@SuppressWarnings("unused")
			MainMenu x = new MainMenu();
		} else if (e.getSource() == Ready) {

		} else if (e.getSource() == Companion) {

		}
	}

}
