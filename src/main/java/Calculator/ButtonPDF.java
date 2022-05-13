package Calculator;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.BaseFont;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

// TODO: Auto-generated Javadoc
/**
 * The Class ButtonPDF.
 * @author Kydyrgychov A.M.
 * @author Yulmukhametov A.S.
 * 
 */
public class ButtonPDF extends Buttons{
    
    /**
     * Action.
     */
    @Override
    public void action() {
        Font font = FontFactory.getFont(String.valueOf(this.getClass().getResource("/ClearSans.ttf")), BaseFont.IDENTITY_H,
                BaseFont.EMBEDDED, 0.8f, Font.NORMAL, BaseColor.BLACK);
        BaseFont baseFont = font.getBaseFont();

        CreatePDF pdf = new CreatePDF("Информация по депозиту.pdf", baseFont);
        pdf.getDocument().addTitle("Депозит");
        try {
            pdf.addText(pdf.getDocument(), "АО \"ФИРТБанк\"", 28, false);
            pdf.addText(pdf.getDocument(), " ", 18, false);
            pdf.addText(pdf.getDocument(), FormMain.getOutput()[0], 18, false);
            pdf.addText(pdf.getDocument(), FormMain.getOutput()[1], 18, false);
            pdf.addText(pdf.getDocument(), FormMain.getOutput()[2], 18, false);
            pdf.addText(pdf.getDocument(), FormMain.getOutput()[3], 18, false);
            pdf.addText(pdf.getDocument(), FormMain.getOutput()[4], 18, false);
            pdf.addText(pdf.getDocument(), FormMain.getOutput()[5], 18, false);
            pdf.addText(pdf.getDocument(), FormMain.getOutput()[6], 18, false);
            pdf.addText(pdf.getDocument(), FormMain.getOutput()[7], 18, false);
            pdf.addPicture(this.getClass().getResource("/firt.jpg").toURI().toURL(), pdf.getDocument(), (int)pdf.getDocument().right()-200, (int)pdf.getDocument().top()-200);
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException e) {
            e.printStackTrace();
        }
        pdf.getClose();
        
       new File("Депозит.pdf");
       
       /** Вывод окна с сообщением о создании файла */
       message("PDF-Документ создан");
    }
}
