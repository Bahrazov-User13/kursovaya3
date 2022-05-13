package Calculator;

import org.junit.After;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ResourceTest.
 */
public class ResourceTest {

/** The font path. */
private URL fontPath;

/** The image path. */
private URL imagePath;

    /**
     * Main.
     *
     * @throws URISyntaxException the URI syntax exception
     * @throws MalformedURLException the malformed URL exception
     */
    @Test
    public void main() throws URISyntaxException, MalformedURLException {
        fontPath = this.getClass().getResource("/ClearSans.ttf");
        imagePath = this.getClass().getResource("/firt.jpg").toURI().toURL();
    }

    /**
     * Tear down.
     */
    @After
    public void tearDown() {
        assertNotNull(fontPath);
        assertNotNull(imagePath);
    }
}