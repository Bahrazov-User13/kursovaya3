package Calculator;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The Class StartAppTest.
 */
public class StartAppTest {
    
    /** The main form. */
    private FormMain mainForm;
    
    /** The team form. */
    private FormTeam teamForm;

    /**
     * Main.
     */
    @Test
    public void main() {
        mainForm = new FormMain("Депозитный калькулятор с капитализацией процентов");
        teamForm = new FormTeam("Команда");
    }

    /**
     * Tear down.
     */
    @After
    public void tearDown() {
        assertNotNull(mainForm);
        assertNotNull(teamForm);
    }
}