package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO: Auto-generated Javadoc
/**
 * The Class Buttons.
 * @author Fatkhiev D.A.
 * @author Yulmukhametov A.S.
 */
public abstract class Buttons extends JButton implements ActionListener {
    
    /**
     * Instantiates a new buttons. Создает экземпляр новой кнопки.
     */
    public Buttons() {
        super();
        addActionListener(this);
    }

    /**
     * Action. Действие 
     */
    public abstract void action();

    /**
     * Message.
     *
     * @param text the text
     * @param title the title
     */
    public void message(String text, String title) {
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Message.
     *
     * @param text the text
     */
    public void message(String text) {
        JOptionPane.showMessageDialog(null, text, "Сообщение", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Action performed. Действие выполнено.
     *
     * @param e the e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        action();
    }
}
