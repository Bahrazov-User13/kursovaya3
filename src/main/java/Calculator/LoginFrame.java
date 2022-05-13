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
	
	public void setLocationAndSize()
	{
	// Настройка местоположения и размера каждого компонента с помощью метода setBounds ().
	userLabel.setBounds(50,150,100,30);
	passwordLabel.setBounds(50,220,100,30);
	userTextField.setBounds(150,150,150,30);
	PasswordField.setBounds(150,220,150,30);
	showPassword.setBounds(150,250,150,30);
	LoginButton.setBounds(50,300,100,30);
	resetButton.setBounds(200,300,100,30);


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