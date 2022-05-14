package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Creating LoginFrame class
public class LoginFrame extends JFrame implements ActionListener {

	Container container=getContentPane();

	LoginFrame()
	{
	//Calling setLayoutManger() method inside the constructor.
	setLayoutManager();

	}
	public void setLayoutManager()
	{
	//Setting layout manager of Container to null
	container.setLayout(null);
	}


	@Override
	public void actionPerformed(ActionEvent e) {

	}
	}