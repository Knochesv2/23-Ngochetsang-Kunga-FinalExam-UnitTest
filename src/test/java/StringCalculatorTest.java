import org.example.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    private StringCalculator strcal;
    @BeforeEach
    public void setUp() {
        strcal = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        strcal = null;
    }
    @Test
    public void testEmptyString(){

        assert(0,strcal.add())
    }


}
