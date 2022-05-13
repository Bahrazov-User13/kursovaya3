package Calculator;

import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * The Class FormMain.
 * @author Bakhrazov R.R.
 * @author Fatkhiev D.A.
 * @author Yulmukhametov A.S.
 * @author Kydyrgychov A.M.
 */
public class FormMain extends JFrame {
    
    /** The Constant AddType. */
    static final String[] AddType = {"Раз в месяц", "Раз в полгода", "Раз в год"};
    
    /** The Sum field. Сумма */
    public static JTextField SumField = new NumberField();
    
    /** The Period field. Период */
    public static JTextField PeriodField = new NumberField();
    
    /** The Percentage field. Поле в процентах */
    public static JTextField PercentageField = new NumberField();
    
    /** The Payment box. Денежный ящик. */
    public static JComboBox PaymentBox = new JComboBox(AddType);
    
    /** The Add field. */
    public static JTextField AddField = new NumberField();
    
    /** The Add type box. Поле для добавления */
    public static JComboBox AddTypeBox = new JComboBox(AddType);
    
    /** The capital check. Проверка капитала */
    public static JCheckBox capitalCheck = new JCheckBox("Капитализация процентов");
    
    /** The output label. */
    public static JLabel outputLabel = new JLabel();
    
    /** The output.Результат */
    public static String[] output = new String[8];
    
    /** The Calc button. Кнопка расчета */
    public static ButtonCalculate CalcButton = new ButtonCalculate();
    
    /** The PDF button. Кнопка ПДФ */
    public static ButtonPDF PDFButton = new ButtonPDF();
    
    /**
     * Gets the calc button.
     *
     * @return the calc button
     */
    public static ButtonCalculate getCalcButton() { return CalcButton; }

    /**
     * Gets the PDF button.
     *
     * @return the PDF button
     */
    public static ButtonPDF getPDFButton() { return PDFButton; }

    /**
     * Gets the output. Получает результат
     *
     * @return the output. Возвращает выходные данные
     */
    public static String[] getOutput() { return output; }

    /**
     * Gets the sum field.
     *
     * @return the sum field
     */
    public static JTextField getSumField() {
        return SumField;
    }

    /**
     * Gets the period field.
     *
     * @return the period field
     */
    public static JTextField getPeriodField() {
        return PeriodField;
    }

    /**
     * Gets the percentage field.
     *
     * @return the percentage field
     */
    public static JTextField getPercentageField() {
        return PercentageField;
    }

    /**
     * Gets the payment box.
     *
     * @return the payment box
     */
    public static JComboBox getPaymentBox() {
        return PaymentBox;
    }

    /**
     * Gets the adds the field.
     *
     * @return the adds the field
     */
    public static JTextField getAddField() {
        return AddField;
    }

    /**
     * Gets the adds the type box.
     *
     * @return the adds the type box
     */
    public static JComboBox getAddTypeBox() {
        return AddTypeBox;
    }

    /**
     * Gets the capital check.
     *
     * @return the capital check
     */
    public static JCheckBox getCapitalCheck() {
        return capitalCheck;
    }

    /**
     * Gets the output label.
     *
     * @return the output label
     */
    public static JLabel getOutputLabel() { return outputLabel; }

    /**
     * Instantiates a new form main.
     *
     * @param title the title
     */
    public FormMain(String title) {
        super(title);

        JLabel SumLabel = new JLabel("Сумма вклада (в руб.):");
        JLabel PeriodLabel = new JLabel("Срок (в месяцах):");
        JLabel PercentageLabel = new JLabel("Процентная ставка (в %):");
        JLabel PaymentLabel = new JLabel("Периодичность выплат:");
        JLabel AddLabel = new JLabel("Пополнения (в руб.):");
        SumLabel.setBounds(10, 10, 150, 20);
        PeriodLabel.setBounds(10, 40, 150, 20);
        PercentageLabel.setBounds(10, 70, 150, 20);
        PaymentLabel.setBounds(10, 100, 150, 20);
        AddLabel.setBounds(10, 130, 150, 20);

        SumField.setBounds(180, 10, 230, 20);
        PeriodField.setBounds(180, 40, 230, 20);
        PercentageField.setBounds(180, 70, 230, 20);
        PaymentBox.setBounds(180, 100, 230, 20);
        AddField.setBounds(300, 130, 110, 20);
        AddTypeBox.setBounds(180, 130, 110, 20);
        capitalCheck.setBounds(175, 160, 180, 20);

        ButtonTeam TeamButton = new ButtonTeam();
        ButtonExit ExitButton = new ButtonExit();
        TeamButton.setText(
                "<html>" +
                "<p align=\"center\">" +
                "Команда" + "<br>" +
                "разработчиков" + "</p>" +
                "</html>");
        CalcButton.setText("Рассчитать");
        ExitButton.setText("Выход");
        PDFButton.setText("PDF");
        PDFButton.setEnabled(false);
        TeamButton.setBounds(10, 160, 120, 40);
        CalcButton.setBounds(10, 210, 120, 40);
        PDFButton.setBounds(10, 260, 120, 40);
        ExitButton.setBounds(10, 310, 120, 40);

        outputLabel.setBounds(160, 180, 240, 170);

        this.add(SumLabel);
        this.add(PeriodLabel);
        this.add(PercentageLabel);
        this.add(PaymentLabel);
        this.add(AddLabel);
        this.add(SumField);
        this.add(PeriodField);
        this.add(PercentageField);
        this.add(PaymentBox);
        this.add(AddField);
        this.add(AddTypeBox);
        this.add(capitalCheck);
        this.add(TeamButton);
        this.add(CalcButton);
        this.add(PDFButton);
        this.add(ExitButton);
        this.add(outputLabel);

        this.setLayout(null);
        this.setBounds(0, 0, 450, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}