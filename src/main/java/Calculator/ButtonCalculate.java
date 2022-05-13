package Calculator;

// TODO: Auto-generated Javadoc
/**
 * The Class ButtonCalculate.
 * @author Yulmukhametov A.S.
 */
public class ButtonCalculate extends Buttons{
    
    /** The date. */
    private int date;
    
    /** The add type. */
    private int addType;

    /**
     * Action.
     */
    @Override
    public void action() {
        String sum = FormMain.getSumField().getText();
        String period = FormMain.getPeriodField().getText();
        String percentage = FormMain.getPercentageField().getText();
        String add = FormMain.getAddField().getText();
        boolean check = FormMain.getCapitalCheck().isSelected();
        if (sum.isEmpty() || period.isEmpty() || percentage.isEmpty()) {
            message("Заполните поля суммы вклада, периодичности выплат и процентной ставки", "Ошибка!");
        } else {
            if (add.isEmpty()) {
                add = "0";
            }
            switch (FormMain.getPaymentBox().getSelectedIndex()) {
                case 0: date = 1; break;
                case 1: date = 6; break;
                case 2: date = 12; break;
            }
            switch (FormMain.getAddTypeBox().getSelectedIndex()) {
                case 0: addType = 1; break;
                case 1: addType = 6; break;
                case 2: addType = 12; break;
            }
            if (aInt(period) % date != 0) {
                message("Срок должен быть кратен - " + date, "Ошибка!");
            } else {
                String checkText;
                double s;
                if (check) {
                    checkText = "С капитализацией процентов";
                    s = aInt(sum)*Math.pow(1 + aDouble(percentage)/100 ,(aInt(period)/date))+((aInt(add)*(1 + aDouble(percentage)/100))*(Math.pow((1 + aDouble(percentage)/100), aInt(period)/addType - 1)-1))/((1 + aDouble(percentage)/100-1));
                } else {
                    checkText = "Без капитализации процентов";
                    s = aInt(sum)+ aInt(sum)*(aDouble(percentage)/100)*(aInt(period)/date)+(aInt(period)/addType-1)* aInt(add);
                }
                s = round(s, 2);
                FormMain.getSumField().setEnabled(false);
                FormMain.getPeriodField().setEnabled(false);
                FormMain.getPercentageField().setEnabled(false);
                FormMain.getAddField().setEnabled(false);
                FormMain.getPaymentBox().setEnabled(false);
                FormMain.getAddTypeBox().setEnabled(false);
                FormMain.getCalcButton().setEnabled(false);
                FormMain.getCapitalCheck().setEnabled(false);
                FormMain.getPDFButton().setEnabled(true);

                FormMain.getOutput()[0] = "Сумма вклада " + sum + " руб.";
                FormMain.getOutput()[1] = "Срок: " + period + " мес.";
                FormMain.getOutput()[2] = "Процентная ставка: " + percentage + "%";
                FormMain.getOutput()[3] = "Периодичность выплат: " + FormMain.getPaymentBox().getSelectedItem();
                FormMain.getOutput()[4] = "Пополнения: " + FormMain.getAddTypeBox().getSelectedItem() + " по " + add + " руб.";
                FormMain.getOutput()[5] = checkText;
                FormMain.getOutput()[6] = "Начисленные проценты: " + round(s-(aInt(sum)+aInt(add)*(aInt(period)/addType-1)), 2) + " руб.";
                FormMain.getOutput()[7] = "Сумма на вкладе к концу срока: " + s + " руб.";

                FormMain.getOutputLabel().setText("" +
                        "<html>" +
                        "Сумма вклада: " + sum + " руб." + "<br>" +
                        "Срок: " + period + " мес." + "<br>" +
                        "Процентная ставка: " + percentage + "%" + "<br>" +
                        "Периодичность выплат: " + FormMain.getPaymentBox().getSelectedItem() + "<br>" +
                        "Пополнения: " + FormMain.getAddTypeBox().getSelectedItem() + " по " + add + " руб." + "<br>" +
                        checkText + "<br>" +
                        "Начисленные проценты: " + round(s-(aInt(sum)+aInt(add)*(aInt(period)/addType-1)), 2) + " руб." + "<br>" +
                        "Сумма на вкладе к концу срока: " + s + " руб." +
                        "</html>"
                );
            }
        }
    }

    /**
     * A int.
     *
     * @param toInt the to int
     * @return the int
     */
    public int aInt(String toInt) {
        return Integer.parseInt(toInt);
    }
    
    /**
     * A double.
     *
     * @param toDouble the to double
     * @return the double
     */
    public double aDouble(String toDouble) {
        return Double.parseDouble(toDouble);
    }
    
    /**
     * Round.
     *
     * @param value the value
     * @param places the places
     * @return the double
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}