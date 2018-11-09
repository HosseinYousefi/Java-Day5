import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderDetectorTest extends TestCase {
    GenderDetector genderDetector;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        genderDetector = new GenderDetector();
    }

    @After
    public void tearDown() throws Exception {
        genderDetector = null;
    }

    @Test
    public void testDetectMaleByName() {
        String gender = genderDetector.detectGenderByName("Hossein");
        assertEquals("male", gender);
    }

    @Test
    public void testDetectFemaleByName() {
        String gender = genderDetector.detectGenderByName("Sabrina");
        assertEquals("female", gender);
    }
}