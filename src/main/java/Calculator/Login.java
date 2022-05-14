package Calculator;

import javax.swing.JFrame;

public class Login {
	public Login () {
		//Creating object of LoginFrame class and setting some of its properties
		LoginFrame frame=new LoginFrame();
		frame.setTitle("Авторизация");
		frame.setBounds(10,10,370,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}