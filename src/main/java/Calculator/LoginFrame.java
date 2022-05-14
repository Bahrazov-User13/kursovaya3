package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Creating LoginFrame class
public class LoginFrame extends JFrame implements ActionListener {

	Container container=getContentPane();
	JLabel userLabel=new JLabel("Имя пользователя");
	JLabel passwordLabel=new JLabel("Пароль");
	JTextField userTextField=new JTextField();
	JPasswordField passwordField=new JPasswordField();
	JButton loginButton=new JButton("Авторизоваться");
	JButton resetButton=new JButton("Сброс");
	JCheckBox showPassword=new JCheckBox("Показать пароль");
	
	LoginFrame()
	{
	// Вызов методов внутри конструктора.
	setLayoutManager();
	setLocationAndSize();
	addComponentsToContainer();

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