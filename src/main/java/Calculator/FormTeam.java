package Calculator;

import javax.swing.*;
import java.awt.*;

// TODO: Auto-generated Javadoc
/**
 * The Class FormTeam.
 * @author Bakhrazov R.R.
 */
public class FormTeam extends JFrame {
    
    /**
     * Instantiates a new form team.
     *
     * @param title the title
     */
    public FormTeam(String title) {
        super(title);
        JLabel TeamLabel = new JLabel(
                "<html>" +
                        "<p align=\"center\">" +
                        "Бахразов Руслан Рустамович" + "<br>" +
                        "Фатхиев Динар Айдарович" + "<br>" +
                        "Юлмухаметов Алмаз Шамилевич" + "<br>" +
                        "Кыдыргычов Арсений Михайлович" + "<br>" +
                        "</p>" +
                        "</html>"
        );
        final FormTeam form = this; 
        JButton ExitButton = new JButton("Выход");
        ExitButton.addActionListener(e -> form.dispose());
        this.add(TeamLabel, BorderLayout.NORTH);
        this.add(ExitButton, BorderLayout.SOUTH);
        this.setBounds(0, 0, 240, 130);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
