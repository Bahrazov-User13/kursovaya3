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
	//Calling methods inside constructor.
	setLayoutManager();
	setLocationAndSize();
	addComponentsToContainer();

	}
	public void setLayoutManager()
	{
	container.setLayout(null);
	}
	public void setLocationAndSize()
	{
	//Setting location and Size of each components using setBounds() method.
	userLabel.setBounds(50,150,100,30);
	passwordLabel.setBounds(50,220,100,30);
	userTextField.setBounds(150,150,150,30);
	passwordField.setBounds(150,220,150,30);
	showPassword.setBounds(150,250,150,30);
	loginButton.setBounds(50,300,100,30);
	resetButton.setBounds(200,300,100,30);


	}
	public void addComponentsToContainer()
	{
	//Adding each components to the Container
	container.add(userLabel);
	container.add(passwordLabel);
	container.add(userTextField);
	container.add(passwordField);
	container.add(showPassword);
	container.add(loginButton);
	container.add(resetButton);
	}


	@Override
	public void actionPerformed(ActionEvent e) {

	}
	} 