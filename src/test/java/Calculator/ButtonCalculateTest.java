package Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.Normalizer;

import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ButtonCalculateTest.
 */
public class ButtonCalculateTest {
    
    /** The date. */
    private int date;
    
    /** The add type. */
    private int addType;
    
    /** The s. */
    private double s;

    /**
     * Sets the up.
     */
    @Before
    public void setUp() {
        FormMain.getSumField().setText("100000");
        FormMain.getPeriodField().setText("12");
        FormMain.getPercentageField().setText("10");
        FormMain.getAddField().setText("0");
        FormMain.getCapitalCheck().setSelected(false);
        FormMain.getPaymentBox().setSelectedIndex(0);
        FormMain.getAddTypeBox().setSelectedIndex(0);
    }

    /**
     * Action.
     */
    @Test
    public void action () {
        String sum = FormMain.getSumField().getText();
        String period = FormMain.getPeriodField().getText();
        String percentage = FormMain.getPercentageField().getText();
        String add = FormMain.getAddField().getText();
        boolean check = FormMain.getCapitalCheck().isSelected();
        if (sum.isEmpty() || period.isEmpty() || percentage.isEmpty()) {
            fail("Поля или поле пусты");
        } else {
            if (add.isEmpty()) {
                add = "0";
            }
            switch (FormMain.getPaymentBox().getSelectedIndex()) {
                case 0:
                    date = 1;
                    break;
                case 1:
                    date = 6;
                    break;
                case 2:
                    date = 12;
                    break;
            }
            switch (FormMain.getAddTypeBox().getSelectedIndex()) {
                case 0:
                    addType = 1;
                    break;
                case 1:
                    addType = 6;
                    break;
                case 2:
                    addType = 12;
                    break;
            }
            if (aInt(period) % date != 0) {
                fail("Срок не кратен - " + date);
            } else {
                if (check) {
                    s = aInt(sum) * Math.pow(1 + aDouble(percentage) / 100, (aInt(period) / date)) + aInt(add) * Math.pow(1 + aDouble(percentage) / 100, (aInt(period) / addType));
                } else {
                    s = aInt(sum) + aInt(sum) * (aDouble(percentage) / 100) * (aInt(period) / date) + (aInt(period) / addType) * aInt(add);
                }
                s = round(s, 2);
            }
        }
    }

    /**
     * Tear down.
     */
    @After
    public void tearDown () {
        if (s != 220000.0) {
            fail("Ошибка в расчете");
        }
    }

    /**
     * A int.
     *
     * @param toInt the to int
     * @return the int
     */
    public int aInt (String toInt){
        return Integer.parseInt(toInt);
    }
    
    /**
     * A double.
     *
     * @param toDouble the to double
     * @return the double
     */
    public double aDouble (String toDouble){
        return Double.parseDouble(toDouble);
    }
    
    /**
     * Round.
     *
     * @param value the value
     * @param places the places
     * @return the double
     */
    public static double round ( double value, int places){
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}