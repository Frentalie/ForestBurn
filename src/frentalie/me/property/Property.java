package frentalie.me.property;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Property implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4892302064971929853L;

	public Property() throws IOException, ClassNotFoundException {
		File Savefile = new File("ForestBurnSave.fbs");
		if (Savefile.exists())
			JOptionPane.showMessageDialog(null, "Your progress has been saved. Save File Path:\n" + Savefile.getAbsolutePath(),
					"Saving Game",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "A saved file has been created to store your progress. Save File Path:\n" + Savefile.getAbsolutePath(),
					"Saving Game",
					JOptionPane.INFORMATION_MESSAGE);
		FileOutputStream fileStream = new FileOutputStream(Savefile);
		ObjectOutputStream outputStream = new ObjectOutputStream(fileStream);
		// outputStream.writeObject();//use later
		fileStream.close();
		outputStream.close();
	}

}