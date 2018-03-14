import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
public static void main(String[] args) {
	String pi = "3.141592653";
	String digit = "0";
	
	for (int i = 0; i < 4; i++) {
		System.out.print(pi.charAt(i));
	}
	for (int j = 4; j < 10; j++) {
		
	
		String digitguess = JOptionPane.showInputDialog("What is the next digit of pie");
	    digit = Character.toString(pi.charAt(j));
	    if (digitguess.equals(digit)) {
	    	System.out.print(digit);
	    }
	    else {
	    	JOptionPane.showMessageDialog(null, "NO PIE FOR YOU!");
	    	System.exit(0);
	    }
		}
	JOptionPane.showMessageDialog(null, "Good job!!!");
         playVideo("www.youtube.com/watch?v=6TPjRoWm8Ck");
	     }
	
	static void playVideo(String videoURL) {
	     try {
	          URI uri = new URI(videoURL);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
}
	}
}

