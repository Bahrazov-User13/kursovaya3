package Calculator;

import javax.swing.*;
import java.text.DecimalFormat;

// TODO: Auto-generated Javadoc
/**
 * The Class NumberField.
 * @author Yulmukhametov A.S.
 */
public class NumberField extends JFormattedTextField{
    
    /**
     * Instantiates a new number field.
     */
    public NumberField() {
        super(new DecimalFormat( "##########.##" ));
    }
}
