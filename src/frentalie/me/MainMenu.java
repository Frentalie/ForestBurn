package frentalie.me;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import frentalie.me.exploration.PrepareExploration;
import frentalie.me.property.Property;

public class MainMenu extends JFrame implements ActionListener {
	public static Color MORNING_YELLOW = new Color(255, 190, 79);
	public static Color EXPLORATION_BLUE = new Color(13, 137, 214);

	private static final long serialVersionUID = 1L;
	public static JPanel conPanel;// static so it remains at global state, no
									// new instance, ugh
	public static JFrame frame;
	private JButton Explore;
	private JButton Workshop;
	private JButton Resources;
	private JButton ViewStat;
	private JButton Save;
	private JLabel timepic;
	private JLabel time;
	private JPanel jp;// new JPanel using absolute layout

	public MainMenu() {
		conPanel = new JPanel();
		jp = new JPanel();
		frame = new JFrame();
		conPanel.setLayout(new BorderLayout(0, 0));
		frame.setContentPane(conPanel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// closes when
																// exited
		frame.setBounds(0, 0, 600, 425);// 600 pixel wide, 425 pixel tall
		frame.setTitle("*Forest Burn*");
		frame.setLocationRelativeTo(null);// centers the window

		Explore = new JButton("Explore!");
		Explore.addActionListener(this);// Detects if button is clicked
		Explore.setForeground(Color.DARK_GRAY);
		Explore.setFont(new Font("Arial", Font.BOLD, 13));
		conPanel.add(Explore, BorderLayout.NORTH);

		Workshop = new JButton("Workshop");
		Workshop.addActionListener(this);
		Workshop.setForeground(Color.DARK_GRAY);
		Workshop.setFont(new Font("Arial", Font.BOLD, 13));
		conPanel.add(Workshop, BorderLayout.SOUTH);

		Resources = new JButton("Resources");
		Resources.addActionListener(this);
		Resources.setForeground(Color.DARK_GRAY);
		Resources.setFont(new Font("Arial", Font.BOLD, 13));
		conPanel.add(Resources, BorderLayout.EAST);

		ViewStat = new JButton("View Stats");
		ViewStat.addActionListener(this);
		ViewStat.setForeground(Color.DARK_GRAY);
		ViewStat.setFont(new Font("Arial", Font.BOLD, 13));
		conPanel.add(ViewStat, BorderLayout.WEST);
		jp.setLayout(null);
		frame.add(jp);

		Save = new JButton("Save Progress");
		Save.addActionListener(this);
		Save.setForeground(Color.DARK_GRAY);
		Save.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 13));
		Save.setBounds(63, 2, 255, 25);
		jp.add(Save);

		jp.setBackground(MORNING_YELLOW);
		timepic = new JLabel();
		timepic.setIcon(new ImageIcon(this.getClass().getResource("/AM/700AM.png")));
		timepic.setBounds(63, 39, 300, 250);
		jp.add(timepic);

		time = new JLabel("The time is 7:00 A.M");
		time.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		time.setBounds(80, 297, 228, 42);
		jp.add(time);

		frame.setVisible(true);// makes window and components visible
		frame.setResizable(false);// so the buttons aren't weird

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Explore) {
			PrepareExploration explo = new PrepareExploration();
			explo.ChoosingMenu();
		} else if (e.getSource() == Workshop) {

		} else if (e.getSource() == Resources) {

		} else if (e.getSource() == ViewStat) {
			
		} else {
			try {
				@SuppressWarnings("unused")
				Property property = new Property();
			} catch (ClassNotFoundException | IOException e1) {
				e1.printStackTrace();
			}
		}

	}

	public static void removecom(JButton removebutton, boolean removeall) {
		try {
			if (removeall) {
				conPanel.removeAll();
			} else {
				conPanel.remove(removebutton);
			}
		} catch (NullPointerException e) {

		}
		conPanel.revalidate();
		conPanel.repaint();
	}
}
