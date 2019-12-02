
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutExample {

    // needed for URL link
    public void openWebPage(String url){
      try {
      java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
      }

      catch (java.io.IOException e) {
      System.out.println(e.getMessage());
 }
}

	FlowLayoutExample(){
		JFrame frame = new JFrame("Final Project");

        // designing button
		JButton button,button1, button2, button3,button4;

        // creating button
		button = new JButton("ANIMATION");
		button1 = new JButton("VIDEO");
		button2 = new JButton("WEBSITE");
		button3 = new JButton("GAME");
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

        // button 1 link
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                openWebPage("https://www.tamu.edu/");    // WEBSITE HERE!!!!
            }
        });

        // button 1 link
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                openWebPage("https://www.youtube.com/watch?v=bah_B7YW2Lk");
            }
        });

		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutExample();
    String[] printout = new String[100];

    AnimationHM callFunction = new AnimationHM();
    // callFunction.HM6();

    callFunction.myMethod();
    //callFunction.animate(printout);

	}
}
