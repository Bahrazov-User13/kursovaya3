package Calculator;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.BaseFont;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ButtonPDFTest.
 */
/** Тест проверяющий создание PDF-файла */
public class ButtonPDFTest {
    
    /** The order. */
    File order;

    /**
     * Sets the up.
     */
    
    @Before
    public void setUp() {
        FormMain.getOutput()[0] = "Тестовый текст для записи 1";
        FormMain.getOutput()[1] = "Тестовый текст для записи 2";
        FormMain.getOutput()[2] = "Тестовый текст для записи 3";
        FormMain.getOutput()[3] = "Тестовый текст для записи 4";
        FormMain.getOutput()[4] = "Тестовый текст для записи 5";
        FormMain.getOutput()[5] = "Тестовый текст для записи 6";
        FormMain.getOutput()[6] = "Тестовый текст для записи 7";
        FormMain.getOutput()[7] = "Тестовый текст для записи 8";
    }

    /**
     * Action.
     */
    @Test
    
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
        order = new File("Депозит.pdf");
        
    }

    /**
     * Tear down.
     */
    @After
    public void tearDown() {
        assertNotNull(order);
        
    }
}