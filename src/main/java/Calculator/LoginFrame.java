package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFrame extends JFrame implements ActionListener {

Container container=getContentPane();
JLabel userLabel=new JLabel("Имя пользователя");
JLabel passwordLabel=new JLabel("Пароль");
JTextField userTextField=new JTextField();
JPasswordField passwordField=new JPasswordField();
JButton loginButton=new JButton("Авторизоваться cv");
JButton resetButton=new JButton("Сброс");
JCheckBox showPassword=new JCheckBox("Показать пароль");


LoginFrame() {
setLayoutManager();
setLocationAndSize();
addComponentsToContainer();
addActionEvent();

}

public void setLayoutManager() {
container.setLayout(null);
}

public void setLocationAndSize() {
userLabel.setBounds(50,150,100,30 );
passwordLabel.setBounds(50,220,100,30 );
userTextField.setBounds(150,150,150,30 );
passwordField.setBounds(150,220,150,30 );
showPassword.setBounds(150,250,150,30 );
loginButton.setBounds(50,300,100,30 );
resetButton.setBounds(200,300,100,30 );


}

public void addComponentsToContainer() {
container.add(userLabel);
container.add(passwordLabel);
container.add(userTextField);
container.add(passwordField);
container.add(showPassword);
container.add(loginButton);
container.add(resetButton);
}

public void addActionEvent() {
loginButton.addActionListener(this);
resetButton.addActionListener(this);
showPassword.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent e) {

if (e.getSource() == loginButton) {
String userText;
String pwdText;
userText = userTextField.getText();
pwdText = passwordField.getText();
if (userText.equalsIgnoreCase("user1") && pwdText.equalsIgnoreCase("12345")) {
JOptionPane.showMessageDialog(this, "Авторизация успешна");
new FormMain("Депозитный калькулятор с капитализацией");
this.setVisible(false);
} else {
JOptionPane.showMessageDialog(this, "Неправильный логин или пароль");
}

}

if (e.getSource() == resetButton) {
userTextField.setText("");
passwordField.setText("");
}

if (e.getSource() == showPassword) {
if (showPassword.isSelected()) {
passwordField.setEchoChar((char) 0);
} else {
passwordField.setEchoChar('*');
}


}
}

}